package Golestan.Student.access.grades.semester;

public class GSEntity {
    private String subject , teacher , classtime;
    private int vahed;
    private float grade;

    public String getSubject() {
        return subject;
    }

    public GSEntity setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public int getVahed() {
        return vahed;
    }

    public GSEntity setVahed(int vahed) {
        this.vahed = vahed;
        return this;
    }

    public float getGrade() {
        return grade;
    }

    public GSEntity setGrade(float grade) {
        this.grade = grade;
        return this;
    }

    public String getTeacher() {
        return teacher;
    }

    public GSEntity setTeacher(String teacher) {
        this.teacher = teacher;
        return this;
    }

    public String getClasstime() {
        return classtime;
    }

    public GSEntity setClasstime(String classtime) {
        this.classtime = classtime;
        return this;
    }
}
