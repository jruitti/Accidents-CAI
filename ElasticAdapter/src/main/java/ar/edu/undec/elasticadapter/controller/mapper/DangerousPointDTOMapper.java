package ar.edu.undec.elasticadapter.controller.mapper;

import ar.edu.undec.elasticadapter.controller.dtomodel.DangerousPointDTO;
import model.DangerousPoint;

public class DangerousPointDTOMapper {
    public static DangerousPointDTO CoreDTOMapper(DangerousPoint aDangerousPoint){
        return new DangerousPointDTO(aDangerousPoint.getLongitude(),aDangerousPoint.getLatitude(),aDangerousPoint.getAmount());
    }
}
