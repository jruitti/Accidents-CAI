package ar.edu.undec.accidents.mongoadapter.persistence.mapper;

import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.CommonConditionEntity;
import model.CommonCondition;

public class CommonConditionDataMapper {

    public static CommonCondition dataCoreMapper(CommonConditionEntity aCondition){
        return CommonCondition.factory(aCondition.getCivil_Twilight(),aCondition.getConteo());
    }
}
