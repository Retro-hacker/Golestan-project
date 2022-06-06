package Golestan.teacher.access.Lessons;

import java.util.List;

public class Lessons {
    public void presentLessons() {
        System.out.println("دروس اساتید عبارتند از:");
        System.out.println();
        try {
            List<LessonsEntity> result = LessonsService.getInstance().Lessons();
            for(LessonsEntity lessonsEntity : result){
                System.out.print("نام استاد: "+lessonsEntity.getName() + "   ");
                System.out.print("نام واحد: "+lessonsEntity.getLessons() + "   ");
                System.out.print("روز: "+lessonsEntity.getDay() + "   ");
                System.out.print("ساعت: "+lessonsEntity.getTime() + "   ");
                System.out.println("تعداد جلسات: "+lessonsEntity.getCourses());
                System.out.println();
            }

        }
        catch (Exception e){
            System.out.println("an error occurred!" + "  " + e.getMessage());
        }
    }
}
