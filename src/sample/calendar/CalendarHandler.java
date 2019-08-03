package sample.calendar;

import javafx.fxml.FXMLLoader;

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
