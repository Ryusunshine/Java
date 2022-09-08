package Test;

import School.School;
import School.Subject;
import School.Student;
import School.report.GenerateGradeReport;
import Utils.Define;
import School.Score;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GradeTest {
    School SunshineSchool = School.getInstance();
    Subject korean;
    Subject math;

    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) throws FileNotFoundException {

        GradeTest test = new GradeTest();
        test.creatSubject();
        test.createStudent();

        String report = test.gradeReport.getReport(); //성적 결과 생성
        System.out.println(report); // 출력

    }

    public void creatSubject(){

        korean = new Subject("Korean", Define.KOREAN);
        math = new Subject("Math", Define.MATH);

        SunshineSchool.addSubject(korean);
        SunshineSchool.addSubject(math);
    }

    public void createStudent() throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileInputStream("studentinfo.txt"));

        String name;
        int id;
        int koreanScore;
        int mathScore;
        int majorCode;

        Student student = null;

        while(scanner.hasNextLine()) {

            name = scanner.next();
            id = scanner.nextInt();
            koreanScore = scanner.nextInt();
            mathScore = scanner.nextInt();
            majorCode = scanner.nextInt();

            if(majorCode == Define.KOREAN) {
                student = new Student(name, id, korean );
            }
            else if(majorCode == Define.MATH) {
                student = new Student(name, id, math );
            }
            else {
                System.out.println("전공 과목 오류 입니다");
                return;
            }

            SunshineSchool.addStudent(student);
            korean.register(student);
            math.register(student);
            addScoreForStudent(student, korean, koreanScore);
            addScoreForStudent(student, math, mathScore);

        }
        scanner.close();
    }

    //과목별 성적 입력
    public void addScoreForStudent(Student student, Subject subject, int point){

        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);

    }
}
