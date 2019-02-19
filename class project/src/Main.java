import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student dan = new Student("Dan",0);
        ArrayList<Course> courses = new ArrayList<>();
        System.out.println(dan.getFirstName());
        System.out.println(dan.getStudentID());
        System.out.println(dan.courses);

        Student timothy = new Student("timothy", 1);
        System.out.println(timothy.getFirstName());
        System.out.println(timothy.getStudentID());
        System.out.println(timothy.courses);

    }
}
