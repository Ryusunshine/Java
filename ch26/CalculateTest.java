package ch26;

public class CalculateTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        Calculate cal = new complicatedCalculator(); // complicatedCalculator는 Calculate인터페이스를 구현했고 동시에 타입이다.

        System.out.println(cal.add(num1, num2));
        System.out.println(cal.substract(num1, num2));
        System.out.println(cal.times(num1, num2));
        System.out.println(cal.divide(num1, num2));

    }
}
