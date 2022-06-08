package Golestan.teacher.access.ForStudents.Enrolled;

import java.util.List;

public class EnrolledService {

    private EnrolledService(){}

    private static EnrolledService enrolledService = new EnrolledService();

    public static EnrolledService getInstance(){return enrolledService;}

    public List<EnrolledEntity> show() throws Exception{
        List<EnrolledEntity> listInfo;
        try(EnrolledRepository enrolledRepository = new EnrolledRepository()){
            listInfo = enrolledRepository.showLesson();
        }
        return listInfo;
    }

    public List<EnrolledEntity> showStudents() throws Exception{
        List<EnrolledEntity> studentsInfo;
        try(EnrolledRepository enrolledRepository = new EnrolledRepository()){
            studentsInfo = enrolledRepository.showStudents();
        }
        return studentsInfo;
    }


}
