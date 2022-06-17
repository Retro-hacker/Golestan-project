package Golestan.Student.access.tuition;


import java.util.List;

public class Tuition {
    public void tuition(){
        showtuition();
        paytuition();
    }
    public void showtuition(){
        try{
            List<TuitionEntity> tuition = TuitionService.getInstance().tuition();
            for (TuitionEntity entity : tuition){
                    System.out.println("شهریه قابل پرداخت در این ترم " + entity.getFee() + " تومان است.");
            }
        }
        catch (Exception e){
            System.out.println("an error occurred!" + e.getMessage());
        }


    }
    public void paytuition(){


    }
}
