package ch46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*

예외 처리 미루기
예외 처리는 예외가 발생하는 문장에서 try-catch 블록으로 처리하는 방법과 이를 사용하는 부분에서 처리하는 방법 두 가지가 있음
throws를 이용하면 예외가 발생할 수 있는 부분을 사용하는 문장에서 예외를 처리할 수 있음

 */
public class FileExceptionHandling {
    public static void main(String[] args) { // 여기는 메인창이라서 throws하면 안되고 try, catch해야함

        /*
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            //return;
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
            System.out.println("항상 수행 됩니다.");
        }
        System.out.println("여기도 수행됩니다.");
    }

}*/
        try (FileInputStream fis = new FileInputStream("a.txt")){ // 이렇게 쓰면 close가 자동적으로 됨.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) { // Exception e는 모든 예외의 최고 조상. 그래서 catch의 첫줄에 쓰면 안된다. 그럼 밑의 catch까지 안감
            e.printStackTrace();
        }
    }}