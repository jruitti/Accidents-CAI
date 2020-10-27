package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import ar.edu.undec.accidents.mongoadapter.persistence.crud.IAccidentsBetweenDatesCRUD;
import ar.edu.undec.accidents.mongoadapter.persistence.mapper.AccidentDataMapper;
import model.Accident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.IAccidentsBetweenDatesRepository;

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
        return iAccidentsBetweenDatesCRUD.findByStartTimeBetween(fromDate,toDate).stream().map(AccidentDataMapper::dataCoreMapper).collect(Collectors.toCollection(ArrayList::new));
    }
}
