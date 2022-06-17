package Golestan;

import Golestan.Employee.Employee;
import Golestan.Student.entry.Student;
import Golestan.teacher.Entry.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();
        Student student = new Student();
        Employee employee = new Employee();
        System.out.println("به سامانه گلستان خوش آمدید." + "\n" +
                "جهت ورود به سامانه بر روی یک گزینه کلیک کنید.");
        String a = scanner.nextLine();
        int enter = Integer.parseInt(a);
        switch (enter) {
            case 1:
                try {
                    teacher.wait();
                } catch (InterruptedException e) {
                    System.out.println("an error occurred!" + e.getMessage());
                }
                break;
            case 2:
                try {
                    student.students();
                }catch (Exception e){
                    System.out.println("an error occurred!" + e.getMessage());
                }
                break;
            case 3:
                try {
                    employee.wait();
                } catch (Exception e){
                    System.out.println("an error occurred!" + e.getMessage());
                }
                break;
            default:
                System.out.println("لطفا یکی از گزینه های 1 و 2 و 3 را انتخاب کنید.");
        }
    }
}
