package ar.edu.undec.accidents.mongoadapter.controller.config;

import repository.IAccidentsBetweenDatesRepository;
import repository.IMostCommonConditionsRepository;
import usecase.AccidentsBetweenDatesUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import usecase.MostCommonConditionsUseCase;

@Configuration
public class UseCaseConfig {

    @Autowired
    private IAccidentsBetweenDatesRepository accidentsBetweenDatesRepository;

    @Autowired
    private IMostCommonConditionsRepository mostCommonConditionsRepository;

    @Bean
    public AccidentsBetweenDatesUseCase accidentsBetweenDatesUseCase() {
        return new AccidentsBetweenDatesUseCase(accidentsBetweenDatesRepository);
    }

    @Bean
    public MostCommonConditionsUseCase mostCommonConditionsUseCase() {
        return new MostCommonConditionsUseCase(mostCommonConditionsRepository);
    }

}
