package Golestan.Student.access.courses.reportsemester;


import java.util.List;

public class CRSService {
    private CRSService(){}

    private static CRSService crsService = new CRSService();
    public static CRSService getInstance() {return crsService;}


    public List<CRSEntity> report() throws Exception{
        List<CRSEntity> crs;
        try (CRSRepo crsRepo = new CRSRepo()) {
            crs = crsRepo.showCourses();
        }
        return crs;
    }
}
