package Golestan.teacher.access.ForStudents.Enrolled;

public class EnrolledEntity {
    private String major;
    private String lesson;
    private String teacherName;
    private String studentName;
    private long studentId,studentUsername;

    public String getStudentName() {
        return studentName;
    }

    public EnrolledEntity setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }




    public long getStudentUsername() {
        return studentUsername;
    }

    public EnrolledEntity setStudentUsername(long studentUsername) {
        this.studentUsername = studentUsername;
        return this;
    }

    private long lessonId;

    public String getTeacherName() {
        return teacherName;
    }

    public EnrolledEntity setTeacherName(String teacherName) {
        this.teacherName = teacherName;
        return this;
    }


    public String getLesson() {
        return lesson;
    }

    public EnrolledEntity setLesson(String lesson) {
        this.lesson = lesson;
        return this;
    }

    public long getLessonId() {
        return lessonId;
    }

    public EnrolledEntity setLessonId(long lessonId) {
        this.lessonId = lessonId;
        return this;
    }

    public String getMajor() {
        return major;
    }

    public EnrolledEntity setMajor(String major) {
        this.major = major;
        return this;
    }

    public long getStudentId() {
        return studentId;
    }

    public EnrolledEntity setStudentId(long studentId) {
        this.studentId = studentId;
        return this;
    }
}
