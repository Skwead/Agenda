package sample.calendar;

import java.util.Date;

public class Time {
    private Date date;
    private int hour;
    private int minute;

    public Time(Date date, int hour, int minute) {
        this.date = date;
        this.hour = hour;
        this.minute = minute;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(short hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(short minute) {
        this.minute = minute;
    }
}
