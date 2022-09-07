package School;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentId;
    private Subject majorSubject;

    // 학생의 성적 리스트
    private ArrayList<Score> scoreList = new ArrayList<Score>();

    public Student(String studentName, int studentId, Subject majorSubject) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.majorSubject = majorSubject;
    }

    public void addSubjectScore(Score score) {
        scoreList.add(score);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
