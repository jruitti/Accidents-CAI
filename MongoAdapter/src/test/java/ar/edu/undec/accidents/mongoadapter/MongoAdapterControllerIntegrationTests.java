package ar.edu.undec.accidents.mongoadapter;

import ar.edu.undec.accidents.mongoadapter.controller.dtomodel.AccidentDTO;
import ar.edu.undec.accidents.mongoadapter.controller.dtomodel.CommonConditionDTO;
import ar.edu.undec.accidents.mongoadapter.controller.service.AccidentsBetweenDatesController;
import ar.edu.undec.accidents.mongoadapter.controller.service.AccidentsInRadiusController;
import ar.edu.undec.accidents.mongoadapter.controller.service.AverageDistanceController;
import ar.edu.undec.accidents.mongoadapter.controller.service.MostCommonConditionController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;

@SpringBootTest
class MongoAdapterControllerIntegrationTests {

    @Autowired
    AccidentsBetweenDatesController accidentsBetweenDatesController;
    @Autowired
    MostCommonConditionController mostCommonConditionController;

    @Autowired
    AccidentsInRadiusController accidentsInRadiusController;

    @Autowired
    AverageDistanceController averageDistanceController;

    @Test
    void getAccidentsBetweenDates_ExistsAccidents_ReturnCollectionAnd200(){
        LocalDateTime fromDate=LocalDateTime.of(2016,1,1,0,0,0);
        LocalDateTime toDate=LocalDateTime.of(2016,12,31,10,0,0);
        ResponseEntity response=accidentsBetweenDatesController.getAccidentsBetweenDates(fromDate,toDate);
        Assertions.assertEquals(410600,((ArrayList<AccidentDTO>)response.getBody()).size());
        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
    }

    @Test
    void getMostCommonCondition_ExistsAccidents_ReturnCollectionAnd200(){
        ResponseEntity response=mostCommonConditionController.getMostCommonCondition();
        Assertions.assertEquals(48,((ArrayList<CommonConditionDTO>)response.getBody()).size());
        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
    }

    @Test
    void getAccidentsInRadius_ExistsAccidents_ReturnCollection() {
        float longitude= -84.058723f;
        float latitude= 39.865147f;
        float radiusInKm= 10;
        ResponseEntity response = accidentsInRadiusController.getAccidentsInRadius(longitude,latitude,radiusInKm);
        Assertions.assertEquals(535,((ArrayList<CommonConditionDTO>)response.getBody()).size());
        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
    }

    @Test
    void getAverageDistance_ExistsAccidents_ReturnCollectionAnd200(){
        ResponseEntity response=averageDistanceController.getAverageDistance();
        Assertions.assertEquals(Float.valueOf(1397.06665799254f),response.getBody());
        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
    }

}
