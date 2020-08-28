package ar.edu.undec.accidents.mongoadapter.CRUD;

import ar.edu.undec.accidents.mongoadapter.DataModel.AccidentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccidentsBetweenDatesCRUD extends MongoRepository<AccidentEntity,String> {

}
