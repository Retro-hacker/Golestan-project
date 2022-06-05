package Golestan.teacher.access.Salary;

import java.util.List;
import java.util.Scanner;

public class Salary {
    public void salary(){
        SalaryEntity salaryEntity = new SalaryEntity();
        System.out.println("لطفا نام کاربری را وارد کنید:");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        long username = Long.parseLong(user);
        salaryEntity.setUsername(username);
        try{
            List<SalaryEntity> salary = SalaryService.getInstance().salary();
            for (SalaryEntity entity : salary){
                System.out.println("حقوق شما در این ترم " + entity.getSalary() + " تومان است.");
            }
        }
        catch (Exception e){
            System.out.println("an error occurred!" + e.getMessage());
        }

    }
}
