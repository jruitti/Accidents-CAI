package repository;

import model.DangerousPoint;

import java.util.Collection;

public interface IDangerousPointRepository {

    Collection<DangerousPoint> getDangerousPoints(float radiusInKm);
}
