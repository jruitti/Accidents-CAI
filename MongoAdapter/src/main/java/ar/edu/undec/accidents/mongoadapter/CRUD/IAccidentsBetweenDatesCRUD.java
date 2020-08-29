package ar.edu.undec.accidents.mongoadapter.CRUD;

import ar.edu.undec.accidents.mongoadapter.DataModel.AccidentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collection;

@Repository
public interface IAccidentsBetweenDatesCRUD extends MongoRepository<AccidentEntity,String> {

    Collection<AccidentEntity> findByStartTimeBetween(String fromDate, String toDate);

}
