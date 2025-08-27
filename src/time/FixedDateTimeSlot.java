package time;

import java.time.LocalDate;
import java.time.LocalTime;

public class FixedDateTimeSlot extends TimeSlot {

    private final LocalDate date;

    public FixedDateTimeSlot(LocalTime startTime, LocalTime endTime, LocalDate date) {
        super(startTime, endTime);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
