package ar.edu.undec.elasticadapter;

import model.Accident;
import model.DangerousPoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repository.IAccidentsBetweenDatesRepository;
import repository.IAverageDistanceRepository;
import repository.IDangerousPointRepository;
import repository.IMostCommonConditionsRepository;
import usecase.AccidentsBetweenDatesUseCase;
import usecase.AverageDistanceUseCase;
import usecase.DangerousPointUseCase;
import usecase.MostCommonConditionsUseCase;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ElasticAdapterPersistenceIntegrationTests {

    @Autowired
    IAccidentsBetweenDatesRepository accidentsBetweenDatesRepository;

    @Autowired
    IMostCommonConditionsRepository mostCommonConditionsRepository;

    @Autowired
    IAverageDistanceRepository averageDistanceRepository;

    @Autowired
    IDangerousPointRepository dangerousPointRepository;


    @Test
    void getAccidentsBetweenDates_ExistsAccidents_ReturnCollection() {
        AccidentsBetweenDatesUseCase accidentsBetweenDatesUseCase = new AccidentsBetweenDatesUseCase(accidentsBetweenDatesRepository);
        LocalDateTime fromDate = LocalDateTime.of(2016, 1, 31, 0, 0, 0);
        LocalDateTime toDate = LocalDateTime.of(2016, 3, 01, 23, 59, 59);
        ArrayList<Accident> retorno = (ArrayList<Accident>) accidentsBetweenDatesUseCase.getAccidentsBetweenDates(fromDate, toDate);
        Assertions.assertEquals(595, retorno.size());
    }

    @Test
    void getCommonConditions_DataExist_returnCollection() {
        MostCommonConditionsUseCase mostCommonConditionsUseCase = new MostCommonConditionsUseCase(mostCommonConditionsRepository);
        Assertions.assertEquals(48, mostCommonConditionsUseCase.getMostCommonConditions().size());
    }

    @Test
    void getAverageDistance_DataExist_returnAverageInFloat() {
        AverageDistanceUseCase averageDistanceUseCase=new AverageDistanceUseCase(averageDistanceRepository);
        Assertions.assertEquals("0,985", new DecimalFormat("#.###").format(averageDistanceUseCase.getAverageDistance()));
    }

    @Test
    void getDangerousPoints_DataExist_ReturnCollection() {
        //Test para considerar 10000 accidentes del total de la base de datos
        float radiusInKm= 1;
        DangerousPointUseCase dangerousPointUseCase=new DangerousPointUseCase(dangerousPointRepository);
        Assertions.assertEquals(2801, ((List<DangerousPoint>) dangerousPointUseCase.getDangerousPoints(radiusInKm)).get(0).getAmount());
    }
}
