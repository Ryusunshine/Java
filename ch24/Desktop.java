package ch24;

public class Desktop extends Computer{// 컴퓨터를 상속받게 되면 Desktop은 2개의 추상메서드를 상속받개됨
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop turn on");
    }
}
