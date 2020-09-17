package usecase;

import model.Accident;
import repository.IAccidentsInRadiusRepository;
import usecase.input.IAccidentsInRadiusInput;

import java.util.Collection;

public class AccidentsInRadiusUseCase implements IAccidentsInRadiusInput {
    private IAccidentsInRadiusRepository accidentsInRadiusRepository;

    public AccidentsInRadiusUseCase(IAccidentsInRadiusRepository accidentsInRadiusRepository) {

        this.accidentsInRadiusRepository = accidentsInRadiusRepository;
    }

    @Override
    public Collection<Accident> getAccidentsInRadius(float longitude, float latitude, float radiusInKm) {
        return this.accidentsInRadiusRepository.queryAccidentsInRadius(longitude,latitude,radiusInKm);
    }
}
