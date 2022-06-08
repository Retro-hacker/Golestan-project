package Golestan.teacher.Entry;

import Golestan.teacher.access.ForStudents.Scores.AddScore;
import Golestan.teacher.access.ForStudents.Enrolled.EnrolledStudents;
import Golestan.teacher.access.ForStudents.Exam.Exam;
import Golestan.teacher.access.ForStudents.Enrolled.Remove.RemoveStudent;
import Golestan.teacher.access.Lessons.Lessons;
import Golestan.teacher.access.Salary.Salary;

import java.util.List;
import java.util.Scanner;

public class Teacher {
    public void teachers() throws Exception {

        Lessons lessons = new Lessons();

        TeacherEntity teacherEntity = new TeacherEntity();

        Exam exam = new Exam();

        RemoveStudent removeStudent = new RemoveStudent();

        Salary salary = new Salary();

        AddScore addScore = new AddScore();

        EnrolledStudents enrolledStudents = new EnrolledStudents();

        Scanner scanner = new Scanner(System.in);

        System.out.println("به اتاق اساتید خوش آمدید جهت ورود به صفحه کاربری خود نام کاربری و رمزعبور خود را وارد کنید:");

        String username = scanner.nextLine();

        long user = Long.parseLong(username);

        String password = scanner.nextLine();

        try{
            List<TeacherEntity> entryList = TeacherService.getInstance().login();
            for (TeacherEntity login : entryList){
                if (user == login.getUser() && password.equals(login.getPassword())) {
                    System.out.println("استاد "+ login.getName() +" به پنل کاربری خود خوش آمدید.");
                    System.out.println("جهت مشاهده لیست دروس عدد 1 ، وارد کردن نمره دانشجو عدد 2 ، مشاهده حقوق جاری عدد 3 ، حذف دانشجو به علت غیبت عدد 4 ، مشاهده رشته دانشجویان، تعداد و ورودی به ازای هر درس عدد 5 ، مشاهده ارزشیابی دانشجویان عدد 6 را وارد کنید:");
                    String Choice = scanner.nextLine();
                    int choice = Integer.parseInt(Choice);
                    switch (choice) {
                        case 1:
                            lessons.presentLessons();
                            break;
                        case 2:
                            addScore.addScore();
                            break;
                        case 3:
                            salary.salary();
                            break;
                        case 4:
                            removeStudent.Remove();
                            break;
                        case 5:
                            enrolledStudents.EnrolledStudents();
                            break;
                        case 6:
                            exam.exam();
                            break;
                        default:
                            System.out.println("لطفا یکی از اعداد بین 1 تا 6 را انتخاب کنید");
                            break;
                    }
                    break;

                }
            }
    }catch (Exception e){
            System.out.println("an error occurred!" + e.getMessage());
        }

    }
}