package ch34;
/*
제네릭 자료형 정의
클래스에서 사용하는 변수의 자료형이 여러개 일수 있고, 그 기능(메서드)은 동일한 경우 클래스의 자료형을 특정하지 않고
추후 해당 클래스를 사용할 때 지정 할 수 있도록 선언
실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식
컬렉션 프레임워크에서 많이 사용되고 있음
제네릭 타입을 사용하지 않는 경우의 예
 */

public class ThreeDPrinter {
    private Powder material;

    public Powder getMaterial() {
        return material;
    }

    public void setMaterial(Powder material) {
        this.material = material;
    }

    public String toString() {
        return "The material is powder";
    }
}
