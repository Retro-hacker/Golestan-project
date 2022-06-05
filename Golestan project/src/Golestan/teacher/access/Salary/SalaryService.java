package Golestan.teacher.access.Salary;


import java.util.List;

public class SalaryService {
    private SalaryService(){}

    private static SalaryService salaryService = new SalaryService();
    public static SalaryService getInstance() {return salaryService;}

    public List<SalaryEntity> salary () throws Exception{
        List<SalaryEntity> salary;
        try (SalaryRepository salaryRepository = new SalaryRepository()) {
            salary = salaryRepository.ShowSalary();
        }
        return salary;
    }
}
