package ch54;

//Synchronized로 되있는 메서드가 실행되는 동안 this가 포함된 객체에 락을 건다.
// 그래서 다른 메서드들이 접근을 못하게 된다. 그리고나서 실행하면 saveMoney한 다음에 minusMoney 가 실행된다.
// 원래는 sleep()이 짧은 minusMoney()가 먼저 실행되고서 saveMoney()가 실행되었다.
//다시말해서 shared resource(Bank에 들어있는 돈)에 대해서 접근권을 하나의 쓰레드가 먼저 갖게되면 다른 쓰레드는 기다리게된다.
// 이걸 block상태가 된다 라고 말한다.

class Bank{

    private int money = 10000;// 초기 금액

    public synchronized  void saveMoney(int save){ //저축하는 메서드
        //synchronized 메서드 방식 block방식이 있는데
        //synchronized (this) = block방식. 괄호안에다가 lock를 걸 객체를 쓰면된다. 여기서는 this가 수행완료될떄가지 lock를 건다. 라는 의미

        int m = this.getMoney(); ////동기화. 10000원을 가져옴

        try {
            Thread.sleep(3000);//바로 처리 하는게 아니라 thread의 sleep()에 1000분의 1초를 넣으면된다 .
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        setMoney( m + save);
    }

    public synchronized  void minusMoney(int minus){


        int m = this.getMoney();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        setMoney( m - minus);


    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }
}

class Park extends Thread{

    public  void run(){
        //쓰레드에다가 synchornized를 걸면
        //synchronized() <= 괄호안에 어떤 리소스에다가 synchronize걸지 넣어주면된다.

        //synchronized (SyncMain.myBank);
        System.out.println("start save");
        SyncMain.myBank.saveMoney(3000); // SyncMain.myBank가 static 변수이므로 객체 안만들고 객체 호출가능하다.
        System.out.println("saveMoney(3000): " + SyncMain.myBank.getMoney() );
    }
}

class ParkWife extends Thread{

    public void run(){
        System.out.println("start minus");
        SyncMain.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000): " + SyncMain.myBank.getMoney() );

    }

}

public class SyncMain {

    public static Bank myBank = new Bank(); // Bank의 money가 Shared resource가 되야되는데 shared resource는 객체가 되어야하므로
    // Bank를 static으로 shared resource로 설정한다.

    public static void main(String[] args) throws InterruptedException {

        Park p = new Park();
        p.start(); // 박씨가 먼저 3000원을 입금한후

        Thread.sleep(200);

        ParkWife pw = new ParkWife(); // 박씨 와이프가 1000원을 쓴다.
        pw.start();
    }

}
/*
동기화 (synchronization)
두 개의 thread 가 같은 객체에 접근 할 경우, 동시에 접근 함으로써 오류가 발생
동기화는 임계영역에 접근한 경우 공유자원을 lock 하여 다른 thread의 접근을 제어
동기화를 잘못 구현하면 deadlock에 빠질 수 있다.
 */
