package ar.edu.undec.accidents.mongoadapter;

import Repository.IAccidentsBetweenDatesRepository;
import UseCase.AccidentsBetweenDatesUseCase;
import ar.edu.undec.accidents.mongoadapter.CRUD.IAccidentsBetweenDatesCRUD;
import org.apache.tomcat.jni.Local;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class MongoAdapterApplicationTests {

    @Autowired
    IAccidentsBetweenDatesRepository iAccidentsBetweenDatesRepository;


    @Test
    void queryAccidents(){
        AccidentsBetweenDatesUseCase accidentsBetweenDatesUseCase=new AccidentsBetweenDatesUseCase(iAccidentsBetweenDatesRepository);
        Assertions.assertEquals(100,accidentsBetweenDatesUseCase.getAccidentsBetweenDates(LocalDate.now(),LocalDate.now()).size());

    }

}
