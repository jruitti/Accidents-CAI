package ar.edu.undec.accidents.mongoadapter.Mapper;

import Model.Accident;
import ar.edu.undec.accidents.mongoadapter.DataModel.AccidentEntity;

public class AccidentMapper {

    public static Accident dataCoreMapper(AccidentEntity anAccident){

        System.out.println((anAccident.getID()+"--"+anAccident.getSource()+"--"+anAccident.getHumidity()));
        return Accident.emptyfactory(anAccident.getID(),anAccident.getSource(),anAccident.getHumidity());

//        return Accident.factory(anAccident.getID(),anAccident.getSource(),anAccident.getTMC(),anAccident.getSeverity(),anAccident.getStart_Time(),anAccident.getEnd_Time(),
//                anAccident.getStart_Lat(),anAccident.getStart_Lng(),anAccident.getEnd_Lat(),anAccident.getEnd_Lng(),anAccident.getDistance(),anAccident.getDescription(),
//                anAccident.getNumber(),anAccident.getStreet(),anAccident.getSide(),anAccident.getCity(),anAccident.getCounty(),anAccident.getState(),anAccident.getZipcode(),
//                anAccident.getCountry(),anAccident.getTimezone(),anAccident.getAirport_Code(),anAccident.getWeather_Timestamp(),anAccident.getTemperature(),anAccident.getWind_Chill(),
//                anAccident.getHumidity(),anAccident.getPressure(),anAccident.getVisibility(),anAccident.getWind_Direction(),anAccident.getWind_Speed(),anAccident.getPrecipitation(),
//                anAccident.getWeather_Condition(),anAccident.isAmenity(),anAccident.isBump(),anAccident.isCrossing(),anAccident.isGive_Way(),anAccident.isJunction(),anAccident.isNo_Exit(),
//                anAccident.isRailway(),anAccident.isRoundabout(),anAccident.isStation(),anAccident.isStop(),anAccident.isTraffic_Calming(),anAccident.isTraffic_Signal(),anAccident.isTurning_Loop(),
//                anAccident.getSunrise_Sunset(),anAccident.getCivil_Twilight(),anAccident.getAstronomical_Twilight(),anAccident.getNautical_Twilight());

    }
}
