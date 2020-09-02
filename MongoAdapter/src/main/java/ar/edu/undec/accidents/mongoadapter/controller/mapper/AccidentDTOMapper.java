package ar.edu.undec.accidents.mongoadapter.controller.mapper;

import model.Accident;
import ar.edu.undec.accidents.mongoadapter.controller.dtomodel.AccidentDTO;

public class AccidentDTOMapper {

    public static AccidentDTO CoreDTOMapper(Accident anAccident) {
        return new AccidentDTO(anAccident.getId(),anAccident.getSource(),anAccident.getTmc(),anAccident.getSeverity(),anAccident.getStartTime(),anAccident.getEndTime(),
                anAccident.getWeatherTimestamp(),anAccident.getStartLat(),anAccident.getStartLng(),anAccident.getEndLat(),anAccident.getEndLng(),anAccident.getDistance(),
                anAccident.getNumber(),anAccident.getStreet(),anAccident.getSide(),anAccident.getCity(),anAccident.getCounty(),anAccident.getState(),anAccident.getZipcode(),
                anAccident.getCountry(),anAccident.getTimezone(),anAccident.getAirportCode(),anAccident.getTemperature(),anAccident.getWindChill(),anAccident.getHumidity(),
                anAccident.getPressure(),anAccident.getVisibility(),anAccident.getWindDirection(),anAccident.getWindSpeed(),anAccident.getPrecipitation(),anAccident.getWeatherCondition(),
                anAccident.isAmenity(),anAccident.isBump(),anAccident.isCrossing(),anAccident.isGiveWay(),anAccident.isJunction(),anAccident.isNoExit(),anAccident.isRailway(),
                anAccident.isRoundabout(),anAccident.isStation(),anAccident.isStop(),anAccident.isTrafficCalming(),anAccident.isTrafficSignal(),anAccident.isTurningLoop(),
                anAccident.getSunriseSunset(),anAccident.getCivilTwilight(),anAccident.getAstronomicalTwilight(),anAccident.getNauticalTwilight(),anAccident.getDescription());

    }
}
