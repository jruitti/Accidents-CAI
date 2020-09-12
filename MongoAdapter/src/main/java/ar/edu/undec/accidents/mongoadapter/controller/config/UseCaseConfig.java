package ar.edu.undec.accidents.mongoadapter.controller.config;

import repository.IAccidentsBetweenDatesRepository;
import repository.IAccidentsInRadiusRepository;
import repository.IAverageDistanceRepository;
import repository.IMostCommonConditionsRepository;
import usecase.AccidentsBetweenDatesUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import usecase.AccidentsInRadiusUseCase;
import usecase.AverageDistanceUseCase;
import usecase.MostCommonConditionsUseCase;

@Configuration
public class UseCaseConfig {

    @Autowired
    private IAccidentsBetweenDatesRepository accidentsBetweenDatesRepository;

    @Autowired
    private IMostCommonConditionsRepository mostCommonConditionsRepository;

    @Autowired
    private IAccidentsInRadiusRepository accidentsInRadiusRepository;

    @Autowired
    private IAverageDistanceRepository averageDistanceRepository;

    @Bean
    public AccidentsBetweenDatesUseCase accidentsBetweenDatesUseCase() {
        return new AccidentsBetweenDatesUseCase(accidentsBetweenDatesRepository);
    }

    @Bean
    public MostCommonConditionsUseCase mostCommonConditionsUseCase() {
        return new MostCommonConditionsUseCase(mostCommonConditionsRepository);
    }

    @Bean
    public AccidentsInRadiusUseCase accidentsInRadiusUseCase() {
        return new AccidentsInRadiusUseCase(accidentsInRadiusRepository);
    }

    @Bean
    public AverageDistanceUseCase averageDistanceUseCase() {
        return new AverageDistanceUseCase(averageDistanceRepository);
    }

}
