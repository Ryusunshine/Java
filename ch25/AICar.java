package ch25;

//템플릿 메서드
//        추상메서드나 구현된 메서드를 활용하여 코드의 흐름을 정의하는 메서드
//        final로 선언하여 하위 클래스에서 재정의 할 수 없게 함
//        프레임워크에서 많이 사용하는 설계 패턴
//        추상 클래스로 선언된 상위 클래스에서 탬플릿 메서드를 활용하여 전체적인 흐름을 정의하고 하위 클래스에서 다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현하도록 함.


public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("AICar drives automatically");
        System.out.println("AICar changes direction itself");
    }

    @Override
    public void stop() {
        System.out.println("AICar stops itself in front of an obstacle ");
    }
}
