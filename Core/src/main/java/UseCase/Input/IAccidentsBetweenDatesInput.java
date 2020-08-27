package UseCase.Input;

import Model.Accident;

import java.time.LocalDate;
import java.util.Collection;

public interface IAccidentsBetweenDatesInput {
    Collection<Accident> getAccidentsBetweenDates(LocalDate fromDate, LocalDate toDate);
}
