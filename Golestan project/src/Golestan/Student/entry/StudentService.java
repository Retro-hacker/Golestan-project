package Golestan.Student.entry;

import java.util.List;

public class StudentService {
    private StudentService(){}

    private static StudentService studentService = new StudentService();
    public static StudentService getStudentService() {return studentService;}

    public List<StudentEntity> enter() throws Exception{
        List<StudentEntity> access;
        try(StudentRepo studentRepo = new StudentRepo()){
            access = studentRepo.enter();
        }
        return access;
    }
}
