package ch25;

public class CarTest {
    public static void main(String[] args) {
        Car aicar = new AICar();
        // Car 클래스 리모콘에는 메서드 + 추상메서드가 들어있고 AIcar 클래스 리모콘은 추상메서드를 구현한 정보만 들어있으니깐 리모콘을
        // Car타입으로 써야해!
        aicar.run();

        Car manualcar = new ManualCar();
        manualcar.run();
    }
}
