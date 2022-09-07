package School;

import Utils.Define;

import java.util.ArrayList;

public class Subject {
    private String subjectName;
    private int subjectId;
    private int gradeType;

    // 과목에 따라 듣는 학생수가 다르므로 과목에서 studentList를 관리해야한다.
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Subject(String subjectName, int subjectId){
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeType = Define.AB_TYPE; //기본적으로 A,B타입
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void register(Student student){
        studentList.add(student); //register() 메서드를 호출하면 리스트에 추가 됨
    }
}
