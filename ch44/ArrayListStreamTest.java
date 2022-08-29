package ch44;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
*** 스트림 이란?
    자료의 대상과 관계없이 동일한 연산을 수행
    배열, 컬렉션을 대상으로 연산을 수행 함
    일관성 있는 연산으로 자료의 처리를 쉽고 간단하게 함
    자료 처리에 대한 추상화가 구현되었다고 함
    한번 생성하고 사용한 스트림은 재사용 할 수 없음
    자료에 대한 스트림을 생성하여 연산을 수행하면 스트림은 소모됨
    다른 연산을 수행하기 위해서는 스트림을 다시 생성해야 함
    스트림 연산은 기존 자료를 변경하지 않음


 */

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> StringList = new ArrayList<String>();
        StringList.add("Ryusun");
        StringList.add("Ryujin");
        StringList.add("Jewol");

        Stream<String> stream = StringList.stream();
        //collection에 대한 stream을 생성하게 되면 내부적으로 가지고 있는 제너럴타입을 선언해야한다.
        stream.forEach(n-> System.out.println(n));
        System.out.println();

        // 다른 연산을 사용할수없음. 스트림을 재생성해야함.

        // 스트림 생성
        StringList.stream().sorted().forEach(s -> System.out.println(s + "\t" ));
        System.out.println();
        StringList.stream().map(s->s.length()).forEach((s -> System.out.println(s)));
        System.out.println();
        StringList.stream().filter(m -> m.length()>= 6).forEach(m -> System.out.println(m));
    }
}
