package Golestan.Student.access.grades.semester;

import java.util.List;

public class GS {
    public void showReport(){
        System.out.println("نمرات این ترم شما:");
        try {
            List<GSEntity> result = GSService.getInstance().report();
            for(GSEntity gsEntity : result){
                System.out.println("نام درس:" + gsEntity.getSubject() + "   ");
                System.out.println("نام استاد" + gsEntity.getTeacher() + "   ");
                System.out.println("ضریب(تعداد واحد):" + gsEntity.getVahed() + "   ");
                System.out.println("زمان کلاس:"+gsEntity.getClasstime() + "   ");
                System.out.println("نمره:" + gsEntity.getGrade() + "   ");
            }

        }
        catch (Exception e){
            System.out.println("an error occurred!" + "  " + e.getMessage());
        }
    }
}
