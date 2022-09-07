package ch44;

import ch18.Array;
import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{ //밑의 클래스의 더 짧은 버젼

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length > s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String greeting[] = {"Hello", "Ryusun","How are you?"};
        System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) -> {
            if (s1.getBytes().length > s2.getBytes().length) return s1;
            else return s2;
            // getbytes 로 해서 bytes array가 오고 함수가 아니기때문에 length()가 아닌 length라고 쓴다.
        }));

        String str = Arrays.stream(greeting).reduce(new CompareString()).get(); // CompareString클래스의 호출방법
        // reduce 함수를 사용하여 CompareString클래스를 인스턴스화 시키고 get()를 이용해서 반환한다.
        System.out.println(str);
    }
}
