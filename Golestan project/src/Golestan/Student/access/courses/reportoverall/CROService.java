package Golestan.Student.access.courses.reportoverall;


import java.util.List;

public class CROService {
    private CROService(){}

    private static CROService croService = new CROService();
    public static CROService getInstance() {return croService;}

    public List<CROEntity> report() throws Exception{
        List<CROEntity> cro;
        try (CRORepo croRepo = new CRORepo()) {
            cro = croRepo.showReport();
        }
        return cro;
    }
}
