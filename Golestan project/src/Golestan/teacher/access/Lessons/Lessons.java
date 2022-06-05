package Golestan.teacher.access.Lessons;

import java.util.List;

public class Lessons {
    public void presentLessons() {
        System.out.println("دروس اساتید عبارتند از:");
        try {
            List<LessonsEntity> result = LessonsService.getInstance().Lessons();
            for(LessonsEntity lessonsEntity : result){
                System.out.print(lessonsEntity.getName() + "   ");
                System.out.print(lessonsEntity.getLessons() + "   ");
                System.out.print(lessonsEntity.getDay() + "   ");
                System.out.print(lessonsEntity.getTime() + "   ");
                System.out.println(lessonsEntity.getCourses());
            }

        }
        catch (Exception e){
            System.out.println("an error occurred!" + "  " + e.getMessage());
        }
    }
}
