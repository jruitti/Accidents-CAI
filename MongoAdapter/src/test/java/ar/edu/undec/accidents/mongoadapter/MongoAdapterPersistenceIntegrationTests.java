package ar.edu.undec.accidents.mongoadapter;

import model.Accident;
import model.DangerousPoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repository.*;
import usecase.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MongoAdapterPersistenceIntegrationTests {

    @Autowired
    IMostCommonConditionsRepository mostCommonConditionsRepository;
    @Autowired
    IAccidentsBetweenDatesRepository accidentsBetweenDatesRepository;
    @Autowired
    IAccidentsInRadiusRepository accidentsInRadiusRepository;
    @Autowired
    IAverageDistanceRepository averageDistanceRepository;
    @Autowired
    IDangerousPointRepository dangerousPointRepository;

    @Test
    void getAccidentsBetweenDates_ExistsAccidents_ReturnCollection() {
        AccidentsBetweenDatesUseCase accidentsBetweenDatesUseCase = new AccidentsBetweenDatesUseCase(accidentsBetweenDatesRepository);
        LocalDateTime fromDate = LocalDateTime.of(2016, 1, 1, 0, 0, 0);
        LocalDateTime toDate = LocalDateTime.of(2016, 12, 31, 10, 0, 0);
        ArrayList<Accident> retorno = (ArrayList<Accident>) accidentsBetweenDatesUseCase.getAccidentsBetweenDates(fromDate, toDate);
        Assertions.assertEquals(410600, retorno.size());
    }


    @Test
    void getCommonConditions_DataExist_returnCollection() {
        MostCommonConditionsUseCase mostCommonConditionsUseCase = new MostCommonConditionsUseCase(mostCommonConditionsRepository);
        Assertions.assertEquals(48, mostCommonConditionsUseCase.getMostCommonConditions().size());
    }

    @Test
    void getAccidentsInRadius_ExistsAccidents_ReturnCollection() {
        float longitude= -84.058723f;
        float latitude= 39.865147f;
        float radiusInKm= 10;
        AccidentsInRadiusUseCase accidentsInRadiusUseCase = new AccidentsInRadiusUseCase(accidentsInRadiusRepository);
        ArrayList<Accident> retorno = (ArrayList<Accident>) accidentsInRadiusUseCase.getAccidentsInRadius(longitude,latitude,radiusInKm);
        Assertions.assertEquals(535, retorno.size());
    }

    @Test
    void getAverageDistance_DataExist_returnAverageInFloat() {
        AverageDistanceUseCase averageDistanceUseCase=new AverageDistanceUseCase(averageDistanceRepository);
        Assertions.assertEquals(Float.valueOf(1397.06665799254f), averageDistanceUseCase.getAverageDistance());
    }

    @Test
    void getDangerousPoints_DataExist_ReturnCollection() {
        float radiusInKm= 1;
        DangerousPointUseCase dangerousPointUseCase=new DangerousPointUseCase(dangerousPointRepository);
        Assertions.assertEquals(570, ((List< DangerousPoint>) dangerousPointUseCase.getDangerousPoints(radiusInKm)).get(0).getAmount());
    }

}
