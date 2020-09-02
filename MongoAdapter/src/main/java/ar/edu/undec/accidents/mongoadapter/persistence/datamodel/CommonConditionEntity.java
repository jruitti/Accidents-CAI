package ar.edu.undec.accidents.mongoadapter.persistence.datamodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "accidentes")
public class CommonConditionEntity {

    @Id
    private String id;
    @Field("civil")
    private String civilTwilight;
    @Field("weather")
    private String weatherCondition;
    @Field("precipitation")
    private String precipitation;

    public CommonConditionEntity() {

    }

    public String getCivilTwilight() {
        return civilTwilight;
    }

    public void setCivilTwilight(String civilTwilight) {
        this.civilTwilight = civilTwilight;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
