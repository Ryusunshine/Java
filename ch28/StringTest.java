package ch28;

public class StringTest {
    public static void main(String[] args) {
       //String클래스
        String str1 = new String("abc"); //// new 해서 쓸경우 heap에 메모리가 생성된다
        String str2 = "abc";// 주소만 가르킴.

       String java = new String("Java");
       String android = new String("Android");

        //concat함수나 +로 String을 연결하면 기존의 String 에 연결되는 것이 아닌 새로운 문자열이 생성됨
        System.out.println(java.concat(android)); //메모리 낭비
        System.out.println(System.identityHashCode(java));

        //해결점
        //StringBuilder, StringBuffer 활용하기
        // 내부적으로 가변적인 char[]를 멤버변수로 가짐
        // 문자열을 여러번 연결하거나 변경할때 사용
        // - 새로운 인스턴스를 생성하지않고 char[]을 변경함
        //- stringbuffer는 멀티 쓰레드 프로그래밍에서 동기화 보장
        //- 단인 쓰레드 프로그램에서는 stringBuffer 사용을 권장
        //- toString() 메서드로 String 변환






    }
}
