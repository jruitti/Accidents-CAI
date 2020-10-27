package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.AverageDistanceEntity;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Repository;
import repository.IAverageDistanceRepository;

import java.util.List;

@Repository
public class AverageDistanceRepoImplementation implements IAverageDistanceRepository {

    private final MongoTemplate mongoTemplate;

    public AverageDistanceRepoImplementation(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Double queryAverageDistance() {
        BasicQuery basicQuery = new BasicQuery("{End_Lat: { $ne: null }})");
        List<AverageDistanceEntity> retrieved = mongoTemplate.find(basicQuery, AverageDistanceEntity.class);

        Double averageDouble=retrieved.parallelStream().map(
                anAccident->{
                    anAccident.setDistance(Double.valueOf(distance(anAccident.getStartLocation().getX(), anAccident.getStartLocation().getY(), anAccident.getEndLocation().getX(), anAccident.getEndLocation().getY(),"K")));
                    return anAccident;
                })
                .mapToDouble(AverageDistanceEntity::getDistance)
                .average()
                .orElse(Double.valueOf(0));

        return averageDouble;
    }

    private static double distance(double longitude1, double latitude1, double longitude2, double latitude2, String unit) {
        if ((latitude1 == latitude2) && (longitude1 == longitude2)) {
            return 0;
        }
        else {
            double theta = longitude1 - longitude2;
            double dist = Math.sin(Math.toRadians(latitude1)) * Math.sin(Math.toRadians(latitude2)) + Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            if (unit.equals("K")) {
                dist = dist * 1.609344;
            } else if (unit.equals("N")) {
                dist = dist * 0.8684;
            }
            return (dist);
        }
    }
}