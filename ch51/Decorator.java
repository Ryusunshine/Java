package ch51;

public abstract class Decorator extends Coffee { // 이렇게 구현을 해도 abstract로 설정해서 나중에 상속을 위한 클래스로 둔다.

    Coffee coffee;
    public Decorator(Coffee coffee){// 매개변수는 Coffee를 상속받은 애들 모두 다 들어올수잇음.
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
