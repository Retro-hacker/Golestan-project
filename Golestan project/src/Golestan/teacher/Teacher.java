package Golestan.teacher;

import Golestan.teacher.ForStudents.AddScore;
import Golestan.teacher.MVC.TeacherEntity;

import java.util.Scanner;

public class Teacher {
    public void teachers() throws Exception {
        TeacherEntity teacherEntity = new TeacherEntity();
        AddScore addScore = new AddScore();
        Scanner scanner = new Scanner(System.in);
        System.out.println("به اتاق اساتید خوش آمدید جهت ورود به صفحه کاربری خود نام کاربری و رمزعبور خود را وارد کنید:");
        String username = scanner.nextLine();
        int user = Integer.parseInt(username);
        String password = scanner.nextLine();
        if ( user == teacherEntity.getUser() && password == teacherEntity.getPassword()){
            System.out.println("جهت مشاهده لیست دروس عدد 1 ، وارد کردن نمره دانشجو عدد 2 ، مشاهده حقوق جاری عدد 3 ، حذف دانشجو به علت غیبت عدد 4 ، مشاهده رشته دانشجویان، تعداد و ورودی به ازاری هر درس عدد 5 ، مشاهده ارزشیابی دانشجویان عدد 6 را وارد کنید:");
            String Choice = scanner.nextLine();
            int choice = Integer.parseInt(Choice);
            switch (choice){
                case 1:

                case 2:
                    addScore.addScore();
                    break;
                case 3:

                case 4:

                case 5:

                case 6:

                default:

            }
        }

    }
}
