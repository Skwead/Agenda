package sample.utils;

import java.time.LocalDate;
import java.util.Date;

public class DateUtils {

    public static Date localDateToDate(LocalDate ld,int hour, int minute){
        return new Date(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth(), hour ,minute);
    }
}
