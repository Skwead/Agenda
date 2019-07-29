package sample.calendar;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CalendarHandler {

    private Map<Time, SkEvent> sortedEvts = new HashMap<>();

    public Map<Time, SkEvent> getToday(){
        Map<Time, SkEvent> todaySchedule = new HashMap<>();
        for(Time eventTime: sortedEvts.keySet()){
            if(eventTime.equals(new Time(new Date(LocalDateTime.now().getYear(), LocalDateTime.now().getMonthValue(), LocalDateTime.now().getDayOfMonth()), LocalDateTime.now().getHour(), LocalDateTime.now().getMinute()))){
                todaySchedule.put(eventTime, sortedEvts.get(eventTime));
            }
        }
        return todaySchedule;
    }
}
