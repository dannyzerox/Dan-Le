import java.util.ArrayList;

public class school {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<student> students = new ArrayList<>();
    String schoolName;
    String principleName;
    String address;

    school(String schoolName, String principleName, String address) {
        this.schoolName = schoolName;
        this.principleName = principleName;
        this.address = address;

    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setPrincipleName(String principleName) {
        this.principleName = principleName;
    }

    public String getPrincipleName() {
        return principleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  String getAddress() {
        return address;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(student student) {
        students.add(student);
    }

    public void deleteTeacher(int pos) {
        teachers.remove(pos);
    }

    public void deleteStudent(int pos) {
        students.remove(pos);
    }

    public ArrayList allTeachers() {
        return teachers;
    }

    public ArrayList allStudents() {
        return students;
    }

    public String toString() {
        return ("Teacherse: " + this.allTeachers() + ". \n Students:" + this.allStudents());
    }
}
