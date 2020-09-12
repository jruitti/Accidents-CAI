package usecase;

import Mockito.MockitoExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import repository.IAverageDistanceRepository;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AverageDistanceUseCaseTest {

    @Mock
    IAverageDistanceRepository averageDistanceRepository;

    @Test
    public void getAverageDistance_ExistAccidents_ReturnAverage(){
        AverageDistanceUseCase averageDistanceUseCase=new AverageDistanceUseCase(averageDistanceRepository);

        when(averageDistanceRepository.queryAverageDistance()).thenReturn(100.0f);

        Assertions.assertEquals(100.0f,averageDistanceUseCase.getAverageDistance().floatValue());


    }


}
