package Model;

import java.time.LocalDateTime;

public class Accident {

    //pruebas. Luego se borra
    public Accident(String id, String source, float humidity) {
        ID = id;
        Source = source;
        Humidity = humidity;
    }

    @Override
    public String toString() {
        return this.ID + " "+ this.Source+" "+this.Humidity;
    }
    public static Accident emptyfactory(String id, String source, float humidity) {
        return new Accident(id, source,humidity);
    }
    //fin Pruebas

    public static Accident factory(String ID, String source, float TMC, Integer severity, LocalDateTime start_Time, LocalDateTime end_Time, float start_Lat, float start_Lng, float end_Lat, float end_Lng, float distance, String description, float number, String street, String side, String city, String county, String state, String zipcode, String country, String timezone, String airport_Code, LocalDateTime weather_Timestamp, float temperature, float wind_Chill, float humidity, float pressure, float visibility, String wind_Direction, float wind_Speed, float precipitation, String weather_Condition, boolean amenity, boolean bump, boolean crossing, boolean give_Way, boolean junction, boolean no_Exit, boolean railway, boolean roundabout, boolean station, boolean stop, boolean traffic_Calming, boolean traffic_Signal, boolean turning_Loop, String sunrise_Sunset, String civil_Twilight, String astronomical_Twilight, String nautical_Twilight) {
        return new Accident(ID, source, TMC, severity, start_Time, end_Time, start_Lat, start_Lng, end_Lat, end_Lng, distance,  description, number, street, side, city, county, state, zipcode, country, timezone, airport_Code, weather_Timestamp, temperature, wind_Chill, humidity, pressure, visibility, wind_Direction, wind_Speed, precipitation, weather_Condition, amenity, bump, crossing, give_Way, junction, no_Exit, railway, roundabout, station, stop, traffic_Calming, traffic_Signal, turning_Loop,sunrise_Sunset,  civil_Twilight,  astronomical_Twilight,  nautical_Twilight);
    }




    public Accident() {

    }
    public Accident(String id, String source, float tmc, Integer severity, LocalDateTime start_Time, LocalDateTime end_Time, float start_Lat, float start_Lng, float end_Lat, float end_Lng, float distance, String description, float number, String street, String side, String city, String county, String state, String zipcode, String country, String timezone, String airport_Code, LocalDateTime weather_Timestamp, float temperature, float wind_Chill, float humidity, float pressure, float visibility, String wind_Direction, float wind_Speed, float precipitation, String weather_Condition, boolean amenity, boolean bump, boolean crossing, boolean give_Way, boolean junction, boolean no_Exit, boolean railway, boolean roundabout, boolean station, boolean stop, boolean traffic_Calming, boolean traffic_Signal, boolean turning_Loop, String sunrise_Sunset, String civil_Twilight, String astronomical_Twilight, String nautical_Twilight) {
        ID = id;
        Source = source;
        TMC = tmc;
        Severity = severity;
        Start_Time = start_Time;
        End_Time = end_Time;
        Start_Lat = start_Lat;
        Start_Lng = start_Lng;
        End_Lat = end_Lat;
        End_Lng = end_Lng;
        Distance = distance;
        Description = description;
        Number = number;
        Street = street;
        Side = side;
        City = city;
        County = county;
        State = state;
        Zipcode = zipcode;
        Country = country;
        Timezone = timezone;
        Airport_Code = airport_Code;
        Weather_Timestamp = weather_Timestamp;
        Temperature = temperature;
        Wind_Chill = wind_Chill;
        Humidity = humidity;
        Pressure = pressure;
        Visibility = visibility;
        Wind_Direction = wind_Direction;
        Wind_Speed = wind_Speed;
        Precipitation = precipitation;
        Weather_Condition = weather_Condition;
        Amenity = amenity;
        Bump = bump;
        Crossing = crossing;
        Give_Way = give_Way;
        Junction = junction;
        No_Exit = no_Exit;
        Railway = railway;
        Roundabout = roundabout;
        Station = station;
        Stop = stop;
        Traffic_Calming = traffic_Calming;
        Traffic_Signal = traffic_Signal;
        Turning_Loop = turning_Loop;
        Sunrise_Sunset = sunrise_Sunset;
        Civil_Twilight = civil_Twilight;
        Astronomical_Twilight = astronomical_Twilight;
        Nautical_Twilight = nautical_Twilight;
    }

    private String ID;
    private String Source;
    private float TMC;
    private Integer Severity;
    private LocalDateTime Start_Time;
    private LocalDateTime End_Time;
    private float Start_Lat;
    private float Start_Lng;
    private float End_Lat;
    private float End_Lng;
    private float Distance;
    private String Description;
    private float Number;
    private String Street;
    private String Side;
    private String City;
    private String County;
    private String State;
    private String Zipcode;
    private String Country;
    private String Timezone;
    private String Airport_Code;
    private LocalDateTime Weather_Timestamp;
    private float Temperature;
    private float Wind_Chill;
    private float Humidity;
    private float Pressure;
    private float Visibility;
    private String Wind_Direction;
    private float Wind_Speed;
    private float Precipitation;
    private String Weather_Condition;
    private boolean Amenity;
    private boolean Bump;
    private boolean Crossing;
    private boolean Give_Way;
    private boolean Junction;
    private boolean No_Exit;
    private boolean Railway;
    private boolean Roundabout;
    private boolean Station;
    private boolean Stop;
    private boolean Traffic_Calming;
    private boolean Traffic_Signal;
    private boolean Turning_Loop;
    private String Sunrise_Sunset;
    private String Civil_Twilight;
    private String Astronomical_Twilight;
    private String Nautical_Twilight;
}
