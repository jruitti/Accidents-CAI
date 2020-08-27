package UseCase;

import Mockito.MockitoExtension;
import Model.Accident;
import Repository.IAccidentsBetweenDatesRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;

import java.time.LocalDate;
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
        Collection<Accident> accidentsList =new ArrayList<Accident>();
        accidentsList.add(Accident.emptyfactory());
        return accidentsList;
    }

    @Test
    void getAccidentsBetweenDates_ExistsAccidentes_ReturnList(){
        LocalDate fromDate=LocalDate.of(2016,6,1);
        LocalDate toDate=LocalDate.of(2016,6,30);
        AccidentsBetweenDatesUseCase accidentsBetweenDatesUseCase = new AccidentsBetweenDatesUseCase(accidentsBetweenDatesRepository);
        when(accidentsBetweenDatesRepository.queryAccidentsBetweenDates(fromDate,toDate)).thenReturn(accidentCollection);
        Assertions.assertNotEquals(0, accidentsBetweenDatesUseCase.getAccidentsBetweenDates(fromDate,toDate).size());
    }
}
