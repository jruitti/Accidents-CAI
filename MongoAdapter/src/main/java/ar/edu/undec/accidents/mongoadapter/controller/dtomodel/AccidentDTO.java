package ar.edu.undec.accidents.mongoadapter.controller.dtomodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class AccidentDTO {

    public AccidentDTO(@JsonProperty("id") String id,
                       @JsonProperty("source") String source,
                       @JsonProperty("tmc") Float tmc,
                       @JsonProperty("severity") Integer severity,
                       @JsonProperty("startTime") LocalDateTime startTime,
                       @JsonProperty("endTime") LocalDateTime endTime,
                       @JsonProperty("weatherTimestamp") LocalDateTime weatherTimestamp,
                       @JsonProperty("startLat") Float startLat,
                       @JsonProperty("startLng") Float startLng,
                       @JsonProperty("endLat") Float endLat,
                       @JsonProperty("endLng") Float endLng,
                       @JsonProperty("distance") Float distance,
                       @JsonProperty("number") Float number,
                       @JsonProperty("street") String street,
                       @JsonProperty("side") String side,
                       @JsonProperty("city") String city,
                       @JsonProperty("county") String county,
                       @JsonProperty("state") String state,
                       @JsonProperty("zipcode") String zipcode,
                       @JsonProperty("country") String country,
                       @JsonProperty("timezone") String timezone,
                       @JsonProperty("airportCode") String airportCode,
                       @JsonProperty("temperature") Float temperature,
                       @JsonProperty("windChill") Float windChill,
                       @JsonProperty("humidity") Float humidity,
                       @JsonProperty("pressure") Float pressure,
                       @JsonProperty("visibility") Float visibility,
                       @JsonProperty("windDirection") String windDirection,
                       @JsonProperty("windSpeed") Float windSpeed,
                       @JsonProperty("precipitation") Float precipitation,
                       @JsonProperty("weatherCondition") String weatherCondition,
                       @JsonProperty("amenity") boolean amenity,
                       @JsonProperty("bump") boolean bump,
                       @JsonProperty("crossing") boolean crossing,
                       @JsonProperty("giveWay") boolean giveWay,
                       @JsonProperty("junction") boolean junction,
                       @JsonProperty("noExit") boolean noExit,
                       @JsonProperty("railway") boolean railway,
                       @JsonProperty("roundabout") boolean roundabout,
                       @JsonProperty("station") boolean station,
                       @JsonProperty("stop") boolean stop,
                       @JsonProperty("trafficCalming") boolean trafficCalming,
                       @JsonProperty("trafficSignal") boolean trafficSignal,
                       @JsonProperty("turningLoop") boolean turningLoop,
                       @JsonProperty("sunriseSunset") String sunriseSunset,
                       @JsonProperty("civilTwilight") String civilTwilight,
                       @JsonProperty("astronomicalTwilight") String astronomicalTwilight,
                       @JsonProperty("nauticalTwilight") String nauticalTwilight,
                       @JsonProperty("description") String description) {
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

    @JsonProperty("id")
    private String id;
    @JsonProperty("source")
    private String source;
    @JsonProperty("tmc")
    private Float tmc;
    @JsonProperty("severity")
    private Integer severity;
    @JsonProperty("startTime")
    private LocalDateTime startTime;
    @JsonProperty("endTime")
    private LocalDateTime endTime;
    @JsonProperty("weatherTimestamp")
    private LocalDateTime weatherTimestamp;
    @JsonProperty("startLat")
    private Float startLat;
    @JsonProperty("startLng")
    private Float startLng;
    @JsonProperty("endLat")
    private Float endLat;
    @JsonProperty("endLng")
    private Float endLng;
    @JsonProperty("distance")
    private Float distance;
    @JsonProperty("number")
    private Float number;
    @JsonProperty("street")
    private String street;
    @JsonProperty("side")
    private String side;
    @JsonProperty("city")
    private String city;
    @JsonProperty("county")
    private String county;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("airportCode")
    private String airportCode;
    @JsonProperty("temperature")
    private Float temperature;
    @JsonProperty("windChill")
    private Float windChill;
    @JsonProperty("humidity")
    private Float humidity;
    @JsonProperty("pressure")
    private Float pressure;
    @JsonProperty("visibility")
    private Float visibility;
    @JsonProperty("windDirection")
    private String windDirection;
    @JsonProperty("windSpeed")
    private Float windSpeed;
    @JsonProperty("precipitation")
    private Float precipitation;
    @JsonProperty("weatherCondition")
    private String weatherCondition;
    @JsonProperty("amenity")
    private boolean amenity;
    @JsonProperty("bump")
    private boolean bump;
    @JsonProperty("crossing")
    private boolean crossing;
    @JsonProperty("giveWay")
    private boolean giveWay;
    @JsonProperty("junction")
    private boolean junction;
    @JsonProperty("noExit")
    private boolean noExit;
    @JsonProperty("railway")
    private boolean railway;
    @JsonProperty("roundabout")
    private boolean roundabout;
    @JsonProperty("station")
    private boolean station;
    @JsonProperty("stop")
    private boolean stop;
    @JsonProperty("trafficCalming")
    private boolean trafficCalming;
    @JsonProperty("trafficSignal")
    private boolean trafficSignal;
    @JsonProperty("turningLoop")
    private boolean turningLoop;
    @JsonProperty("sunriseSunset")
    private String sunriseSunset;
    @JsonProperty("civilTwilight")
    private String civilTwilight;
    @JsonProperty("astronomicalTwilight")
    private String astronomicalTwilight;
    @JsonProperty("nauticalTwilight")
    private String nauticalTwilight;
    @JsonProperty("description")
    private String description;
}
