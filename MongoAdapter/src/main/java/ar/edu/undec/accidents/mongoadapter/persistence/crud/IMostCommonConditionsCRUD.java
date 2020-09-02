package ar.edu.undec.accidents.mongoadapter.persistence.crud;

import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.CommonConditionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface IMostCommonConditionsCRUD extends MongoRepository<CommonConditionEntity,String> {

    Collection<CommonConditionEntity> getByCommonCondition();
}
