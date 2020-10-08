package ar.edu.undec.elasticadapter.persistence.datamodel;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;


@Document(indexName="accidentes_db")
public class AccidentEntity {

    public AccidentEntity() {
    }

    @Id
    private String id;
    @Field("Source")
    private String source;
    @Field("TMC")
    private Float tmc;
    @Field("Severity")
    private Integer severity;
    @Field("Start_Time")
    private String startTime;
    @Field("End_Time")
    private String endTime;
    @Field("Weather_Timestamp")
    private String weatherTimestamp;
    @Field("Start_Lat")
    private Float startLat;
    @Field("Start_Lng")
    private Float startLng;
    @Field("End_Lat")
    private Float endLat;
    @Field("End_Lng")
    private Float endLng;
    @Field("Distance")
    private Float distance;
    @Field("Number")
    private Float number;
    @Field("Street")
    private String street;
    @Field("Side")
    private String side;
    @Field("City")
    private String city;
    @Field("County")
    private String county;
    @Field("State")
    private String state;
    @Field("Zipcode")
    private String zipcode;
    @Field("Country")
    private String country;
    @Field("Timezone")
    private String timezone;
    @Field("Airport_Code")
    private String airportCode;
    @Field("Temperature")
    private Float temperature;
    @Field("Wind_Chill")
    private Float windChill;
    @Field("Humidity")
    private Float humidity;
    @Field("Pressure")
    private Float pressure;
    @Field("Visibility")
    private Float visibility;
    @Field("Wind_Direction")
    private String windDirection;
    @Field("Wind_Speed")
    private Float windSpeed;
    @Field("Precipitation")
    private Float precipitation;
    @Field("Weather_Condition")
    private String weatherCondition;
    @Field("Amenity")
    private boolean amenity;
    @Field("Bump")
    private boolean bump;
    @Field("Crossing")
    private boolean crossing;
    @Field("Give_Way")
    private boolean giveWay;
    @Field("Junction")
    private boolean junction;
    @Field("No_Exit")
    private boolean noExit;
    @Field("Railway")
    private boolean railway;
    @Field("Roundabout")
    private boolean roundabout;
    @Field("Station")
    private boolean station;
    @Field("Stop")
    private boolean stop;
    @Field("Traffic_Calming")
    private boolean trafficCalming;
    @Field("Traffic_Signal")
    private boolean trafficSignal;
    @Field("Turning_Loop")
    private boolean turningLoop;
    @Field("Sunrise_Sunset")
    private String sunriseSunset;
    @Field("Civil_Twilight")
    private String civilTwilight;
    @Field("Astronomical_Twilight")
    private String astronomicalTwilight;
    @Field("Nautical_Twilight")
    private String nauticalTwilight;
    @Field("Description")
    private String description;

    public String getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public Float getTmc() {
        return tmc;
    }

    public Integer getSeverity() {
        return severity;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getWeatherTimestamp() {
        return weatherTimestamp;
    }

    public Float getStartLat() {
        return startLat;
    }

    public Float getStartLng() {
        return startLng;
    }

    public Float getEndLat() {
        return endLat;
    }

    public Float getEndLng() {
        return endLng;
    }

    public Float getDistance() {
        return distance;
    }

    public Float getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getSide() {
        return side;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCountry() {
        return country;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getWindChill() {
        return windChill;
    }

    public Float getHumidity() {
        return humidity;
    }

    public Float getPressure() {
        return pressure;
    }

    public Float getVisibility() {
        return visibility;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public Float getPrecipitation() {
        return precipitation;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public boolean isAmenity() {
        return amenity;
    }

    public boolean isBump() {
        return bump;
    }

    public boolean isCrossing() {
        return crossing;
    }

    public boolean isGiveWay() {
        return giveWay;
    }

    public boolean isJunction() {
        return junction;
    }

    public boolean isNoExit() {
        return noExit;
    }

    public boolean isRailway() {
        return railway;
    }

    public boolean isRoundabout() {
        return roundabout;
    }

    public boolean isStation() {
        return station;
    }

    public boolean isStop() {
        return stop;
    }

    public boolean isTrafficCalming() {
        return trafficCalming;
    }

    public boolean isTrafficSignal() {
        return trafficSignal;
    }

    public boolean isTurningLoop() {
        return turningLoop;
    }

    public String getSunriseSunset() {
        return sunriseSunset;
    }

    public String getCivilTwilight() {
        return civilTwilight;
    }

    public String getAstronomicalTwilight() {
        return astronomicalTwilight;
    }

    public String getNauticalTwilight() {
        return nauticalTwilight;
    }

    public String getDescription() {
        return description;
    }

}
