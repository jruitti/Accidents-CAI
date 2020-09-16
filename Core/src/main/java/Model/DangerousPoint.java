package model;

public class DangerousPoint {


    private Float longitude;
    private Float latitude;
    private Integer amount;

    public DangerousPoint(Float longitude, Float latitude, Integer amount) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.amount = amount;
    }

    public static DangerousPoint factory(Float longitude, Float latitude, Integer amount) {
        return new DangerousPoint(longitude,latitude,amount);
    }

    @Override
    public String toString() {
        return "{\"type\": \"Feature\",\"properties\": {},\"geometry\": {\"type\": \"Point\",\"coordinates\": ["+ longitude+", "+latitude+" ] } }, --"+amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public Float getLongitude() {
        return longitude;
    }

    public Float getLatitude() {
        return latitude;
    }
}
