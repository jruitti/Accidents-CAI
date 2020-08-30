package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

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
        final ArrayList<Accident> collect = iAccidentsBetweenDatesCRUD.findByStartTimeBetween(fromDateString,toDateString).stream().map(AccidentDataMapper::dataCoreMapper).collect(Collectors.toCollection(ArrayList::new));
        return collect;
    }
}
