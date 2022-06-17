package Golestan.Student.access.tuition;


import java.util.List;

public class TuitionService {
    private TuitionService(){}

    private static TuitionService tuitionService = new TuitionService();
    public static TuitionService getInstance() {return tuitionService;}


    public List<TuitionEntity> tuition () throws Exception{
        List<TuitionEntity> tuition;
        try (TuitionRepo tuitionRepo = new TuitionRepo()) {
            tuition = tuitionRepo.showTuition();
        }
        return tuition;
    }
}
