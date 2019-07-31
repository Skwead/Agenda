package sample.calendar;

import java.util.Date;

public class SkEvent {
    private Date date;
    private String name;
    private String description;
    private String todo;

    public SkEvent(Date date, String name, String description, String todo) {
        this.date = date;
        this.name = name;
        this.description = description;
        this.todo = todo;
    }

    public SkEvent(Date date, String name, String todo) {
        this.date = date;
        this.name = name;
        this.todo = todo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
