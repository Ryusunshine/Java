package ch43;
// 람다식(Lambda expression)
//함수형 프로그래밍과 람다식
//자바는 객체 지향 프로그래밍 : 기능을 수행하긴 위해서는 객체를 만들고 그 객체 내부에 멤버 변수를 선언하고 기능을 수행하는 메서드를 구현
//자바 8부터 함수형 프로그래밍 방식을 지원하고 이를 람다식이라 함
//함수의 구현과 호출만으로 프로그래밍이 수행되는 방식

public class AddTest {
    public static void main(String[] args) {
        // 람다식 문법
        // 매개 변수와 매개변수를 이용한 실행문 (매개변수) -> {실행문;}
        Add addCal = (x, y) -> {return x+ y;}; // 이 람다식을 add라는 곳에 넣어줌. 이게 람다식 구현
        System.out.println(addCal.add(2, 3));
    }
}
