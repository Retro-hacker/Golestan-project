package Golestan.teacher.access.Lessons;

public class LessonsEntity {
    private String lessons;
    private String day;
    private String time;

    public String getName() {
        return name;
    }

    public LessonsEntity setName(String name) {
        this.name = name;
        return this;
    }

    private String name;
    private int courses;

    public String getLessons() {
        return lessons;
    }

    public LessonsEntity setLessons(String lessons) {
        this.lessons = lessons;
        return this;
    }

    public String getDay() {
        return day;
    }

    public LessonsEntity setDay(String day) {
        this.day = day;
        return this;
    }

    public String getTime() {
        return time;
    }

    public LessonsEntity setTime(String time) {
        this.time = time;
        return this ;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }
}
