package Golestan.teacher.access.ForStudents.Enrolled;

import Golestan.teacher.Entry.TeacherRepository;

import java.util.Scanner;

public class EnrolledStudents {
    public void EnrolledStudents() throws Exception {
        Scanner scanner = new Scanner(System.in);
        TeacherRepository teacherRepository = new TeacherRepository();
        System.out.println("لطفا نام واحدی که ارائه می دهید را وارد کیند:");
        String vahed = scanner.nextLine();
        teacherRepository.enroll(vahed);

    }
}
