package Golestan.Student.access.courses.reportoverall;

import Golestan.Student.access.courses.reportsemester.CRSEntity;

public class CROEntity {
    private String subject , teacher , classtime;
    private int vahed , totalPassedVahed , totalFailedVahed;
    private boolean passed;

    public String getSubject() {
        return subject;
    }

    public CROEntity setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getTeacher() {
        return teacher;
    }

    public CROEntity setTeacher(String teacher) {
        this.teacher = teacher;
        return this;
    }

    public String getClasstime() {
        return classtime;
    }

    public CROEntity setClasstime(String classtime) {
        this.classtime = classtime;
        return this;
    }

    public int getVahed() {
        return vahed;
    }

    public CROEntity setVahed(int vahed) {
        this.vahed = vahed;
        return this;
    }

    public int getTotalPassedVahed() {
        return totalPassedVahed;
    }

    public CROEntity setTotalPassedVahed(int totalPassedVahed) {
        this.totalPassedVahed = totalPassedVahed;
        return this;
    }

    public int getTotalFailedVahed() {
        return totalFailedVahed;
    }

    public CROEntity setTotalFailedVahed(int totalFailedVahed) {
        this.totalFailedVahed = totalFailedVahed;
        return this;
    }
}
