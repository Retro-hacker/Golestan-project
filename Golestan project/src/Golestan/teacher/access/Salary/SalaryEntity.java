package Golestan.teacher.access.Salary;

public class SalaryEntity {
    private int salary;
    private long username;
    private String lesson;

    public String getLesson() {
        return lesson;
    }

    public SalaryEntity setLesson(String lesson) {
        this.lesson = lesson;
        return this;
    }

    public long getUsername() {
        return username;
    }

    public SalaryEntity setUsername(long username) {
        this.username = username;
        return this;
    }

    public int getSalary() {
        return salary;
    }

    public SalaryEntity setSalary(int salary) {
        this.salary = salary;
        return this;
    }
}
