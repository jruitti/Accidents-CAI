package usecase;

import Mockito.MockitoExtension;
import model.Accident;
import model.DangerousPoint;
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
    Collection<DangerousPoint> dangerousPointCollection=factoryPoints();

    @Mock
    IDangerousPointRepository dangerousPointRepository;


    @Test
    void getDangerousPoint_DataExists_returnCollection(){
        float radiusInKm= 1;
        DangerousPointUseCase dangerousPointUseCase=new DangerousPointUseCase(dangerousPointRepository);
        when(dangerousPointRepository.getDangerousPoints(radiusInKm)).thenReturn(factoryPoints());

        Assertions.assertTrue(!dangerousPointUseCase.getDangerousPoints(radiusInKm).isEmpty());
    }



    private Collection<DangerousPoint> factoryPoints() {
        DangerousPoint aPoint=DangerousPoint.factory(-12344d, 12344.6d, null);
        Collection<DangerousPoint> result=new ArrayList<DangerousPoint>();
        result.add(aPoint);
        return result;
    }
}
