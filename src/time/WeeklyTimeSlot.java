package time;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class WeeklyTimeSlot extends TimeSlot {

    private final DayOfWeek dayOfWeek;

    public WeeklyTimeSlot(LocalTime startTime, LocalTime endTime, DayOfWeek dayOfWeek) {
        super(startTime, endTime);
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }
}
