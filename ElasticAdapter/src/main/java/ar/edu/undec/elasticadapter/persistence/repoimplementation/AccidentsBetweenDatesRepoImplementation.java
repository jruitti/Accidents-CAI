package ar.edu.undec.elasticadapter.persistence.repoimplementation;

import ar.edu.undec.elasticadapter.persistence.crud.IAccidentsBetweenDatesCRUD;
import ar.edu.undec.elasticadapter.persistence.datamodel.AccidentEntity;
import ar.edu.undec.elasticadapter.persistence.mapper.AccidentDataMapper;
import model.Accident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.IAccidentsBetweenDatesRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AccidentsBetweenDatesRepoImplementation implements IAccidentsBetweenDatesRepository {

    @Autowired
    IAccidentsBetweenDatesCRUD accidentsBetweenDatesCRUD;

    @Override
    public Collection<Accident> queryAccidentsBetweenDates(LocalDateTime fromDate, LocalDateTime toDate) {
        List<AccidentEntity> retorno=accidentsBetweenDatesCRUD.findByAirportCodeEquals("KFFO");
        System.out.println(retorno.size());

        return retorno.stream().map(AccidentDataMapper::dataCoreMapper).collect(Collectors.toCollection(ArrayList::new));

    }
}
