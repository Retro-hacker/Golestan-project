package Golestan.teacher.access.ForStudents.Scores;

import java.util.List;
import java.util.Scanner;

public class AddScore {
    public void addScore() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("لطفا شماره دانشجویی و کد درس و نمره دانشجو را وارد کنید:");
        System.out.println("کد دروس عبارتند از:");
        try {
            List<LessonsList> show = AddScoreService.getInstance().list();
            for (LessonsList list : show){
                System.out.println(list.getId()+" : " + list.getLesson());
            }
        }catch (Exception e){
            System.out.println("an error occurred!" + e.getMessage());
        }

        System.out.println("وارد کنید:");

        String ID = scanner.nextLine();
        Long id = Long.parseLong(ID);
        String lesson = scanner.nextLine();
        int lessonId = Integer.parseInt(lesson);
        String Score = scanner.nextLine();
        float score = Float.parseFloat(Score);

        try{
            if (score >= 0 && score <= 20) {
                AddScoreService.getInstance().add(new AddScoreEntity().setStudentUsername(id).setCourse(lessonId).setScore(score));
                System.out.println("نمره دانشجو با موفقیت ثبت شد.");
            }
            else
                System.out.println("لطفا نمره را بین 0 تا 20 قرار دهید!");
        }catch (Exception e){
            System.out.println("an error occurred!" + e.getMessage());
        }
    }
}
