package ch53;

import java.io.IOException;

//Thread 종료하기 예제
//
//        세 개의 thread를 만든다.
//        각각 무한 루프를 수행하게 한다.
//        작업 내용 this.sleep(100);
//
//        ‘A’ 를 입력 받으면 첫 번째 thread를
//        ‘B’ 를 입력 받으면 두 번째 thread를
//        ‘C’ 를 입력 받으면 세 번째 thread를
//        ‘M’을 입력 받으면 모든 thread와 main() 함수를 종료한다.
public class TerminateThread extends Thread{

        private boolean flag = false;//flag값을 default로 false로 두고 쓰레드를 멈출때는 true로 설정해서 멈추게한다.
        int i;
    // 서비스같은경우는 쓰레드가 무한루프이다

        public TerminateThread(String name){
            super(name);
        }

        public void run(){


            while(!flag){//!flag = true임
                try {
                    sleep(100); //하는일은 잣다깻다 반복
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            System.out.println( getName() + " end" );

        }

        public void setFlag(boolean flag){
            this.flag = flag;
        }


        public static void main(String[] args) throws IOException {

            TerminateThread threadA = new TerminateThread("A");
            TerminateThread threadB = new TerminateThread("B");
            TerminateThread threadC = new TerminateThread("C");

            threadA.start();
            threadB.start();
            threadC.start();

            int in;
            while(true){
                in = System.in.read();
                if ( in == 'A'){
                    threadA.setFlag(true);
                }else if(in == 'B'){
                    threadB.setFlag(true);
                }else if( in == 'C'){
                    threadC.setFlag(true);
                }else if( in == 'M'){
                    threadA.setFlag(true);
                    threadB.setFlag(true);
                    threadC.setFlag(true);
                    break;
                }else{
                    System.out.println("type again");
                }
            }

            System.out.println("main end");

        }
    }

