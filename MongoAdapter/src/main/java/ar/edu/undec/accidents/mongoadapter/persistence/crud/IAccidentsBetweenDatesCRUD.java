package ar.edu.undec.accidents.mongoadapter.persistence.crud;

import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.AccidentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface IAccidentsBetweenDatesCRUD extends MongoRepository<AccidentEntity,String> {

    Collection<AccidentEntity> findByStartTimeBetween(String fromDate, String toDate);



}
