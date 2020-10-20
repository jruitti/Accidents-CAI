package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.controller.config.MongoCollection;
import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.DangerousPointEntity;
import model.DangerousPoint;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.LimitOperation;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Service;
import repository.IDangerousPointRepository;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

@Service
public class DangerousPointRepoImplementation implements IDangerousPointRepository {


    private final MongoTemplate mongoTemplate;

    public DangerousPointRepoImplementation(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Collection<DangerousPoint> getDangerousPoints(float radiusInKm) {
        return generateReverseSortedDangerousPointList(getListOfCoordinates(), radiusInKm);
    }

    private List<DangerousPoint> generateReverseSortedDangerousPointList(AggregationResults<DangerousPointEntity> distinctCoordinates, float radiusInKm) {
        List<DangerousPoint> dangerousPointsList = distinctCoordinates.getMappedResults().parallelStream().map(accident -> {
            BasicQuery accidentInRadius = new BasicQuery("{start_location: { $geoWithin: { $centerSphere: [ [" + accident.getStartLocation().getX() + "," + accident.getStartLocation().getY() + "], " + convertToRadiansInString(radiusInKm) + "] }}})");
            return DangerousPoint.factory(accident.getStartLocation().getX(), accident.getStartLocation().getY(), (int) mongoTemplate.count(accidentInRadius, DangerousPointEntity.class));
        }).sorted(Comparator.comparing(DangerousPoint::getAmount).reversed()).collect(Collectors.toCollection(ArrayList::new));
        return dangerousPointsList;
    }

    private AggregationResults<DangerousPointEntity> getListOfCoordinates() {
        GroupOperation groupOperation = group("start_location").first("start_location").as("start_location");
        LimitOperation limitOperation= limit(100000);
        Aggregation aggregation = newAggregation(limitOperation, groupOperation).withOptions(newAggregationOptions().allowDiskUse(true).build());
        AggregationResults<DangerousPointEntity> distinctCoordinates = mongoTemplate.aggregate(aggregation, MongoCollection.collectionName, DangerousPointEntity.class);
        return distinctCoordinates;
    }


    private String convertToRadiansInString(float radiusInKm) {
        DecimalFormat tenDecimalNumber = new DecimalFormat("#.###########");
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        tenDecimalNumber.setDecimalFormatSymbols(decimalFormatSymbols);
        return tenDecimalNumber.format(radiusInKm / 6371);
    }
}
