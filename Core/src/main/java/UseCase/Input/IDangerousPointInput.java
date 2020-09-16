package usecase.input;

import model.DangerousPoint;

import java.util.Collection;

public interface IDangerousPointInput {

    Collection<DangerousPoint> getDangerousPoints(float radiusInKm);
}
