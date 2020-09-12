package ar.edu.undec.accidents.mongoadapter.persistence.datamodel;

import org.springframework.data.annotation.Id;

public class AverageDistanceEntity {

    @Id
    private Object id;
    private Float distance;

    public Float getDistance() {
        return distance;
    }
}
