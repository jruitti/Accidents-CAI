package ar.edu.undec.accidents.mongoadapter.persistence.crud;

import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.AccidentEntity;
import org.springframework.data.geo.Circle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface IAccidentsInRadiusCRUD extends MongoRepository<AccidentEntity, String> {
    Collection<AccidentEntity> findByStartLocationWithin(Circle theCircle);
}
