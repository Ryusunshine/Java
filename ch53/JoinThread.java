package ch53;
// join()
//동시에 두 개 이상의 Thread가 실행 될 때 다른 Thread의 결과를 참조 하여 실행해야 하는 경우 join() 함수를 사용
//join() 함수를 호출한 Thread가 not-runnable 상태가 감
//다른 Thread의 수행이 끝나면 runnable 상태로 돌아옴

//1부터 50, 51부터 100 까지의 합을 구하는 두 개의 Thread를 만들어 그 결과를 확인해보세요
public class JoinThread extends Thread{

    int start;
    int end;
    int total;

    public JoinThread(int start, int end){
        this.start = start;
        this.end= end;
        for (int i= start; i<= end; i++){
            total += i;
        }
    }
    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) {

        JoinThread jt1 = new JoinThread(1, 50);
        JoinThread jt2 = new JoinThread(51, 100);
        jt1.start();
        jt2.start();

        try {
            jt1.join();
            jt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        int result = jt1.total + jt2.total;

        System.out.println("jt1.total "+jt1.total);
        System.out.println("jt2.total "+jt2.total);
        System.out.println("jt1 + jt2 = " + result);
    }
}
