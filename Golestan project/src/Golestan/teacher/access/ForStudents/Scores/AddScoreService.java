package Golestan.teacher.access.ForStudents.Scores;

import java.util.List;

public class AddScoreService {
    private AddScoreService(){}

    private static AddScoreService addScoreService = new AddScoreService();

    public static AddScoreService getInstance(){return addScoreService;}


    public List<LessonsList> list() throws Exception{
        List<LessonsList> lessonsList;
        try (AddScoreRepository addScoreRepository = new AddScoreRepository()){
            lessonsList = addScoreRepository.showLessonsCode();
        }
        return lessonsList;
    }


    public void add(AddScoreEntity addScoreEntity) throws Exception{
        try (AddScoreRepository addScoreRepository = new AddScoreRepository()){
            addScoreRepository.addScore(addScoreEntity);
            addScoreRepository.commit();
        }
    }
}
