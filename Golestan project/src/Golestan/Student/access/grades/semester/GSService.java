package Golestan.Student.access.grades.semester;


import java.util.List;

public class GSService {
    private static GSService gsService = new GSService();
    public static GSService getInstance() { return gsService; }

    public List<GSEntity> report() throws Exception{
        List<GSEntity> gs;
        try (GSRepo gsRepo = new GSRepo()) {
            gs = gsRepo.showGrades();
        }
        return gs;
    }


}
