package ch19;

import java.util.ArrayList;

public class Student {
    int studentNumber;
    String studentName;
    ArrayList<Subject> subjectList; //학생이 수강하는 과목을 배열로 가지고있자.

    Student(String studentName, int studentNumber){
        this.studentNumber = studentNumber;
        this.studentName = studentName;

        subjectList = new ArrayList<>(); // 학생마다 과목배열을 가지고있는다.
    }
    // 어떤 과목을 수강을 하면 subjectList에 넣는 메서드를 하나 만들자
    public void addSubject(String name, int point){
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setPoint(point);

        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject subject: subjectList){
            total += subject.getPoint();
            System.out.println(studentName + " 's "+ subject.getSubjectName() + "'s score is "+ subject.getPoint());
        }
        System.out.println(studentNumber + studentName + "'s total score is "+ total);
    }


}
