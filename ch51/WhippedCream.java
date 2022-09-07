package ch51;

public class WhippedCream extends Decorator {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing() { // 구현이 되어있지만 다시 오버라이딩해준다.
        super.brewing(); // super(상위클래스)의 제조법을 먼저 부르고
        System.out.println("+ Whipped Cream");
    }
}

