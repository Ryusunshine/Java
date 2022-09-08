package Test;


import School.School;
import School.Subject;
import School.report.GenerateGradeReport;
import School.Student;
import School.Score;
import Utils.Define;


public class TestMain {
    School SunshineSchool = School.getInstance();
    Subject korean;
    Subject math;

    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {

        TestMain test = new TestMain();

        test.creatSubject();
        test.createStudent();

        String report = test.gradeReport.getReport(); //성적 결과 생성
        System.out.println(report); // 출력

    }

    //테스트 과목 생성
    public void creatSubject(){

        korean = new Subject("Korean", Define.KOREAN);
        math = new Subject("Math", Define.MATH);

        SunshineSchool.addSubject(korean);
        SunshineSchool.addSubject(math);
    }

    //테스트 학생 생성
    public void createStudent(){

        Student student1 = new Student("Jennie", 1001, korean  );
        Student student2 = new Student("Rose", 1002, math );
        Student student3 = new Student("Jisoo", 1003, korean  );
        Student student4 = new Student("Lisa", 1004, korean  );
        Student student5 = new Student("Ryusun", 1005, math );

        SunshineSchool.addStudent(student1);
        SunshineSchool.addStudent(student2);
        SunshineSchool.addStudent(student3);
        SunshineSchool.addStudent(student4);
        SunshineSchool.addStudent(student5);

        korean.register(student1);
        korean.register(student2);
        korean.register(student3);
        korean.register(student4);
        korean.register(student5);

        math.register(student1);
        math.register(student2);
        math.register(student3);
        math.register(student4);
        math.register(student5);

        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 56);

        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 95);

        addScoreForStudent(student3, korean, 100);
        addScoreForStudent(student3, math, 88);

        addScoreForStudent(student4, korean, 89);
        addScoreForStudent(student4, math, 95);

        addScoreForStudent(student5, korean, 85);
        addScoreForStudent(student5, math, 56);
    }

    //과목별 성적 입력
    public void addScoreForStudent(Student student, Subject subject, int point){

        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);

    }
}
