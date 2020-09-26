package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.controller.config.MongoCollection;
import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.DangerousPointEntity;
import model.DangerousPoint;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
import repository.IDangerousPointRepository;

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

        GroupOperation groupOperation = group("start_location").first("start_location").as("start_location");
        Aggregation aggregation = newAggregation(groupOperation).withOptions(newAggregationOptions().allowDiskUse(true).build());
        StopWatch watch = new StopWatch();
        watch.start("getAllCoordinatesDistinct");
        AggregationResults<DangerousPointEntity> distinctCoordinates = mongoTemplate.aggregate(aggregation, MongoCollection.collectionName, DangerousPointEntity.class);
        watch.stop();

        watch.start("retrieve con cuenta");
        List<DangerousPoint> dangerousPointsList = distinctCoordinates.getMappedResults().parallelStream().map(accident -> {
            BasicQuery queryConCuenta = new BasicQuery("{start_location: { $geoWithin: { $centerSphere: [ [" + accident.getStartLocation().getX() + "," + accident.getStartLocation().getY() + "], " + Math.round(radiusInKm / 6371) + "] }}})");
            return DangerousPoint.factory(accident.getStartLocation().getX(), accident.getStartLocation().getY(), (int) mongoTemplate.count(queryConCuenta, DangerousPointEntity.class));
        }).collect(Collectors.toCollection(ArrayList::new));
        watch.stop();
//
//        watch.start("retrieve con mapeo");
//        List<DangerousPoint> dangerousPointsList = distinctCoordinates.getMappedResults().parallelStream().map(accident -> {
//            BasicQuery queryConMapeo = new BasicQuery("{start_location: { $geoWithin: { $centerSphere: [ [" + accident.getStartLocation().getX() + "," + accident.getStartLocation().getY() + "], " + Math.round(radiusInKm / 6371) + "] }}})");
//            List<DangerousPointEntity> accidentsInRadius = mongoTemplate.find(queryConMapeo, DangerousPointEntity.class);
//            return DangerousPoint.factory(accident.getStartLocation().getX(), accident.getStartLocation().getY(), accidentsInRadius.size());
//        }).collect(Collectors.toCollection(ArrayList::new));
//        watch.stop();


        watch.start("sort");
        dangerousPointsList.sort(Comparator.comparing(DangerousPoint::getAmount).reversed());
        watch.stop();
        System.out.println(watch.prettyPrint());
        System.out.println(dangerousPointsList.get(0));
        System.out.println(dangerousPointsList.get(1));
        System.out.println(dangerousPointsList.get(2));
        System.out.println(dangerousPointsList.get(3));
        System.out.println(dangerousPointsList.get(4));
        return dangerousPointsList;


//        dangerousPointsList=accidentsInRadius.stream()
//                .map(anAccident->DangerousPoint.factory(anAccident.getLongitude(),anAccident.getLatitude(),anAccident.getAmount()))
//                .collect(Collectors.toCollection(ArrayList::new));
//        mongoTemplate.mapReduce(MongoCollection.collectionName,carMap,carReduce,DangerousPointEntity.class).forEach(
//                System.out::println
//        );
//        String carReduce = "function (key,acc){return acc}";
//        String carMap = "function(){emit(this._id,{latitude:this.Start_Lat,longitude:this.Start_Lng,amount:1})}";
    }
}
