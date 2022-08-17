package ch14;

public class student {
    String name;
    int grade;
    int money;

    public student(String name, int grade, int money){
        this.name = name;
        this.grade = grade;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1200); // 버스라는 객체에 1000을 지불
        this.money -= 1200;
    }

    public void takeSubway(Subway subway){
        subway.take(1500);
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println(grade + "th grade "+ name + " student has "+money+ " won left");
    }

}
