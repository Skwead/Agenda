package sample.calendar;

import java.time.LocalDateTime;
import java.util.*;

public class CalendarHandler {

    private List<SkEvent> sortedEvts = new ArrayList<>();

    public ArrayList<SkEvent> getToday(){
        ArrayList<SkEvent> todaySchedule = new ArrayList<>();

        sortedEvts.forEach(event -> {
            if(event.getDate().getDay() == (new Date(LocalDateTime.now().getYear(), LocalDateTime.now().getMonthValue(), LocalDateTime.now().getDayOfMonth()).getDay())){
                todaySchedule.add(event);
            }
        });
        return todaySchedule;
    }

    public List<SkEvent> getSortedEvts() {
        return sortedEvts;
    }
}
