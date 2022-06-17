package Golestan.Student.access.courses.courseselection;

public class CSEntity {
    private int subjectID , vahed;
    private String subjectName;
    private String classtime;
    private String teacher;

    public int getSubjectID() {
        return subjectID;
    }

    public CSEntity setSubjectID(int subjectID) {
        this.subjectID = subjectID;
        return this;
    }

    public int getVahed() {
        return vahed;
    }

    public CSEntity setVahed(int vahed) {
        this.vahed = vahed;
        return this;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public CSEntity setSubjectName(String subjectName) {
        this.subjectName = subjectName;
        return this;
    }

    public String getClasstime() {
        return classtime;
    }

    public CSEntity setClasstime(String classtime) {
        this.classtime = classtime;
        return this;
    }

    public String getTeacher() {
        return teacher;
    }

    public CSEntity setTeacher(String teacher) {
        this.teacher = teacher;
        return this;
    }
}
