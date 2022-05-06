package Golestan.teacher.MVC;

public class TeacherEntity {
    private long id , user;
    private int salary;
    private String password , lessons;

    public long getId() {
        return id;
    }

    public TeacherEntity setId(long id) {
        this.id = id;
        return this;
    }

    public long getUser() {
        return user;
    }

    public String getLessons() {
        return lessons;
    }

    public TeacherEntity setLessons(String lessons) {
        this.lessons = lessons;
        return this;
    }

    public TeacherEntity setUser(long user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public TeacherEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getSalary() {
        return salary;
    }

    public TeacherEntity setSalary(int salary) {
        this.salary = salary;
        return this;
    }
}
