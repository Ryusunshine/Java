package ch25;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("Human drives a car");
        System.out.println("Human controls the handle");
    }

    @Override
    public void stop() {
        System.out.println("Human brakes to a stop in front of an obstacle");

    }
}
