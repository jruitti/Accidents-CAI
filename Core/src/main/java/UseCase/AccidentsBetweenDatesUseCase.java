package usecase;

import model.Accident;
import repository.IAccidentsBetweenDatesRepository;
import usecase.input.IAccidentsBetweenDatesInput;

import java.time.LocalDateTime;
import java.util.Collection;

public class AccidentsBetweenDatesUseCase implements IAccidentsBetweenDatesInput {
    private IAccidentsBetweenDatesRepository accidentsBetweenDatesRepository;

    public AccidentsBetweenDatesUseCase(IAccidentsBetweenDatesRepository accidentsBetweenDatesRepository) {
        this.accidentsBetweenDatesRepository = accidentsBetweenDatesRepository;
    }

    @Override
    public Collection<Accident> getAccidentsBetweenDates(LocalDateTime fromDate, LocalDateTime toDate) {
        return accidentsBetweenDatesRepository.queryAccidentsBetweenDates(fromDate, toDate);
    }
}
