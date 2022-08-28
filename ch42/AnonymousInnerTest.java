package ch42;

//지역 내부 클래스
//지역 변수와 같이 메서드 내부에서 정의하여 사용하는 클래스
//메서드의 호출이 끝나면 메서드에 사용된 지역변수의 유효성은 사라짐
//메서드 호출 이후에도 사용해야하는 경우가 있을 수 있으므로 지역 내부 클래스에서 사용하는 메서드의 지역변수나 매개변수는 final 로 선언됨
// MyRunnable 클래스를 사용하려면 직접 생성하는 것이 아닌 getRunnable()메서드를 호출하여 생성된 개체를 반환 받아야 함

class Outer{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        final int num = 100;

        return new Runnable() {//runnable인터페이스를 구현한 클래스를 만듦.
            // 원래는 class MyRunnable implements Runnable 인데 굳이 이 클래스 이름이 메서드안 말고는 딴데에서 쓰일 필요가 없어서
            // MyRunnable을 지우고 바로 return new 타입을 때린다.
            int localNum = 10;

            @Override
            public void run() { // 나중에 run()메서드는 또 호출가능한데 이때 인스턴스 변수(num, i)는 없을수도 잇어서 assign이 안된다.
                //따라서 i는 final로 설정한다.

                //num = 200;   //에러 남. 지역변수는 상수로 바뀜
                //i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
                System.out.println("i =" + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                // 사용가능. Outer클래스가 만들어지면 MyRunnable이 생성됨.
                System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
            };

        }
        Runnable runnable = new Runnable() { // 다른방식. Runnable타입의 변수 runnable를 만들었고 메서드를 implement할수도 있다.
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        };
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(100);
        runner.run();


    }
}