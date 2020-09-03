package usecase;

import Mockito.MockitoExtension;
import model.CommonCondition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import repository.IMostCommonConditionsRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MostCommonConditionsUseCaseTest {

    @Mock
    IMostCommonConditionsRepository mostCommonConditionsRepository;

    @Spy
    Collection<CommonCondition> commonConditionsList=factoryConditions();

    @Test
    public void getMostCommonConditions_DataExist_GetCollection() {
        MostCommonConditionsUseCase mostCommonConditionsUseCase=new MostCommonConditionsUseCase(mostCommonConditionsRepository);
        when(mostCommonConditionsRepository.queryMostCommonConditions()).thenReturn(commonConditionsList);
        Collection<CommonCondition> result=mostCommonConditionsUseCase.getMostCommonConditions();
        Assertions.assertTrue(!result.isEmpty());
    }

    private Collection<CommonCondition> factoryConditions() {
        CommonCondition aCondition=CommonCondition.factory(new HashMap<>(), 1);
        Collection<CommonCondition> theCollection=new ArrayList<CommonCondition>();
        theCollection.add(aCondition);
        return theCollection;
    }

}
