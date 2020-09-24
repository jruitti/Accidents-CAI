package ar.edu.undec.accidents.mongoadapter.persistence.datamodel;

import ar.edu.undec.accidents.mongoadapter.controller.config.MongoCollection;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(MongoCollection.collectionName)
public class AverageDistanceEntity {

    @Id
    private Object id;
    @Field("start_location")
    private Point startLocation;
    @Field("end_location")
    private Point endLocation;
    @Field("distance")
    private Double distance;

    public Double getDistance() {
        return distance;
    }

    public Point getStartLocation() {
        return startLocation;
    }

    public Point getEndLocation() {
        return endLocation;
    }

    public void setDistance(Double distanceValue) {
        this.distance=distanceValue;
    }
}
