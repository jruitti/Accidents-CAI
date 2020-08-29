package ar.edu.undec.accidents.mongoadapter;

import Repository.IAccidentsBetweenDatesRepository;
import UseCase.AccidentsBetweenDatesUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class MongoAdapterApplicationTests {

    @Autowired
    IAccidentsBetweenDatesRepository iAccidentsBetweenDatesRepository;


    @Test
    void queryAccidents(){
        AccidentsBetweenDatesUseCase accidentsBetweenDatesUseCase=new AccidentsBetweenDatesUseCase(iAccidentsBetweenDatesRepository);
        LocalDateTime fromDate=LocalDateTime.of(2016,1,1,0,0,0);
        LocalDateTime toDate=LocalDateTime.of(2016,3,1,10,0,0);
        Assertions.assertEquals(1047, accidentsBetweenDatesUseCase.getAccidentsBetweenDates(fromDate,toDate).size());

    }

}
