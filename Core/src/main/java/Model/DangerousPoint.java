package model;


public class DangerousPoint {


    private Double longitude;
    private Double latitude;
    private Integer amount;

    public DangerousPoint(Double longitude, Double latitude, Integer amount) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.amount = amount;
    }

    public static DangerousPoint factory(Double longitude, Double latitude, Integer amount) {
        return new DangerousPoint(longitude,latitude,amount);
    }

    @Override
    public String toString() {
        return "{\"type\": \"Feature\",\"properties\": {},\"geometry\": {\"type\": \"Point\",\"coordinates\": ["+ longitude+", "+latitude+" ] } }, --"+amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }
}
