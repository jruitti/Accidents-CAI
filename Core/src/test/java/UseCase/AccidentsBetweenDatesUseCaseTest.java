package usecase;

import Mockito.MockitoExtension;
import model.Accident;
import repository.IAccidentsBetweenDatesRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AccidentsBetweenDatesUseCaseTest {

    @Mock
    IAccidentsBetweenDatesRepository accidentsBetweenDatesRepository;

    @Spy
    Collection<Accident> accidentCollection = factoryAccidents();

    private Collection<Accident> factoryAccidents() {
        Collection<Accident> accidentsList = new ArrayList<Accident>();
        accidentsList.add(Accident.factory(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, null));
        return accidentsList;
    }

    @Test
    void getAccidentsBetweenDates_ExistsAccidentes_ReturnList() {
        LocalDateTime fromDate = LocalDateTime.of(2016, 6, 1, 0, 0, 0);
        LocalDateTime toDate = LocalDateTime.of(2016, 6, 30, 0, 0, 0);
        AccidentsBetweenDatesUseCase accidentsBetweenDatesUseCase = new AccidentsBetweenDatesUseCase(accidentsBetweenDatesRepository);
        when(accidentsBetweenDatesRepository.queryAccidentsBetweenDates(fromDate, toDate)).thenReturn(accidentCollection);
        Assertions.assertNotEquals(0, accidentsBetweenDatesUseCase.getAccidentsBetweenDates(fromDate, toDate).size());
    }
}
