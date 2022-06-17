package Golestan.Student.access.courses.reportoverall;

import Golestan.Student.access.courses.reportsemester.CRSEntity;
import Golestan.Student.access.courses.reportsemester.CRSService;

import java.util.List;

public class CRO {
    public void showReport(){
        vaheds();
        details();
    }
    public void vaheds()throws Exception{
        try{
            List<CROEntity> result = CROService.getInstance().report();
            for(CROEntity croEntity : result ){
                System.out.print("تعداد واحد پاس شده: "+ croEntity.getTotalPassedVahed() + "   ");
                System.out.print("تعداد واحد رد شده: "+ croEntity.getTotalFailedVahed() + "   ");
            }
        } catch (Exception e) {
            System.out.println("an error occurred!" + "  " + e.getMessage());
        }
    }
    public void details()throws Exception{
        System.out.println("جزئیات: ");
        try{
            List<CRSEntity> result = CRSService.getInstance().report();
            for(CRSEntity crsEntity : result ){
                System.out.print("نام درس: "+crsEntity.getSubject() + "   ");
                System.out.print("تعداد واحد: "+crsEntity.getVahed() + "   ");
                System.out.print("نام استاد: "+crsEntity.getTeacher() + "   ");
                System.out.print("زمان: "+crsEntity.getClasstime() + "   ");

            }
        } catch (Exception e) {
            System.out.println("an error occurred!" + "  " + e.getMessage());
        }
    }
}
