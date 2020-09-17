package repository;

import model.CommonCondition;

import java.util.Collection;

public interface IMostCommonConditionsRepository {
    Collection<CommonCondition> queryMostCommonConditions();
}
