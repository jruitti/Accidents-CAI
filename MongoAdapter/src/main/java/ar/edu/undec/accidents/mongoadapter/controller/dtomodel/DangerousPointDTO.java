package ar.edu.undec.accidents.mongoadapter.controller.dtomodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DangerousPointDTO {

    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("amount")
    private Integer amount;

    public DangerousPointDTO(
            @JsonProperty("longitude") Double longitude,
            @JsonProperty("latitude") Double latitude,
            @JsonProperty("amount") Integer amount) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "{\"type\": \"Feature\",\"properties\": {},\"geometry\": {\"type\": \"Point\",\"coordinates\": ["+ longitude+", "+latitude+" ] } }, --"+amount;
    }
}
