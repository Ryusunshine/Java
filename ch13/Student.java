package ch13;

public class Student {
    String studentName;
    int money;

    public Student (String studentName, int money){
        this.studentName = studentName;
        this.money = money;
        // student 생성자(constructor)를 생성
        // 학생 한명이 생성이 되면 그 학생의 이름과 돈을 인수로 받음\
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;

    }
    public void showInfo(){
        System.out.println(studentName + "'s leftover is "+ money);
    }

}
