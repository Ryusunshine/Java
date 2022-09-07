package ch51;

public class Latte extends Decorator {
    public Latte(Coffee coffee) { // 생성자 추가해야함.
        // 추가해야하는 이유는 상위클래스에 생성자가 없어서 하위클래스에는 매개변수가 있는 생성자가 반드시 super를 명시적으로 호출해야한다.
        super(coffee);
    }//그럼 이 Milk 클래스는 Decorator의 클래스를 모두 상속받음

    public void brewing() { // 구현이 되어있지만 다시 오버라이딩해준다.
        super.brewing(); // super(상위클래스)의 제조법을 먼저 부르고
        System.out.println("+ Milk");

    }
}
