package Golestan.teacher.access.ForStudents.Scores;

public class AddScoreEntity {
    private long studentUsername;
    private float score;
    private int course;

    public int getCourse() {
        return course;
    }

    public AddScoreEntity setCourse(int course) {
        this.course = course;
        return this;
    }

    public long getStudentUsername() {
        return studentUsername;
    }

    public AddScoreEntity setStudentUsername(long studentUsername) {
        this.studentUsername = studentUsername;
        return this;
    }

    public float getScore() {
        return score;
    }

    public AddScoreEntity setScore(float score) {
        this.score = score;
        return this;
    }


}
