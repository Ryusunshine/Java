package ch52;

class MyThread2 implements Runnable{ //이미 다른걸 extends한 경우에는
    // class MyThread implements Runnable{}하면 된다.

    @Override
    public void run() {
        for (int i = 0; i < 200; i ++){
            System.out.println(i + "\t");}
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + "start");
        MyThread2 runnable = new MyThread2();
        Thread th1 = new Thread(runnable);// 쓰레드생성하면 괄호()안에 runnable을 매개변수로 넣는다.
        Thread th2 = new Thread(runnable);
        // 그럼 runnable의 run되는 기반으로 쓰레드가 돌아간다.
        th1.start();
        th2.start();//그리고서 애네들을 start하면된다.
        System.out.println(Thread.currentThread() + "end");

        //Runnable은 쓰레드화 될수있는 인터페이스이므로
        Runnable run = new Runnable() { // 익명내부 클래스로 만들수있다.
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        run.run();
    }
}
