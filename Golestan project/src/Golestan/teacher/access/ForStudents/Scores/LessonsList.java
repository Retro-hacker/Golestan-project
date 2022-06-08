package Golestan.teacher.access.ForStudents.Scores;

public class LessonsList {
    private long id;
    private String lesson;

    public long getId() {
        return id;
    }

    public LessonsList setId(long id) {
        this.id = id;
        return this;
    }

    public String getLesson() {
        return lesson;
    }

    public LessonsList setLesson(String lesson) {
        this.lesson = lesson;
        return this;
    }
}
