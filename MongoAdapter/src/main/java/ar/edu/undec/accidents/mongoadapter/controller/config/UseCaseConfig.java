package ar.edu.undec.accidents.mongoadapter.controller.config;

import repository.IAccidentsBetweenDatesRepository;
import usecase.AccidentsBetweenDatesUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Autowired
    private IAccidentsBetweenDatesRepository iAccidentsBetweenDatesRepository;

    @Bean
    public AccidentsBetweenDatesUseCase accidentsBetweenDatesUseCase() {
        return new AccidentsBetweenDatesUseCase(iAccidentsBetweenDatesRepository);
    }

}
