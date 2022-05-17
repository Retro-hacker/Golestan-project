package Golestan.teacher.MVC;

public class TeacherService {
    private TeacherService(){}

    private static TeacherService teacherService = new TeacherService();
    public static TeacherService getInstance(){
        return teacherService;
    }

    public void salary (TeacherEntity teacherEntity) throws Exception{
        try (TeacherRepository teacherRepository = new TeacherRepository()) {
            teacherEntity.setSalary(teacherEntity.getSalary() - (teacherEntity.getSalary() * 10 / 100 ));
        }
    }
}
