package Golestan.teacher.Entry;

import java.util.List;

public class TeacherService {
    private TeacherService(){}

    private static TeacherService teacherService = new TeacherService();
    public static TeacherService getInstance(){
        return teacherService;
    }

    public void UserEntry(long username) throws Exception{
        TeacherRepository teacherRepository = new TeacherRepository();
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setUser(username);
    }

    public List<TeacherEntity> login() throws Exception{
        List<TeacherEntity> entities;
        try ( TeacherRepository teacherRepository = new TeacherRepository()){
            entities = teacherRepository.login();
        }
        return entities;
        }

}
