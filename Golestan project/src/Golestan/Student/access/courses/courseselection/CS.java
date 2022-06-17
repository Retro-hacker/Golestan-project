package Golestan.Student.access.courses.courseselection;

import Golestan.Student.access.courses.reportsemester.CRSEntity;
import Golestan.Student.access.courses.reportsemester.CRSService;

import java.util.List;

public class CS{
    public void showCourses()throws Exception{
        System.out.println("واحد های موجود: ");
        try{
            List<CSEntity> result = CSService.getInstance().report();
            for(CSEntity csEntity : result ){
                System.out.print("کد درس: "+csEntity.getSubjectID() + "   ");
                System.out.print("نام درس: "+csEntity.getSubjectName() + "   ");
                System.out.print("تعداد واحد: "+csEntity.getVahed() + "   ");
                System.out.print("نام استاد: "+csEntity.getTeacher() + "   ");
                System.out.print("زمان: "+csEntity.getClasstime() + "   ");

            }
        } catch (Exception e) {
            System.out.println("an error occurred!" + "  " + e.getMessage());
        }
    }
}
