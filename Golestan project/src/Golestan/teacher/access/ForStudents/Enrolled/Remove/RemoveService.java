package Golestan.teacher.access.ForStudents.Enrolled.Remove;

public class RemoveService {

    private RemoveService(){}

    private static RemoveService removeService = new RemoveService();

    public static RemoveService getInstance(){return removeService;}


}
