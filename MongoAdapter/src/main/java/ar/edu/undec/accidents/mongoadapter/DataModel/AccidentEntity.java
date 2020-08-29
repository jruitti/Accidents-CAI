package ar.edu.undec.accidents.mongoadapter.DataModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "accidentes")
public class AccidentEntity {

    public AccidentEntity() {
    }

    @Id
    private String ID;
    private String Source;
//    private float TMC;
//    private Integer Severity;
    @Field("Start_Time")
    private String startTime;
//    private LocalDateTime End_Time;
//    private float Start_Lat;
//    private float Start_Lng;
//    private float End_Lat;
//    private float End_Lng;
//    private float Distance;
//    private String Description;
//    private float Number;
//    private String Street;
//    private String Side;
//    private String City;
//    private String County;
//    private String State;
//    private String Zipcode;
//    private String Country;
//    private String Timezone;
//    private String Airport_Code;
//    private LocalDateTime Weather_Timestamp;
//    private float Temperature;
//    private float Wind_Chill;

    private float Humidity;
//    private float Pressure;
//    private float Visibility;
//    private String Wind_Direction;
//    private float Wind_Speed;
//    private float Precipitation;
//    private String Weather_Condition;
//    private boolean Amenity;
//    private boolean Bump;
//    private boolean Crossing;
//    private boolean Give_Way;
//    private boolean Junction;
//    private boolean No_Exit;
//    private boolean Railway;
//    private boolean Roundabout;
//    private boolean Station;
//    private boolean Stop;
//    private boolean Traffic_Calming;
//    private boolean Traffic_Signal;
//    private boolean Turning_Loop;
//    private String Sunrise_Sunset;
//    private String Civil_Twilight;
//    private String Astronomical_Twilight;
//    private String Nautical_Twilight;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public float getHumidity() {
        return Humidity;
    }

    public void setHumidity(float humidity) {
        Humidity = humidity;
    }
    //    public float getTMC() {
