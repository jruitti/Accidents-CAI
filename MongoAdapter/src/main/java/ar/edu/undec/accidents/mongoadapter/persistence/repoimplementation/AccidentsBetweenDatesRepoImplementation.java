package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.persistence.datamodel.AccidentEntity;
import model.Accident;
import repository.IAccidentsBetweenDatesRepository;
import ar.edu.undec.accidents.mongoadapter.persistence.crud.IAccidentsBetweenDatesCRUD;
import ar.edu.undec.accidents.mongoadapter.persistence.mapper.AccidentDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@Repository
public class AccidentsBetweenDatesRepoImplementation implements IAccidentsBetweenDatesRepository {


    @Autowired
    IAccidentsBetweenDatesCRUD iAccidentsBetweenDatesCRUD;

    @Override
    public Collection<Accident> queryAccidentsBetweenDates(LocalDateTime fromDate, LocalDateTime toDate) {

        String fromDateString = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(fromDate);
        String toDateString = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(toDate);
        long inicio=System.currentTimeMillis();
        final Collection<AccidentEntity> collect= iAccidentsBetweenDatesCRUD.findByStartTimeBetween(fromDateString,toDateString);
        long fin=System.currentTimeMillis();
        System.out.println("Tiempo de retrieve "+(fin-inicio));
        final ArrayList<Accident> collect1 = collect.stream().map(AccidentDataMapper::dataCoreMapper).collect(Collectors.toCollection(ArrayList::new));
        long fin2=System.currentTimeMillis();
        System.out.println("Tiempo de stream mapear "+(fin2-fin));
        return collect1;

    }
}
