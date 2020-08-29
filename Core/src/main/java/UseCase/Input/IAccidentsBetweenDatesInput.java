package UseCase.Input;

import Model.Accident;

import java.time.LocalDateTime;
import java.util.Collection;

public interface IAccidentsBetweenDatesInput {
    Collection<Accident> getAccidentsBetweenDates(LocalDateTime fromDate, LocalDateTime toDate);
}
