package sample.calendar;

public class SkEvent {
    private Time time;
    private String name;
    private String description;
    private String todo;

    public SkEvent(Time time, String name, String description, String todo) {
        this.time = time;
        this.name = name;
        this.description = description;
        this.todo = todo;
    }

    public SkEvent(Time time, String name, String todo) {
        this.time = time;
        this.name = name;
        this.todo = todo;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
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
