package School;

import java.util.ArrayList;

public class School {

    private static School instance = new School(); // 싱글톤 인스턴스

    private static String SCHOOL_NAME = "Sunshine School";
    private ArrayList<Subject> subjectList = new ArrayList<Subject>();
    private ArrayList<Student> studentList = new ArrayList<Student>();

    private School(){};

    public static School getInstance() {
        return instance;
    }

    public static void setInstance(School instance) {
        School.instance = instance;
    }

    public static String getSchoolName() {
        return SCHOOL_NAME;
    }

    public static void setSchoolName(String schoolName) {
        SCHOOL_NAME = schoolName;
    }

    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
}
