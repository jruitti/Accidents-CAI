package ar.edu.undec.elasticadapter.persistence.repoimplementation;

import ar.edu.undec.elasticadapter.persistence.crud.IAccidentsInRadiusCRUD;
import ar.edu.undec.elasticadapter.persistence.datamodel.AccidentEntity;
import ar.edu.undec.elasticadapter.persistence.mapper.AccidentDataMapper;
import model.Accident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.IAccidentsInRadiusRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class AccidentsInRadiusRepoImplementation implements IAccidentsInRadiusRepository {

    @Autowired
    IAccidentsInRadiusCRUD accidentsInRadiusCRUD;


    @Override
    public Collection<Accident> queryAccidentsInRadius(float longitude, float latitude, float radiusInKm) {

        String coordinates= latitude +","+ longitude;
        Stream<AccidentEntity> retrieve=accidentsInRadiusCRUD.findInRadius(coordinates,radiusInKm);

        return retrieve.map(AccidentDataMapper::dataCoreMapper).collect(Collectors.toCollection(ArrayList::new));
    }
}
