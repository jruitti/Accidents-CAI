package ar.edu.undec.accidents.mongoadapter.persistence.datamodel;

import ar.edu.undec.accidents.mongoadapter.controller.config.MongoCollection;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = MongoCollection.collectionName)
public class DangerousPointEntity {

    @Id
    private String id;
    @Field("start_location")
    private Point startLocation;
    @Field("amount")
    private Integer amount;

    public DangerousPointEntity() {
    }

    public Point getStartLocation() {
        return startLocation;
    }

    public Integer getAmount() {
        return amount;
    }
}
