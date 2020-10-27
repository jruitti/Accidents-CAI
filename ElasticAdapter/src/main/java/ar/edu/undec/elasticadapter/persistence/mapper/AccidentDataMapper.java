package ar.edu.undec.elasticadapter.persistence.mapper;

import ar.edu.undec.elasticadapter.persistence.datamodel.AccidentEntity;
import model.Accident;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccidentDataMapper {

    public static Accident dataCoreMapper(AccidentEntity anAccident){

        return Accident.factory(anAccident.getId(),anAccident.getSource(),anAccident.getTmc(),anAccident.getSeverity(),anAccident.getStartTime(),anAccident.getEndTime(),
                anAccident.getStartLat(),anAccident.getStartLng(),anAccident.getEndLat(),anAccident.getEndLng(),anAccident.getDistance(),anAccident.getDescription(),
                anAccident.getNumber(),anAccident.getStreet(),anAccident.getSide(),anAccident.getCity(),anAccident.getCounty(),anAccident.getState(),anAccident.getZipcode(),
                anAccident.getCountry(),anAccident.getTimezone(),anAccident.getAirportCode(),stringToLocalDateTimeParser(anAccident.getWeatherTimestamp()),anAccident.getTemperature(),anAccident.getWindChill(),
                anAccident.getHumidity(),anAccident.getPressure(), anAccident.getVisibility(),anAccident.getWindDirection(), anAccident.getWindSpeed(), anAccident.getPrecipitation(), anAccident.getWeatherCondition(),
                anAccident.isAmenity(), anAccident.isBump(), anAccident.isCrossing(), anAccident.isGiveWay(), anAccident.isJunction(), anAccident.isNoExit(), anAccident.isRailway(),
                anAccident.isRoundabout(), anAccident.isStation(), anAccident.isStop(), anAccident.isTrafficCalming(), anAccident.isTrafficSignal(), anAccident.isTurningLoop(),
                anAccident.getSunriseSunset(), anAccident.getCivilTwilight(), anAccident.getAstronomicalTwilight(),anAccident.getNauticalTwilight());
    }

    private static LocalDateTime stringToLocalDateTimeParser(String aDate){
        return aDate!=null?LocalDateTime.parse(aDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")):null;
    }
}
