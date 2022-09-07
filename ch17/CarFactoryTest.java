package ch17;

public class CarFactoryTest {
    public static void main(String[] args) {
        carFactory factory = carFactory.getInstance(); // 유일한 객체에 접근하고
        car sonanta = factory.createCar(); // factory 에서 만든차를 sonata라고 정한다.
        car jeep = factory.createCar();

        System.out.println(sonanta.getCarNum());
        System.out.println(jeep.getCarNum());
    }
}
