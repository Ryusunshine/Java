package ch54;

//Synchronized로 되있는 메서드가 실행되는 동안 this가 포함된 객체에 락을 건다.
// 그래서 다른 메서드들이 접근을 못하게 된다. 그리고나서 실행하면 saveMoney한 다음에 minusMoney 가 실행된다.
// 원래는 sleep()이 짧은 minusMoney()가 먼저 실행되고서 saveMoney()가 실행되었다.
//다시말해서 shared resource(Bank에 들어있는 돈)에 대해서 접근권을 하나의 쓰레드가 먼저 갖게되면 다른 쓰레드는 기다리게된다.
// 이걸 block상태가 된다 라고 말한다.

class Bank{

    private int money = 10000;

    public synchronized  void saveMoney(int save){ //synchronized 메서드 방식 block방식이 있는데
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
        //쓰레드에가 synchornized를 걸면
        //synchronized() <= 괄호안에 어떤 리소스에다가 synchronize걸지 넣어주면된다.

        //synchronized (SyncMain.myBank);
        System.out.println("start save");
        SyncMain.myBank.saveMoney(3000);
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

    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {

        Park p = new Park();
        p.start(); // 박씨가 먼저 3000원을 입금한후

        Thread.sleep(200);

        ParkWife pw = new ParkWife(); // 박씨 와이프가 1000원을 쓴다.
        pw.start();
    }

}
