package ar.edu.undec.elasticadapter.persistence.datamodel;


import ar.edu.undec.elasticadapter.config.ElasticIndexName;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.geo.Point;


@Document(indexName = ElasticIndexName.indexName)
public class DangerousPointEntity {

    @Id
    private String id;
    @Field("Start_Lat")
    private Double startLat;
    @Field("Start_Lng")
    private Double startLng;
    @Field("amount")
    private Integer amount;
    @Field("Civil_Twilight")
    private String civilTwilight;


    public DangerousPointEntity() {
    }

    public Double getStartLat() {
        return startLat;
    }

    public Double getStartLng() {
        return startLng;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }


    public String getStartLocation() {
        return this.startLat+", "+this.startLng;
    }
}
