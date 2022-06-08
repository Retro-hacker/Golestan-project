package Golestan.teacher.access.ForStudents.Enrolled.Remove;

public class RemoveEntity {
    private long studentUsername , lessonId;
    private String situation;

    public long getStudentUsername() {
        return studentUsername;
    }

    public RemoveEntity setStudentUsername(long studentUsername) {
        this.studentUsername = studentUsername;
        return this;
    }

    public long getLessonId() {
        return lessonId;
    }

    public RemoveEntity setLessonId(long lessonId) {
        this.lessonId = lessonId;
        return this;
    }

    public String getSituation() {
        return situation;
    }

    public RemoveEntity setSituation(String situation) {
        this.situation = situation;
        return this;
    }
}
