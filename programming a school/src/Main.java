public class Main {

    public static void main(String[] args) {

        school Renfrew = new school("Renfrew","Mr. Salads","3315 E. 22nd Ave");

        Renfrew.addStudent( new student("a ", "1", 12));

        Renfrew.addStudent( new student("b ", "1", 12));

        Renfrew.addStudent( new student("c ", "1", 12));

        Renfrew.addStudent( new student("d ", "1", 12));

        Renfrew.addStudent( new student("e ", "1", 12));

        Renfrew.addStudent( new student("f ", "1", 12));

        Renfrew.addStudent( new student("g ", "1", 12));

        Renfrew.addStudent( new student("h ", "1", 12));

        Renfrew.addStudent( new student("i ", "1", 12));

        Renfrew.addStudent( new student("j ", "1", 12));


        Renfrew.addTeacher( new Teacher("A ", "2","History 12"));

        Renfrew.addTeacher( new Teacher("B ", "2","Pre-Calculus 12"));

        Renfrew.addTeacher( new Teacher("C ", "2","Chemistry 12"));


        System.out.println(Renfrew.allTeachers());

        System.out.println(Renfrew.allStudents());


        Renfrew.deleteStudent(2);

        Renfrew.deleteTeacher(0);

        Renfrew.deleteTeacher(1);


        System.out.println(Renfrew.allStudents());

        System.out.println(Renfrew.allTeachers());



    }

}
