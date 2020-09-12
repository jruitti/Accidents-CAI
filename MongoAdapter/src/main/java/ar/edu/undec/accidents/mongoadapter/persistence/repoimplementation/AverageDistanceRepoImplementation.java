package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.controller.config.MongoCollection;
import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.AverageDistanceEntity;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;
import repository.IAverageDistanceRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

@Repository
public class AverageDistanceRepoImplementation implements IAverageDistanceRepository {

    private final MongoTemplate mongoTemplate;

    public AverageDistanceRepoImplementation(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Float queryAverageDistance() {
        MatchOperation matchOperation= match(new Criteria("Distance(mi)").gt(0));
        GroupOperation groupOperation = group().avg("Distance(mi)").as("distance");

        Aggregation aggregation = newAggregation(matchOperation,groupOperation);
        AggregationResults<AverageDistanceEntity> result = mongoTemplate.aggregate(aggregation, MongoCollection.collectionName,AverageDistanceEntity.class);

        List<AverageDistanceEntity> lista=result.getMappedResults().stream().collect(Collectors.toCollection(ArrayList::new));
        return lista.get(0).getDistance()*1609;
    }
}