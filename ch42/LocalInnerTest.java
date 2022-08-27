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

class Outer{

    int outNum = 100;
    static int sNum = 200;


    Runnable getRunnable(int i){

        int num = 100;

        class MyRunnable implements Runnable{

            int localNum = 10;

            @Override
            public void run() {
                //num = 200;   //에러 남. 지역변수는 상수로 바뀜
                //i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
                System.out.println("i =" + i);
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable();
    }
}

public class LocalInnerTest {

    public static void main(String[] args) {

        Outer out = new Outer();
        Runnable runner = out.getRunnable(10);
        runner.run();
    }
}
