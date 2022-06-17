package Golestan.Student.entry;


import Golestan.Student.access.courses.courseselection.CS;
import Golestan.Student.access.courses.reportoverall.CRO;
import Golestan.Student.access.courses.reportsemester.CRS;
import Golestan.Student.access.grades.overall.GO;
import Golestan.Student.access.grades.semester.GS;
import Golestan.Student.access.tuition.Tuition;

import java.util.List;
import java.util.Scanner;

public class Student {

    public void students() throws Exception{

        Scanner scanner = new Scanner(System.in);

        Tuition tuition = new Tuition();
        GS gs = new GS();
        GO go = new GO();
        CRS crs = new CRS();
        CRO cro = new CRO();
        CS cs = new CS();

        System.out.println("به اتاق دانشجویان خوش آمدید."+"\n"+
                "جهت ورود به صفحه کاربری خود نام کاربری و رمز خود را وارد کنید:");
        String user = scanner.nextLine();
        long username = Long.parseLong(user);
        String pass = scanner.nextLine();
        long password = Long.parseLong(pass);
        try{
            List<StudentEntity> enter = StudentService.getStudentService().enter();
            for (StudentEntity entity : enter) {
                if (username == entity.getUsername() && password == entity.getPassword()) {
                    System.out.println("دانشجو " + entity.getName() + " به پنل کاربری خود خوش آمدید.");
                    System.out.println("case and switch commands");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            cs.
                        case 2:
                            tuition.tuition();
                            break;
                        case 3:
                            crs.showReport();
                            break;
                        case 4:
                            cro.showReport();
                            break;
                        case 5:
                            gs.showReport();
                            break;
                        case 6:
                            go.
                        default:
                            System.out.println("لطفا یکی از اعداد بین 1 تا 6 را انتخاب کنید");
                            break;
                         }
                    }
                else
                    System.out.println("نام کاربری یا رمز عبور اشتباه است!");
                }
            }catch (Exception e){
            System.out.println("An error occurred!" + e.getMessage());
        }
        }
    }
