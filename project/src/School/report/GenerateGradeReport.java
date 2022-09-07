package School.report;

import java.util.ArrayList;

import School.School;
import Grade.BasicEvaluation;
import Grade.GradeEvaluation;
import Grade.MajorEvaluation;
import School.Score;
import School.Student;
import School.Subject;
import Utils.Define;


public class GenerateGradeReport {

    School school = School.getInstance(); // school이 private이라서 getInstance로 접근한다.
    public static final String TITLE = " Student Grade \t\t\n";
    public static final String HEADER = " Name  |  StudentId  |  Major Subject | Grade   \n";
    public static final String LINE = "-------------------------------------\n";
    private StringBuffer buffer = new StringBuffer();// stringBuffer을 써서 쭉 연결시킬거다.

    public String getReport(){
        ArrayList<Subject> subjectList = school.getSubjectList();  // 모든 과목에 대한 학점 산출
        for( Subject subject : subjectList) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return buffer.toString();  // String 으로 반환
    }

    public void makeHeader(Subject subject){ // 인스턴스 메서드
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE );
        buffer.append(GenerateGradeReport.HEADER );
        buffer.append(GenerateGradeReport.LINE);
    }

    public void makeBody(Subject subject){

        ArrayList<Student> studentList = subject.getStudentList();  // 각 과목의 학생들

        for(int i=0; i<studentList.size(); i++){
            Student student = studentList.get(i);
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentId());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getSubjectName() + "\t");
            buffer.append(" | ");

            getScoreGrade(student, subject.getSubjectId());  //학생별 해당과목 학점 계산
            buffer.append("\n");
            buffer.append(LINE);
        }
    }
    public void getScoreGrade(Student student, int subjectId){

        ArrayList<Score> scoreList = student.getScoreList();
        int majorId = student.getMajorSubject().getSubjectId();

        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};  //학점 평가 클래스들
        // 평가방식들을 배열로 구현함. BasicEvaluation이 0번째, MajorEvaluation이 1번째임.

        for(int i=0; i<scoreList.size(); i++){  // 학생이 가진 점수들

            Score score = scoreList.get(i);
            if(score.getSubject().getSubjectId() == subjectId) {  // 현재 학점을 산출할 과목
                String grade;
                if(score.getSubject().getSubjectId() == majorId)  // 중점 과목인 경우
                    grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());  //중점 과목 학점 평가 방법
                // SAB_TYPE = 1이므로 MajorEvauluation 평가 방식이 적용됨.
                else
                    grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint()); // 중점 과목이 아닌 경우
                //AB_TYPE = 0번째, BasicEvaluation 평가방식이 적용됨.

                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append(" | ");
            }
        }
    }

    public void makeFooter(){
        buffer.append("\n");
    }

}
