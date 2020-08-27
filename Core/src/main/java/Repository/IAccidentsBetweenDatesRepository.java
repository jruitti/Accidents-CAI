package Repository;

import Model.Accident;

import java.time.LocalDate;
import java.util.Collection;

public interface IAccidentsBetweenDatesRepository {
    Collection<Accident> queryAccidentsBetweenDates(LocalDate fromDate, LocalDate toDate);
}
