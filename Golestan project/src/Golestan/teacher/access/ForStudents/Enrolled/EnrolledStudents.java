package Golestan.teacher.access.ForStudents.Enrolled;

import Golestan.teacher.Entry.TeacherRepository;

import java.util.List;
import java.util.Scanner;

public class EnrolledStudents {
    public void EnrolledStudents() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("لطفا کد واحدی که ارائه میدهید را وارد کنید:");
        System.out.println("کد واحد ها عبارتند از :");
        try {
            List<EnrolledEntity> showInfo = EnrolledService.getInstance().show();
            for (EnrolledEntity info : showInfo) {
                System.out.println(info.getLessonId() + " : " + info.getTeacherName() + " - " + info.getLesson());
            }
        } catch (Exception e) {
            System.out.println("an error occurred!" + e.getMessage());
        }
        String code = scanner.nextLine();
        long id = Long.parseLong(code);
        try{
            List<EnrolledEntity> showStudents = EnrolledService.getInstance().showStudents();
            for (EnrolledEntity studentInfo : showStudents){
                if (id == studentInfo.getLessonId()){
                    System.out.println(studentInfo.getStudentId() + " - " + studentInfo.getStudentUsername()
                    + " - " + studentInfo.getStudentName() + " - " + studentInfo.getMajor());
                }
            }
        }catch (Exception e){
            System.out.println("an error occurred!" + e.getMessage());
        }
    }
}
