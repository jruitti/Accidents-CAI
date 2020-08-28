package ar.edu.undec.accidents.mongoadapter.RepoImplementation;

import Model.Accident;
import Repository.IAccidentsBetweenDatesRepository;
import ar.edu.undec.accidents.mongoadapter.CRUD.IAccidentsBetweenDatesCRUD;
import ar.edu.undec.accidents.mongoadapter.Mapper.AccidentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@Repository
public class AccidentsBetweenDatesRepoImplementation implements IAccidentsBetweenDatesRepository {


    @Autowired
    IAccidentsBetweenDatesCRUD iAccidentsBetweenDatesCRUD;

    @Override
    public Collection<Accident> queryAccidentsBetweenDates(LocalDate fromDate, LocalDate toDate) {

        //Prueba
        final ArrayList<Accident> collect = iAccidentsBetweenDatesCRUD.findAll().stream().map(AccidentMapper::dataCoreMapper).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect.get(0));
        return collect;
    }
}
