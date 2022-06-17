package Golestan.Student.access.courses.courseselection;


import java.util.List;

public class CSService {
    private CSService(){}
    private static CSService csService = new CSService();
    public static CSService getInstance(){return csService;}

    public List<CSEntity> report() throws Exception {
        List<CSEntity> cs;
        try (CSRepo csRepo = new CSRepo()) {
            cs = csRepo.showCourses();
        }
        return cs;
    }
}
