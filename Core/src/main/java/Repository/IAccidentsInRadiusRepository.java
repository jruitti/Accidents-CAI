package repository;

import model.Accident;

import java.util.Collection;

public interface IAccidentsInRadiusRepository {
    Collection<Accident> queryAccidentsInRadius(float longitude, float latitude, float radiusInKm);
}
