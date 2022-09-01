package ch52;
class MyThread extends Thread{ // 자바에는 클래스명 앞에 public이란 접근 제어자를 추가하면 그 클래스의 이름은 파일명과 동일해야만하는 규칙이 있다.
    public void run(){ // Thread가 수행되면 run이라는 메서드가 실행됨.
        for (int i = 0; i < 200; i ++){
            System.out.println(i + "\t");
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + "start");// Thread클래스안에 currentThread()를 부르면 메인에서 돌아가는 쓰래드를 보여준다.
        MyThread threadTest = new MyThread();
        MyThread threadTest2 = new MyThread();

        threadTest.start(); // start를 부르면 thread실행됨
        threadTest2.start();
        System.out.println(Thread.currentThread() + "end");
    }
}
