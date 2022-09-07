package ch25;

public abstract class Car {
    public abstract void drive(); // AI 자동차랑 일반자동차랑 운전하는 기능이 다르기때문에 추상메서드로 설정.
    public abstract void stop();
    public void startCar() {
        System.out.println("Start the car.");
    }
    public void turnOffCar() {
        System.out.println("Turn off the car");
    }
    final public void run(){ // 자동차가 달릴때는 똑같은 방식으로 운행함.
    // 이 시나리오는 변하면 안됨. 차를 start하기전에 drive를 먼저할수없음. 그래서 final 로 설정.
        startCar();
        drive();
        stop();
        turnOffCar();
    }
}
