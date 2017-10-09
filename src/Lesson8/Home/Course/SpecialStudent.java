package Lesson8.Home.Course;

/**
 * Created by Alex on 09.08.2017.
 */
public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;



    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, long secretKey,String email) {
        super(firstName, lastName, group, coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
    }


}
