package Repository;

import Model.Accident;

import java.time.LocalDateTime;
import java.util.Collection;

public interface IAccidentsBetweenDatesRepository {
    Collection<Accident> queryAccidentsBetweenDates(LocalDateTime fromDate, LocalDateTime toDate);
}
