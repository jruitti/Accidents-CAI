package usecase;

import Mockito.MockitoExtension;
import model.Accident;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import repository.IAccidentsInRadiusRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AccidentsInRadiusUseCaseTest {

    @Mock
    IAccidentsInRadiusRepository accidentsInRadiusRepository;

    @Spy
    Collection<Accident> accidentCollection = factoryAccidents();

    private Collection<Accident> factoryAccidents() {
        Collection<Accident> accidentsList =new ArrayList<Accident>();
        accidentsList.add(Accident.emptyfactory("123123123", "asdasdasd", null, LocalDateTime.now()));
        return accidentsList;
    }

    @Test
    void getAccidentsInRadius_ExistsAccidentes_ReturnList(){
        float longitude= -84.058723f;
        float latitude= 39.865147f;
        float radiusInKm= 10;

        AccidentsInRadiusUseCase accidentsInRadiusUseCase = new AccidentsInRadiusUseCase(accidentsInRadiusRepository);
        when(accidentsInRadiusRepository.queryAccidentsInRadius(longitude,latitude,radiusInKm)).thenReturn(accidentCollection);
        Assertions.assertNotEquals(0, accidentsInRadiusUseCase.getAccidentsInRadius(longitude,latitude,radiusInKm).size());
    }
}
