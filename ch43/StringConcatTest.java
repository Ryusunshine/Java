package ch43;

public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatImplication StringTest1 = new StringConcatImplication();
        StringTest1.MakeString("Hello", "Ryusun");

        StringConcat StringTest2 = new StringConcat() {// 익명내부클래스
            @Override
            public void MakeString(String s1, String s2) { // 메서드도 하나만 만들어야된다.
                System.out.println(s1 +" " +s2);

            }
        };
        StringTest2.MakeString("Nice to","meet you");
    }}
/*
    1. 함수형 인터페이스 선언하기

        interface PrintString{
        void showString(String str);
           }
        PrintString lambdaStr = s->System.out.println(s);  //람다식을 변수에 대입
        lambdaStr.showString("hello lambda_1");

    2. 매개변수로 전달하는 람다식

        showMyString(lambdaStr);

        public static void showMyString(PrintString p) {
        p.showString("hello lambda_2");
        }

    2. 반환 값으로 쓰이는 람다식

        public static PrintString returnString() {         //반환 값으로 사용
                return s->System.out.println(s + "world");}

        PrintString reStr = returnString();
        reStr.showString("hello ");

 */

