package ar.edu.undec.accidents.mongoadapter.persistence.repoimplementation;

import model.Accident;
import org.springframework.stereotype.Repository;
import repository.IAccidentsInRadiusRepository;

import java.util.Collection;

@Repository
public class AccidentsInRadiusRepoImplementation implements IAccidentsInRadiusRepository {


    @Override
    public Collection<Accident> queryAccidentsInRadius(float longitude, float latitude, float radiusInKm) {
        return null;
    }
}
