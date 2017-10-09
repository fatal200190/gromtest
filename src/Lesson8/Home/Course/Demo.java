package Lesson8.Home.Course;



/**
 * Created by Alex on 09.08.2017.
 */
public class Demo {
    public static void main(String[] args) {
    }

    public static Student createHighestParent(){
        Student student = new Student("DD","ff",4, null);
        return student;
    }
    public static SpecialStudent createLowestChild(){
        SpecialStudent specialStudent = new SpecialStudent("dd","ff", 4, null, 123, "ddd");
        return specialStudent;
    }

}
