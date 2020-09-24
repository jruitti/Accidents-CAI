package usecase;

import repository.IAverageDistanceRepository;
import usecase.input.IAverageDistanceInput;

public class AverageDistanceUseCase implements IAverageDistanceInput {
    private IAverageDistanceRepository averageDistanceRepository;

    public AverageDistanceUseCase(IAverageDistanceRepository averageDistanceRepository) {

        this.averageDistanceRepository = averageDistanceRepository;
    }


    @Override
    public Double getAverageDistance() {
        return this.averageDistanceRepository.queryAverageDistance();
    }
}
