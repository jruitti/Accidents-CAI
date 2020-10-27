package ar.edu.undec.accidents.mongoadapter.persistence.mapper;

import model.Accident;
import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.AccidentEntity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccidentDataMapper {

    public static Accident dataCoreMapper(AccidentEntity anAccident){

        return Accident.factory(anAccident.getId(),anAccident.getSource(),anAccident.getTmc(),anAccident.getSeverity(),anAccident.getStartTime(),anAccident.getEndTime(),
                anAccident.getStartLat(),anAccident.getStartLng(),anAccident.getEndLat(),anAccident.getEndLng(),anAccident.getDistance(),anAccident.getDescription(),
                anAccident.getNumber(),anAccident.getStreet(),anAccident.getSide(),anAccident.getCity(),anAccident.getCounty(),anAccident.getState(),anAccident.getZipcode(),
                anAccident.getCountry(),anAccident.getTimezone(),anAccident.getAirportCode(),anAccident.getWeatherTimestamp(),anAccident.getTemperature(),anAccident.getWindChill(),
                anAccident.getHumidity(),anAccident.getPressure(), anAccident.getVisibility(),anAccident.getWindDirection(), anAccident.getWindSpeed(), anAccident.getPrecipitation(), anAccident.getWeatherCondition(),
                anAccident.isAmenity(), anAccident.isBump(), anAccident.isCrossing(), anAccident.isGiveWay(), anAccident.isJunction(), anAccident.isNoExit(), anAccident.isRailway(),
                anAccident.isRoundabout(), anAccident.isStation(), anAccident.isStop(), anAccident.isTrafficCalming(), anAccident.isTrafficSignal(), anAccident.isTurningLoop(),
                anAccident.getSunriseSunset(), anAccident.getCivilTwilight(), anAccident.getAstronomicalTwilight(),anAccident.getNauticalTwilight());

    }
}
