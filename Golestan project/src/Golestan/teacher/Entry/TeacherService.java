package Golestan.teacher.Entry;

public class TeacherService {
    private TeacherService(){}

    private static TeacherService teacherService = new TeacherService();
    public static TeacherService getInstance(){
        return teacherService;
    }




}
