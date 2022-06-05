package Golestan.teacher.access.Lessons;

import Golestan.teacher.Entry.TeacherEntity;

import java.util.List;

public class LessonsService {
    private LessonsService(){}

    private static LessonsService lessonsService = new LessonsService();
    public static LessonsService getInstance() { return lessonsService; }

    public List<LessonsEntity> Lessons() throws Exception{
        List<LessonsEntity> entityList;
        try( LessonsRepository lessonsRepository = new LessonsRepository() ){
            entityList = lessonsRepository.showLessons();
        }
        return entityList;
    }

}
