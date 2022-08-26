package ch42;
//내부 클래스란? (inner class)
// 주로 private으로 설정
//클래스 내부에 선언한 클래스로 이 클래스를 감싸고 있는 외부 클래스와 밀접한 연관이 있는 경우가 많고,
//다른 외부 클래스에서 사용할 일이 거의 없는 경우에 내부 클래스로 선언해서 사용함
//중첩 클래스라고도 함
//내부 클래스의 종류
//인스턴스 내부 클래스, 정적(static) 내부 클래스, 지역(local) 내부 클래스, 익명(anonymous) 내부 클래스
//인스턴스 내부 클래스
//내부적으로 사용할 클래스를 선언 (private으로 선언하는 것을 권장)
//외부 클래스가 생성된 후 생성됨 ( 정적 내부 클래스와 다름 )
//private이 아닌 내부 클래스는 다른 외부 클래스에서 생성할 수 있음
//OutClass outClass = new OutClass();

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass InClass;

    public OutClass(){
        InClass = new InClass(); // Inclass객체를 생성하고 나면 Inclass 메서드를 사용할수있다.
    }
    class InClass{
        int iNum = 100;
        void inTest() {
            System.out.println("Outclass num = " + num + "(Instance of OutClass)");
            System.out.println("Outclass sNum = " + sNum + "(Instance of OutClass)");
            System.out.println("Inclass inNum = " + iNum + "(Instance of InClass)");
        }
    }

    public void usingClass(){
        InClass.inTest(); // 내가 만든 객체의 메서드를 여기서 호출
    }
}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass(); // Outclass타입 생성하면 자동적으로 Inclass 객체 생성된다.
        outClass.usingClass();

    }
}
