package ch42;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass(); // inclass 이너클래스는 outclass가 먼저 생성되고 난 다음에 생성된다.
        // 그래서 주로 OutClass 생성자에 public OutClass{ InClass  =  new Inclass();}를 적어서 Inclass 이너클래스를 생성한다.
    }

    private class InClass { // 주로 private으로 선언한다. private이 아니면 외부에서도 애를 생성할수있어서
        // private없으면 main메서드에서
        // OutClass.InClass inner = OutClass.new InClass();
        // inner.InTest();로 쓰면된다.
        int iNum = 100;
        static int sInNum = 500;
        void inTest() {
            System.out.println("OutClass num = " + num + "(Instance instance of OutClass)");
            System.out.println("OutClass sNum = " + sNum + "(Static instance of OutClass)");
            System.out.println("InClass sInNum = " + sInNum + "(Instance instance of InClass)");
        }
    }

    public void usingClass(){
        inClass.inTest(); //내가 만든 InClass를 여기서 호출한다.
        // 우선 OutClass객체가 만들어지면 자동적으로 InClass 인스턴스도 만들어지고 이 usingClass 의 메서드를 호출하면 Inclass의
        // inTest메서드를 호출해서 사용할수있다.

    }

    //정적 내부 클래서
    // 외부 클래스 생성과 무관하게 사용할 수 있음
    // 정적변수, 정적 메서드 사용

    static class InStaticClass {//정적 내부 클래스
        int iNum = 100;
        static int sInNum = 200;
        void inTest() {
            //System.out.println("OutClass num = " + num + "(Instance instance of OutClass)");
            // num에서 빨간 밑줄 생김. 외부클래스의 인스턴스 변수는 사용불가
            // 그 이유는 외부 클래스의 인스턴스 변수라서 객체가 외부클래스가 먼저 생성되야지 쓸수있따.
            // 대신 본인 클래스의 인스턴스 변수는 쓸수있음. iNum
            System.out.println("InstaticClass iNum = " + iNum + "(Instance instance of InStaticClass)");
            System.out.println("OutClass sNum = " + sNum + "(Static instance of OutClass)");
            System.out.println("InClass sInNum = " + sInNum + "(Instance instance of InClass)");
    }

        static void sTest() {
            //System.out.println("InstaticClass iNum = " + iNum + "(Instance instance of InStaticClass)");
            // 내부 클래스의 인스턴스 변수는 못씀. static 메서드가 인스턴스 변수 사용못함.
            System.out.println("OutClass sNum = " + sNum + "(Static instance of OutClass)");
            System.out.println("InClass sInNum = " + sInNum + "(Instance instance of InClass)");
        }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass;

        OutClass outclass = new OutClass();
        outclass.usingClass();
    }

}}
