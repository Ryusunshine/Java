package ch19;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee", 1001);
        Student studentKim = new Student("Kim", 1002);

        studentLee.addSubject("Korea", 100);
        studentLee.addSubject("Math", 150);

        studentKim.addSubject("Math", 150);
        studentKim.addSubject("English", 130);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
}
