package ar.edu.undec.accidents.mongoadapter.persistence.datamodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "accidentes")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccidentEntity {

    public AccidentEntity() {
    }

    @Id
    @Field("ID")
    private String id;
    @Field("Source")
    private String source;
    @Field("TMC")
    private Float tmc;
    @Field("Severity")
    private Integer severity;
    @Field("Start_Time")
    @Indexed
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

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Float getTmc() {
        return tmc;
    }

    public void setTmc(Float tmc) {
        this.tmc = tmc;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getWeatherTimestamp() {
        return weatherTimestamp;
    }

    public void setWeatherTimestamp(String weatherTimestamp) {
        this.weatherTimestamp = weatherTimestamp;
    }

    public Float getStartLat() {
        return startLat;
    }

    public void setStartLat(Float startLat) {
        this.startLat = startLat;
    }

    public Float getStartLng() {
        return startLng;
    }

    public void setStartLng(Float startLng) {
        this.startLng = startLng;
    }

    public Float getEndLat() {
        return endLat;
    }

    public void setEndLat(Float endLat) {
        this.endLat = endLat;
    }

    public Float getEndLng() {
        return endLng;
    }

    public void setEndLng(Float endLng) {
        this.endLng = endLng;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getWindChill() {
        return windChill;
    }

    public void setWindChill(Float windChill) {
        this.windChill = windChill;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Float getVisibility() {
        return visibility;
    }

    public void setVisibility(Float visibility) {
        this.visibility = visibility;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Float getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Float precipitation) {
        this.precipitation = precipitation;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public boolean isAmenity() {
        return amenity;
    }

    public void setAmenity(boolean amenity) {
        this.amenity = amenity;
    }

    public boolean isBump() {
        return bump;
    }

    public void setBump(boolean bump) {
        this.bump = bump;
    }

    public boolean isCrossing() {
        return crossing;
    }

    public void setCrossing(boolean crossing) {
        this.crossing = crossing;
    }

    public boolean isGiveWay() {
        return giveWay;
    }

    public void setGiveWay(boolean giveWay) {
        this.giveWay = giveWay;
    }

    public boolean isJunction() {
        return junction;
    }

    public void setJunction(boolean junction) {
        this.junction = junction;
    }

    public boolean isNoExit() {
        return noExit;
    }

    public void setNoExit(boolean noExit) {
        this.noExit = noExit;
    }

    public boolean isRailway() {
        return railway;
    }

    public void setRailway(boolean railway) {
        this.railway = railway;
    }

    public boolean isRoundabout() {
        return roundabout;
    }

    public void setRoundabout(boolean roundabout) {
        this.roundabout = roundabout;
    }

    public boolean isStation() {
        return station;
    }

    public void setStation(boolean station) {
        this.station = station;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public boolean isTrafficCalming() {
        return trafficCalming;
    }

    public void setTrafficCalming(boolean trafficCalming) {
        this.trafficCalming = trafficCalming;
    }

    public boolean isTrafficSignal() {
        return trafficSignal;
    }

    public void setTrafficSignal(boolean trafficSignal) {
        this.trafficSignal = trafficSignal;
    }

    public boolean isTurningLoop() {
        return turningLoop;
    }

    public void setTurningLoop(boolean turningLoop) {
        this.turningLoop = turningLoop;
    }

    public String getSunriseSunset() {
        return sunriseSunset;
    }

    public void setSunriseSunset(String sunriseSunset) {
        this.sunriseSunset = sunriseSunset;
    }

    public String getCivilTwilight() {
        return civilTwilight;
    }

    public void setCivilTwilight(String civilTwilight) {
        this.civilTwilight = civilTwilight;
    }

    public String getAstronomicalTwilight() {
        return astronomicalTwilight;
    }

    public void setAstronomicalTwilight(String astronomicalTwilight) {
        this.astronomicalTwilight = astronomicalTwilight;
    }

    public String getNauticalTwilight() {
        return nauticalTwilight;
    }

    public void setNauticalTwilight(String nauticalTwilight) {
        this.nauticalTwilight = nauticalTwilight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
