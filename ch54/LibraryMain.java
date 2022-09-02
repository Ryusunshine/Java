package ch54;

import java.util.ArrayList;

class SunnyLibrary{

    public ArrayList<String> shelf = new ArrayList<String>();

    public SunnyLibrary(){

        shelf.add("태백산맥 1");
        shelf.add("태백산맥 2");
        shelf.add("태백산맥 3");
    }

    public synchronized String lendBook() throws InterruptedException{

        Thread t = Thread.currentThread();

        if(shelf.size() == 0 ) {//resource가 없으면 기다리게 한다
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }
        String book = shelf.remove(0);
        System.out.println(t.getName() + ": " + book + " lend");

        return book;
    }

    public synchronized void returnBook(String book){
        Thread t = Thread.currentThread();

        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + ": " + book + " return");
    }
    // wait()함수와 notify함수는 object 메서드라서 어느 객체에서 쓸수있다.

}

class student extends Thread {

    public void run() {

        try {
            String title = LibraryMain.library.lendBook(); // library객체를 static으로 설정해서 호출가능
            if (title == null) return;
            sleep(5000);
            LibraryMain.library.returnBook(title);

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}

public class LibraryMain {
    public static SunnyLibrary library = new SunnyLibrary();
    public static void main(String[] args) {
        student std1 = new student();
        student std2 = new student();
        student std3 = new student();
        student std4 = new student();
        student std5 = new student();
        student std6 = new student();

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();

    }
}
