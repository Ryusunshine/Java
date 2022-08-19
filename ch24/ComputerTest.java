package ch24;

public class ComputerTest {
    public static void main(String[] args) {
        // 추상클래스는 상속을 하기위해서 만든 클래스
        // Computer computer = new Computer(); 컴퓨터타입은 추상클래스라서 미완성설계도라 제품을 못만든다.
        Computer desktop = new Desktop(); // Desktop에서 구현한 Computer 추상메서드를 Computer 리모콘으로 사용가능하다
        desktop.display();

    }
}
