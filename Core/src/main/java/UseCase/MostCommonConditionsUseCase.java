package usecase;

import model.CommonCondition;
import repository.IMostCommonConditionsRepository;
import usecase.input.IMostCommonConditionsInput;

import java.util.Collection;

public class MostCommonConditionsUseCase implements IMostCommonConditionsInput {
    private IMostCommonConditionsRepository mostCommonConditionsRepository;

    public MostCommonConditionsUseCase(IMostCommonConditionsRepository mostCommonConditionsRepository) {

        this.mostCommonConditionsRepository = mostCommonConditionsRepository;
    }

    @Override
    public Collection<CommonCondition> getMostCommonConditions() {
        return mostCommonConditionsRepository.queryMostCommonConditions();
    }
}
