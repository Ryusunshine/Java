package ch26;

//인터페이스
//인터페이스는 추상메서드로만 구성됨
//모든 변수는 상수로 선언됨(public static final)

public interface Calculate {
    double PI = 3.14;
    int Error = 000000000000;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);




}
