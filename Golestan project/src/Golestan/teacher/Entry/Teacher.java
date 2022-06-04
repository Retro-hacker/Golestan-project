package Golestan.teacher.Entry;

import Golestan.teacher.access.ForStudents.Scores.AddScore;
import Golestan.teacher.access.ForStudents.Enrolled.EnrolledStudents;
import Golestan.teacher.access.ForStudents.Exam.Exam;
import Golestan.teacher.access.ForStudents.Enrolled.Remove.RemoveStudent;
import Golestan.teacher.access.Lessons.Lessons;
import Golestan.teacher.access.Salary.Salary;

import java.util.Scanner;

public class Teacher {
    public void teachers() throws Exception {
        Lessons lessons = new Lessons();
        Exam exam = new Exam();
        RemoveStudent removeStudent = new RemoveStudent();
        Salary salary = new Salary();
        AddScore addScore = new AddScore();
        EnrolledStudents enrolledStudents = new EnrolledStudents();
        Scanner scanner = new Scanner(System.in);
        System.out.println("به اتاق اساتید خوش آمدید جهت ورود به صفحه کاربری خود نام کاربری و رمزعبور خود را وارد کنید:");
        String username = scanner.nextLine();
        long user = Integer.parseInt(username);
        String password = scanner.nextLine();

       //if () {
            System.out.println("جهت مشاهده لیست دروس عدد 1 ، وارد کردن نمره دانشجو عدد 2 ، مشاهده حقوق جاری عدد 3 ، حذف دانشجو به علت غیبت عدد 4 ، مشاهده رشته دانشجویان، تعداد و ورودی به ازاری هر درس عدد 5 ، مشاهده ارزشیابی دانشجویان عدد 6 را وارد کنید:");
            String Choice = scanner.nextLine();
            int choice = Integer.parseInt(Choice);
                switch (choice) {
                    case 1:
                        lessons.presentLessons();
                    case 2:
                        addScore.addScore();
                        break;
                    case 3:
                        salary.salary();
                    case 4:
                        removeStudent.Remove();
                    case 5:
                        enrolledStudents.EnrolledStudents();
                    case 6:
                        exam.exam();
                    default:
                        System.out.println("لطفا یکی از اعداد بین 1 تا 6 را انتخاب کنید");
                        break;
                }
       // }
    }

    }
