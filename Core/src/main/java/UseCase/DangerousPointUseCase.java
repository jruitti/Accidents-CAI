package usecase;

import model.DangerousPoint;
import repository.IDangerousPointRepository;
import usecase.input.IDangerousPointInput;

import java.util.Collection;

public class DangerousPointUseCase implements IDangerousPointInput {

    private IDangerousPointRepository dangerousPointRepository;

    public DangerousPointUseCase(IDangerousPointRepository dangerousPointRepository) {

        this.dangerousPointRepository = dangerousPointRepository;
    }

    @Override
    public Collection<DangerousPoint> getDangerousPoints() {
        return dangerousPointRepository.getDangerousPoints();
    }
}
