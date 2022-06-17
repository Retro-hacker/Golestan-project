package Golestan.Student.access.courses.reportsemester;

import java.util.List;

public class CRS {
    public void showReport() throws Exception{
        System.out.println("دروس این ترم شما:");
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
