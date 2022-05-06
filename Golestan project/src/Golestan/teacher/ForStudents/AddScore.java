package Golestan.teacher.ForStudents;

import Golestan.Student.MVC.StudentEntity;
import Golestan.Student.Student;
import Golestan.teacher.MVC.TeacherRepository;

import java.util.Scanner;

public class AddScore {
    public void addScore() throws Exception {
        StudentEntity studentEntity = new StudentEntity();
        Scanner scanner = new Scanner(System.in);
        System.out.println("لطفا شماره دانشجویی دانشجو را وارد کنید:");
        String ID = scanner.nextLine();
        Long id = Long.parseLong(ID);
        String Score = scanner.nextLine();
        int score = Integer.parseInt(Score);
        if (score >= 0 && score <= 20 ){
            studentEntity.setId(id);
            studentEntity.setScore(score);
        }
        else{
            System.out.println("لطفا نمره را بالاتر از 0 و پایین تر از 21 قرار دهید!");
        }

    }
}