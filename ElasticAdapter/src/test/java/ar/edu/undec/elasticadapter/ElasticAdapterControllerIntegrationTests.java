package ar.edu.undec.elasticadapter;

import ar.edu.undec.elasticadapter.controller.dtomodel.AccidentDTO;
import ar.edu.undec.elasticadapter.controller.service.AccidentsBetweenDatesController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;

@SpringBootTest
class ElasticAdapterControllerIntegrationTests {

    @Autowired
    AccidentsBetweenDatesController accidentsBetweenDatesController;
//    @Autowired
//    MostCommonConditionController mostCommonConditionController;
//
//    @Autowired
//    AccidentsInRadiusController accidentsInRadiusController;
//
//    @Autowired
//    AverageDistanceController averageDistanceController;
//
//    @Autowired
//    DangerousPointController dangerousPointsController;

    @Test
    void getAccidentsBetweenDates_ExistsAccidents_ReturnCollectionAnd200(){
        LocalDateTime fromDate=LocalDateTime.of(2016,1,31,0,0,0);
        LocalDateTime toDate=LocalDateTime.of(2016,3,1,23,59,59);
        ResponseEntity response=accidentsBetweenDatesController.getAccidentsBetweenDates(fromDate,toDate);
        Assertions.assertEquals(595,((ArrayList<AccidentDTO>)response.getBody()).size());
        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
    }

//    @Test
//    void getMostCommonCondition_ExistsAccidents_ReturnCollectionAnd200(){
//        ResponseEntity response=mostCommonConditionController.getMostCommonCondition();
//        Assertions.assertEquals(48,((ArrayList<CommonConditionDTO>)response.getBody()).size());
//        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
//    }
//
//    @Test
//    void getAccidentsInRadius_ExistsAccidents_ReturnCollection() {
//        float longitude= -84.058723f;
//        float latitude= 39.865147f;
//        float radiusInKm= 10;
//        ResponseEntity response = accidentsInRadiusController.getAccidentsInRadius(longitude,latitude,radiusInKm);
//        Assertions.assertEquals(535,((ArrayList<CommonConditionDTO>)response.getBody()).size());
//        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
//    }
//
//    @Test
//    void getAverageDistance_ExistsAccidents_ReturnCollectionAnd200(){
//        ResponseEntity response=averageDistanceController.getAverageDistance();
//        Assertions.assertEquals(Float.valueOf(1397.06665799254f),response.getBody());
//        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
//    }
//
//    @Test
//    void getDangerousPoints_ExistsAccidents_ReturnCollectionOfPoints() {
//        //Test para considerar 100000 accidentes del total de la base de datos
//        float radiusInKm= 1;
//        ResponseEntity response=dangerousPointsController.getDangerousPoints(radiusInKm);
//        Assertions.assertEquals(570,((ArrayList<DangerousPointDTO>)response.getBody()).get(0).getAmount());
//        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
//    }

}
