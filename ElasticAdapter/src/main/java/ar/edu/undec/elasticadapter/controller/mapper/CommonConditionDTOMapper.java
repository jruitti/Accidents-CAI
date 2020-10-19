package ar.edu.undec.elasticadapter.controller.mapper;


import ar.edu.undec.elasticadapter.controller.dtomodel.CommonConditionDTO;
import model.CommonCondition;

public class CommonConditionDTOMapper {

    public static CommonConditionDTO CoreDTOMapper(CommonCondition aCommonCondition){
        return new CommonConditionDTO(aCommonCondition.getCivilTwilight(),aCommonCondition.getConteo());

    }
}
