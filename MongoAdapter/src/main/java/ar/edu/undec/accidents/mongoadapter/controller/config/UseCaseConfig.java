package ar.edu.undec.accidents.mongoadapter.controller.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.*;
import usecase.*;

@Configuration
public class UseCaseConfig {

    @Autowired
    private IAccidentsBetweenDatesRepository accidentsBetweenDatesRepository;

    @Autowired
    private IMostCommonConditionsRepository mostCommonConditionsRepository;

    @Autowired
    private IAccidentsInRadiusRepository accidentsInRadiusRepository;

    @Autowired
    private IDangerousPointRepository dangerousPointRepository;

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

    @Bean
    public DangerousPointUseCase dangerousPointUseCase() {
        return new DangerousPointUseCase(dangerousPointRepository);
    }

}
