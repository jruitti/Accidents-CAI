package usecase;

import Mockito.MockitoExtension;
import model.Accident;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import repository.IDangerousPointRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DangerousPointsUseCaseTest {

    @Spy
    Collection<Accident> dangerousPointCollection=factoryPoints();

    @Mock
    IDangerousPointRepository dangerousPointRepository;


    @Test
    void getDangerousPoint_DataExists_returnCollection(){
        DangerousPointUseCase dangerousPointUseCase=new DangerousPointUseCase(dangerousPointRepository);
        when(dangerousPointRepository.getDangerousPoints()).thenReturn(new ArrayList<>());

        Assertions.assertTrue(!dangerousPointUseCase.getDangerousPoints().isEmpty());
    }



    private Collection<Accident> factoryPoints() {
        Accident anAccident=Accident.emptyfactory("123123123", "asdasdasd", null, LocalDateTime.now());
        Collection<Accident> result=new ArrayList<Accident>();
        result.add(anAccident);
        return result;
    }
}
