package Golestan.teacher.access.Salary;

import java.util.List;
import java.util.Scanner;

public class Salary {
    public void salary(){
        System.out.println("لطفا نام کاربری و واحدی که ارائه میدهید را وارد کنید را وارد کنید:");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        long username = Long.parseLong(user);
        String lesson = scanner.nextLine();

        try{
            List<SalaryEntity> salary = SalaryService.getInstance().salary();
            for (SalaryEntity entity : salary){
                if (username == entity.getUsername() && lesson.equals(entity.getLesson()))
                    System.out.println("حقوق شما در این ترم " + entity.getSalary() + " تومان است.");
            }
        }
        catch (Exception e){
            System.out.println("an error occurred!" + e.getMessage());
        }

    }
}
