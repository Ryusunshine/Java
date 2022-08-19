package ch24;

public abstract class Computer {
    public abstract void display();
    public abstract void typing(); // 상속받는애들이 알아서 맞게 구현해라

    public void turnOn() {
        System.out.println("Turn on");
    }
    public void turnOff() {
        System.out.println("Turn off");
    }


}