//        return TMC;
//    }
//
//    public void setTMC(float TMC) {
//        this.TMC = TMC;
//    }
//
//    public Integer getSeverity() {
//        return Severity;
//    }
//
//    public void setSeverity(Integer severity) {
//        Severity = severity;
//    }
//
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
//
//    public LocalDateTime getEnd_Time() {
//        return End_Time;
//    }
//
//    public void setEnd_Time(LocalDateTime end_Time) {
//        End_Time = end_Time;
//    }
//
//    public float getStart_Lat() {
//        return Start_Lat;
//    }
//
//    public void setStart_Lat(float start_Lat) {
//        Start_Lat = start_Lat;
//    }
//
//    public float getStart_Lng() {
//        return Start_Lng;
//    }
//
//    public void setStart_Lng(float start_Lng) {
//        Start_Lng = start_Lng;
//    }
//
//    public float getEnd_Lat() {
//        return End_Lat;
//    }
//
//    public void setEnd_Lat(float end_Lat) {
//        End_Lat = end_Lat;
//    }
//
//    public float getEnd_Lng() {
//        return End_Lng;
//    }
//
//    public void setEnd_Lng(float end_Lng) {
//        End_Lng = end_Lng;
//    }
//
//    public float getDistance() {
//        return Distance;
//    }
//
//    public void setDistance(float distance) {
//        Distance = distance;
//    }
//
//    public String getDescription() {
//        return Description;
//    }
//
//    public void setDescription(String description) {
//        Description = description;
//    }
//
//    public float getNumber() {
//        return Number;
//    }
//
//    public void setNumber(float number) {
//        Number = number;
//    }
//
//    public String getStreet() {
//        return Street;
//    }
//
//    public void setStreet(String street) {
//        Street = street;
//    }
//
//    public String getSide() {
//        return Side;
//    }
//
//    public void setSide(String side) {
//        Side = side;
//    }
//
//    public String getCity() {
//        return City;
//    }
//
//    public void setCity(String city) {
//        City = city;
//    }
//
//    public String getCounty() {
//        return County;
//    }
//
//    public void setCounty(String county) {
//        County = county;
//    }
//
//    public String getState() {
//        return State;
//    }
//
//    public void setState(String state) {
//        State = state;
//    }
//
//    public String getZipcode() {
//        return Zipcode;
//    }
//
//    public void setZipcode(String zipcode) {
//        Zipcode = zipcode;
//    }
//
//    public String getCountry() {
//        return Country;
//    }
//
//    public void setCountry(String country) {
//        Country = country;
//    }
//
//    public String getTimezone() {
//        return Timezone;
//    }
//
//    public void setTimezone(String timezone) {
//        Timezone = timezone;
//    }
//
//    public String getAirport_Code() {
//        return Airport_Code;
//    }
//
//    public void setAirport_Code(String airport_Code) {
//        Airport_Code = airport_Code;
//    }
//
//    public LocalDateTime getWeather_Timestamp() {
//        return Weather_Timestamp;
//    }
//
//    public void setWeather_Timestamp(LocalDateTime weather_Timestamp) {
//        Weather_Timestamp = weather_Timestamp;
//    }
//
//    public float getTemperature() {
//        return Temperature;
//    }
//
//    public void setTemperature(float temperature) {
//        Temperature = temperature;
//    }
//
//    public float getWind_Chill() {
//        return Wind_Chill;
//    }
//
//    public void setWind_Chill(float wind_Chill) {
//        Wind_Chill = wind_Chill;
//    }
//
//    public float getHumidity() {
//        return Humidity;
//    }
//
//    public void setHumidity(float humidity) {
//        Humidity = humidity;
//    }
//
//    public float getPressure() {
//        return Pressure;
//    }
//
//    public void setPressure(float pressure) {
//        Pressure = pressure;
//    }
//
//    public float getVisibility() {
//        return Visibility;
//    }
//
//    public void setVisibility(float visibility) {
//        Visibility = visibility;
//    }
//
//    public String getWind_Direction() {
//        return Wind_Direction;
//    }
//
//    public void setWind_Direction(String wind_Direction) {
//        Wind_Direction = wind_Direction;
//    }
//
//    public float getWind_Speed() {
//        return Wind_Speed;
//    }
//
//    public void setWind_Speed(float wind_Speed) {
//        Wind_Speed = wind_Speed;
//    }
//
//    public float getPrecipitation() {
//        return Precipitation;
//    }
//
//    public void setPrecipitation(float precipitation) {
//        Precipitation = precipitation;
//    }
//
//    public String getWeather_Condition() {
//        return Weather_Condition;
//    }
//
//    public void setWeather_Condition(String weather_Condition) {
//        Weather_Condition = weather_Condition;
//    }
//
//    public boolean isAmenity() {
//        return Amenity;
//    }
//
//    public void setAmenity(boolean amenity) {
//        Amenity = amenity;
//    }
//
//    public boolean isBump() {
//        return Bump;
//    }
//
//    public void setBump(boolean bump) {
//        Bump = bump;
//    }
//
//    public boolean isCrossing() {
//        return Crossing;
//    }
//
//    public void setCrossing(boolean crossing) {
//        Crossing = crossing;
//    }
//
//    public boolean isGive_Way() {
//        return Give_Way;
//    }
//
//    public void setGive_Way(boolean give_Way) {
//        Give_Way = give_Way;
//    }
//
//    public boolean isJunction() {
//        return Junction;
//    }
//
//    public void setJunction(boolean junction) {
//        Junction = junction;
//    }
//
//    public boolean isNo_Exit() {
//        return No_Exit;
//    }
//
//    public void setNo_Exit(boolean no_Exit) {
//        No_Exit = no_Exit;
//    }
//
//    public boolean isRailway() {
//        return Railway;
//    }
//
//    public void setRailway(boolean railway) {
//        Railway = railway;
//    }
//
//    public boolean isRoundabout() {
//        return Roundabout;
//    }
//
//    public void setRoundabout(boolean roundabout) {
//        Roundabout = roundabout;
//    }
//
//    public boolean isStation() {
//        return Station;
//    }
//
//    public void setStation(boolean station) {
//        Station = station;
//    }
//
//    public boolean isStop() {
//        return Stop;
//    }
//
//    public void setStop(boolean stop) {
//        Stop = stop;
//    }
//
//    public boolean isTraffic_Calming() {
//        return Traffic_Calming;
//    }
//
//    public void setTraffic_Calming(boolean traffic_Calming) {
//        Traffic_Calming = traffic_Calming;
//    }
//
//    public boolean isTraffic_Signal() {
//        return Traffic_Signal;
//    }
//
//    public void setTraffic_Signal(boolean traffic_Signal) {
//        Traffic_Signal = traffic_Signal;
//    }
//
//    public boolean isTurning_Loop() {
//        return Turning_Loop;
//    }
//
//    public void setTurning_Loop(boolean turning_Loop) {
//        Turning_Loop = turning_Loop;
//    }
//
//    public String getSunrise_Sunset() {
//        return Sunrise_Sunset;
//    }
//
//    public void setSunrise_Sunset(String sunrise_Sunset) {
//        Sunrise_Sunset = sunrise_Sunset;
//    }
//
//    public String getCivil_Twilight() {
//        return Civil_Twilight;
//    }
//
//    public void setCivil_Twilight(String civil_Twilight) {
//        Civil_Twilight = civil_Twilight;
//    }
//
//    public String getAstronomical_Twilight() {
//        return Astronomical_Twilight;
//    }
//
//    public void setAstronomical_Twilight(String astronomical_Twilight) {
//        Astronomical_Twilight = astronomical_Twilight;
//    }
//
//    public String getNautical_Twilight() {
//        return Nautical_Twilight;
//    }
//
//    public void setNautical_Twilight(String nautical_Twilight) {
//        Nautical_Twilight = nautical_Twilight;
//    }
}
