package ar.edu.undec.accidents.mongoadapter.controller.mapper;

import ar.edu.undec.accidents.mongoadapter.controller.dtomodel.CommonConditionDTO;
import model.CommonCondition;

public class CommonConditionDTOMapper {

    public static CommonConditionDTO CoreDTOMapper(CommonCondition aCommonCondition){
        return new CommonConditionDTO(aCommonCondition.getCivilTwilight(),aCommonCondition.getConteo());

    }
}
