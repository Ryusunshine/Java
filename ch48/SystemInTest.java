package ch48;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
표준 출력(모니터) 스트림
System.out.println("출력 메세지");

System.in
표준 입력(키보드) 스트림
int d = System.in.read() // 한 바이트 읽기

System.err
표준 에러 출력(모니터) 스트림
System.err.println("에러 메세지");
 */

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("Input multiple alphabets and press [Enter]");
        int i;
        try {
            InputStreamReader irs = new InputStreamReader(System.in); // 보조 stream. 원래 한글 반환해주는 stream
            // InputStreamReader는 byte를 문자로 바꿔주는 클래스. 매개변수로는 다른 input stream을 받으면된다.
            while((i = System.in.read()) != '\n'){;// 읽을떄 오류가 날수 있어서 try-catch문 작성한다.
                //System.out.println(i);
                System.out.print((char)i);}
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
