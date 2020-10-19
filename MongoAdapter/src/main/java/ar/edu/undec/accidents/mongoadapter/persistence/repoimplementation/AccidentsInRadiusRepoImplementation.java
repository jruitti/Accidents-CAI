package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.AccidentEntity;
import ar.edu.undec.accidents.mongoadapter.persistence.mapper.AccidentDataMapper;
import model.Accident;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Repository;
import repository.IAccidentsInRadiusRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AccidentsInRadiusRepoImplementation implements IAccidentsInRadiusRepository {

    private final MongoTemplate mongoTemplate;

    public AccidentsInRadiusRepoImplementation(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Collection<Accident> queryAccidentsInRadius(float longitude, float latitude, float radiusInKm) {
        BasicQuery basicQuery= new BasicQuery("{start_location: { $geoWithin: { $centerSphere: [ ["+longitude+","+latitude+"], "+radiusInKm/6371 +"] }}})");
        List<AccidentEntity> result= mongoTemplate.find(basicQuery,AccidentEntity.class);
        ArrayList<Accident> collect = result.stream().map(AccidentDataMapper::dataCoreMapper).collect(Collectors.toCollection(ArrayList::new));
        return collect;
    }
}
