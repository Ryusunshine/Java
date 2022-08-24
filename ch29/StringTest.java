package ch29;
// class 클래스 사용하기
// 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨
// Class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드가 제공됨
//Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드 함

//동적 로딩
//컴파일 시에 데이터 타입이 binding 되는 것이 아닌, 실행(runtime) 중에 데이터 타입을 binding 하는 방법
//프로그래밍 시에는 문자열 변수로 처리했다가 런타임시에 원하는 클래스를 로딩하여 binding 할 수 있다는 장점
//컴파일 시에 타입이 정해지지 않으므로 동적 로딩시 오류가 발생하면 프로그램의 심각한 장애가 발생가능

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // 밑에 코드가 없으면 classNotfoundException이 발생한다라는 뜻
        Class c = Class.forName("java.lang.String");

        Constructor[] cons = c.getConstructors();
        //getConstructors 함수는 배열을 반환한다
        for (Constructor co : cons) {
            System.out.println(co);
        }

        Method[] m = c.getMethods();
        for (Method me : m){
            System.out.println(me);
        }


    }
}
