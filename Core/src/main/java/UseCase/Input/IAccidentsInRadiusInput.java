package usecase.input;

import model.Accident;

import java.util.Collection;

public interface IAccidentsInRadiusInput {
    Collection<Accident> getAccidentsInRadius(float longitude, float latitude, float radiusInKm);
}
