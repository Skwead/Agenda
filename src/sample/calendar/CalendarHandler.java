package sample.calendar;

import java.time.LocalDateTime;
import java.util.*;

public class CalendarHandler {

    private List<SkEvent> sortedEvts = new ArrayList<>();

    public ArrayList<SkEvent> getToday(){
        ArrayList<SkEvent> todaySchedule = new ArrayList<>();

        for (SkEvent event : sortedEvts) {
            if (event.getDate().getDayOfYear() == LocalDateTime.now().getDayOfYear()) {
                todaySchedule.add(event);
            }
        }

        Collections.sort(todaySchedule, Comparator.comparing(SkEvent::getDate)); //ver comentário ao fundo
        return todaySchedule;
    }

    public List<SkEvent> getSortedEvts() {
        return sortedEvts;
    }
}
/*
Collections.sort(rowItems, new Comparator<RowItem>() {
    @Override
    public int compare(RowItem r1, RowItem 2) {
        return r1.getStartDate().compareTo(r2.getStartDate());
    }
})
*/
