package ch43;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber MyNumber = (x, y) -> x>y? x:y;
        System.out.println(MyNumber.getMax(10, 20));
    }
}
