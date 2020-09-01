package ar.edu.undec.accidents.mongoadapter;

import ar.edu.undec.accidents.mongoadapter.controller.dtomodel.AccidentDTO;
import ar.edu.undec.accidents.mongoadapter.controller.service.AccidentsBetweenDatesController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;

@SpringBootTest
class MongoAdapterApplicationTests {

    @Autowired
    AccidentsBetweenDatesController accidentsBetweenDatesController;


    @Test
    void getAccidentsBetweenDates_ExistsAccidents_ReturnCollectionAnd200(){
        LocalDateTime fromDate=LocalDateTime.of(2016,1,1,0,0,0);
        LocalDateTime toDate=LocalDateTime.of(2016,12,31,10,0,0);
        ResponseEntity response=accidentsBetweenDatesController.getAccidentsBetweenDates(fromDate,toDate);
        Assertions.assertEquals(410600,((ArrayList<AccidentDTO>)response.getBody()).size());
        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
    }

}
