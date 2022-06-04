package Golestan.teacher.access.Salary;


public class SalaryService {
    private SalaryService(){}

    private static SalaryService salaryService = new SalaryService();
    public static SalaryService getInstance() {return salaryService;}

    public void salary (SalaryEntity salaryEntity) throws Exception{
        try (SalaryRepository salaryRepository = new SalaryRepository()) {
            salaryEntity.setSalary(salaryEntity.getSalary() - (salaryEntity.getSalary() * 10 / 100 ));
        }
    }
}
