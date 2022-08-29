package ch43;
// 함수형 인터페이스 선언하기
//람다식을 선언하기 위한 인터페이스
//익명 함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메서드만을 선언해야함
//@FunctionalInterface 애노테이션(annotation)
//함수형 인터페이스라는 의미, 내부에 여러 개의 메서드를 선언하면 에러남

public interface Add { //람다식 용으로 함수를 선언하겠다 라고 인터페이스에다가 메서드를 선언한다.
    int add(int x, int y);
}
