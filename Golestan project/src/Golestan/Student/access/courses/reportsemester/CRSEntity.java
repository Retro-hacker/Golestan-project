package Golestan.Student.access.courses.reportsemester;

public class CRSEntity {
    private String subject , teacher , classtime;
    private int vahed;

    public String getSubject() {
        return subject;
    }

    public CRSEntity setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getTeacher() {
        return teacher;
    }

    public CRSEntity setTeacher(String teacher) {
        this.teacher = teacher;
        return this;
    }

    public String getClasstime() {
        return classtime;
    }

    public CRSEntity setClasstime(String classtime) {
        this.classtime = classtime;
        return this;
    }

    public int getVahed() {
        return vahed;
    }

    public CRSEntity setVahed(int vahed) {
        this.vahed = vahed;
        return this;
    }
}
