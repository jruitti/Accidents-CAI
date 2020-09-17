package ar.edu.undec.accidents.mongoadapter.controller.dtomodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DangerousPointDTO {

    @JsonProperty("longitude")
    private Float longitude;
    @JsonProperty("latitude")
    private Float latitude;
    @JsonProperty("amount")
    private Integer amount;

    public DangerousPointDTO(
            @JsonProperty("longitude") Float longitude,
            @JsonProperty("latitude") Float latitude,
            @JsonProperty("amount") Integer amount) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.amount = amount;
    }

    public Float getLongitude() {
        return longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Integer getAmount() {
        return amount;
    }
}
