package model;

import java.time.LocalDateTime;

public class Accident {

    //pruebas. Luego se borra
    public Accident(String id, String source, float humidity, LocalDateTime startTime) {
        this.id = id;
        this.source = source;
        this.humidity = humidity;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return this.id + " " + this.source + " " + this.humidity;
    }

    public static Accident emptyfactory(String id, String source, float humidity, LocalDateTime startTime) {
        return new Accident(id, source, humidity, startTime);
    }
    //fin Pruebas

    public static Accident factory(String id, String source, float tmc, Integer severity, LocalDateTime startTime, LocalDateTime endTime, float startLat, float startLng, float endLat, float endLng, float distance, String description, float number, String street, String side, String city, String county, String state, String zipcode, String country, String timezone, String airport_Code, LocalDateTime weatherTimestamp, float temperature, float windChill, float humidity, float pressure, float visibility, String windDirection, float windSpeed, float precipitation, String weatherCondition, boolean amenity, boolean bump, boolean crossing, boolean giveWay, boolean junction, boolean noExit, boolean railway, boolean roundabout, boolean station, boolean stop, boolean trafficCalming, boolean trafficSignal, boolean turningLoop, String sunriseSunset, String civilTwilight, String astronomicalTwilight, String nauticalTwilight) {
        return new Accident(id, source, tmc, severity, startTime, endTime, weatherTimestamp, startLat, startLng, endLat, endLng, distance, number, street, side, city, county, state, zipcode, country, timezone, airport_Code, temperature, windChill, humidity, pressure, visibility, windDirection, windSpeed, precipitation, weatherCondition, amenity, bump, crossing, giveWay, junction, noExit, railway, roundabout, station, stop, trafficCalming, trafficSignal, turningLoop, sunriseSunset, civilTwilight, astronomicalTwilight, nauticalTwilight, description);
    }


    public Accident() {

    }

    private Accident(String id, String source, float tmc, Integer severity, LocalDateTime startTime, LocalDateTime endTime, LocalDateTime weatherTimestamp, float startLat, float startLng, float endLat, float endLng, float distance, float number, String street, String side, String city, String county, String state, String zipcode, String country, String timezone, String airportCode, float temperature, float windChill, float humidity, float pressure, float visibility, String windDirection, float windSpeed, float precipitation, String weatherCondition, boolean amenity, boolean bump, boolean crossing, boolean giveWay, boolean junction, boolean noExit, boolean railway, boolean roundabout, boolean station, boolean stop, boolean trafficCalming, boolean trafficSignal, boolean turningLoop, String sunriseSunset, String civilTwilight, String astronomicalTwilight, String nauticalTwilight, String description) {
        this.id = id;
        this.source = source;
        this.tmc = tmc;
        this.severity = severity;
        this.startTime = startTime;
        this.endTime = endTime;
        this.weatherTimestamp = weatherTimestamp;
        this.startLat = startLat;
        this.startLng = startLng;
        this.endLat = endLat;
        this.endLng = endLng;
        this.distance = distance;
        this.number = number;
        this.street = street;
        this.side = side;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
        this.timezone = timezone;
        this.airportCode = airportCode;
        this.temperature = temperature;
        this.windChill = windChill;
        this.humidity = humidity;
        this.pressure = pressure;
        this.visibility = visibility;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.precipitation = precipitation;
        this.weatherCondition = weatherCondition;
        this.amenity = amenity;
        this.bump = bump;
        this.crossing = crossing;
        this.giveWay = giveWay;
        this.junction = junction;
        this.noExit = noExit;
        this.railway = railway;
        this.roundabout = roundabout;
        this.station = station;
        this.stop = stop;
        this.trafficCalming = trafficCalming;
        this.trafficSignal = trafficSignal;
        this.turningLoop = turningLoop;
        this.sunriseSunset = sunriseSunset;
        this.civilTwilight = civilTwilight;
        this.astronomicalTwilight = astronomicalTwilight;
        this.nauticalTwilight = nauticalTwilight;
        this.description = description;
    }

    private String id;
    private String source;
    private float tmc;
    private Integer severity;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime weatherTimestamp;
    private float startLat;
    private float startLng;
    private float endLat;
    private float endLng;
    private float distance;
    private float number;
    private String street;
    private String side;
    private String city;
    private String county;
    private String state;
    private String zipcode;
    private String country;
    private String timezone;
    private String airportCode;
    private float temperature;
    private float windChill;
    private float humidity;
    private float pressure;
    private float visibility;
    private String windDirection;
    private float windSpeed;
    private float precipitation;
    private String weatherCondition;
    private boolean amenity;
    private boolean bump;
    private boolean crossing;
    private boolean giveWay;
    private boolean junction;
    private boolean noExit;
    private boolean railway;
    private boolean roundabout;
    private boolean station;
    private boolean stop;
    private boolean trafficCalming;
    private boolean trafficSignal;
    private boolean turningLoop;
    private String sunriseSunset;
    private String civilTwilight;
    private String astronomicalTwilight;
    private String nauticalTwilight;
    private String description;

    public String getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public float getTmc() {
        return tmc;
    }

    public Integer getSeverity() {
        return severity;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public LocalDateTime getWeatherTimestamp() {
        return weatherTimestamp;
    }

    public float getStartLat() {
        return startLat;
    }

    public float getStartLng() {
        return startLng;
    }

    public float getEndLat() {
        return endLat;
    }

    public float getEndLng() {
        return endLng;
    }

    public float getDistance() {
        return distance;
    }

    public float getNumber() {
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

    public float getTemperature() {
        return temperature;
    }

    public float getWindChill() {
        return windChill;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getVisibility() {
        return visibility;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public float getPrecipitation() {
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
