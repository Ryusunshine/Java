package ch44;

import ch18.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int num: arr){
            System.out.println(num);
        }
        Arrays.stream(arr).forEach(n -> System.out.println(n));
        // stream 생성을 하고
        // forEach메서드는 하나씩 꺼내라 라는 의미이고 ()안에는 어떤 일을 할건지 구현한다
        // n은 인자 하나. n이 하나씩 들어올때마다 프린트하는 람다식을 써준다.

        IntStream is = Arrays.stream(arr); //Arrays.stream(arr)가 반환해주는 타입이 IntStream이다.
        is.forEach(n-> System.out.println(n)); // 이 코드를 실행한후에는 is스트림은 소모가 되기때문에 또 사용못한다.\

        int sum = Arrays.stream(arr).sum(); // 그래서 또 스트림을 생성을 해준다. 그리고 이 스트림의 sum()의 대한 반환값이 Int로 설정.
        System.out.println(sum);
    }
}
