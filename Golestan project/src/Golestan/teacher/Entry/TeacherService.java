package Golestan.teacher.Entry;

import java.util.List;

public class TeacherService {
    private TeacherService(){}

    private static TeacherService teacherService = new TeacherService();
    public static TeacherService getInstance(){
        return teacherService;
    }


    public List<TeacherEntity> login() throws Exception{
        List<TeacherEntity> entities;
        try ( TeacherRepository teacherRepository = new TeacherRepository()){
            entities = teacherRepository.login();
        }
        return entities;
        }

}
