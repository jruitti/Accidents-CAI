package ar.edu.undec.elasticadapter;

import model.Accident;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repository.IAccidentsBetweenDatesRepository;
import repository.IAverageDistanceRepository;
import usecase.AccidentsBetweenDatesUseCase;
import usecase.AverageDistanceUseCase;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

@SpringBootTest
public class ElasticAdapterPersistenceIntegrationTests {

    @Autowired
    IAccidentsBetweenDatesRepository accidentsBetweenDatesRepository;

    @Autowired
    IAverageDistanceRepository averageDistanceRepository;


    @Test
    void getAccidentsBetweenDates_ExistsAccidents_ReturnCollection() {
        AccidentsBetweenDatesUseCase accidentsBetweenDatesUseCase = new AccidentsBetweenDatesUseCase(accidentsBetweenDatesRepository);
        LocalDateTime fromDate = LocalDateTime.of(2016, 1, 31, 0, 0, 0);
        LocalDateTime toDate = LocalDateTime.of(2016, 3, 01, 23, 59, 59);
        ArrayList<Accident> retorno = (ArrayList<Accident>) accidentsBetweenDatesUseCase.getAccidentsBetweenDates(fromDate, toDate);
        Assertions.assertEquals(595, retorno.size());
    }


    @Test
    void getAverageDistance_DataExist_returnAverageInFloat() {
        AverageDistanceUseCase averageDistanceUseCase=new AverageDistanceUseCase(averageDistanceRepository);
        Assertions.assertEquals("0,985", new DecimalFormat("#.###").format(averageDistanceUseCase.getAverageDistance()));
    }
}
