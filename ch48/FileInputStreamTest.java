package ch48;

/*
# InputStream
    바이트 단위 입력 스트림 최상위 추상 클래스
    많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현함
    주요 하위 클래스

    1. FileInputStream
    파일에서 바이트 단위로 자료를 읽습니다.

    2. ByteArrayInputStream
    byte 배열 메모리에서 바이트 단위로 자료를 읽습니다.

    3. FilterInputStream
    기반 스트림에서 자료를 읽을 때 추가 기능을 제공하는 보조 스트림의 상위 클래스
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());

        } catch (IOException e) {
            e.printStackTrace();
            try {
                fis.close();// excepiton이 났을때도 파일 close
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (Exception e1) {
                System.out.println(e1);
        } finally {
            try {
                fis.close();
            } catch (IOException e2) {
                e.printStackTrace();
            } catch (Exception e3) {
                System.out.println(e3);

        }

    }
            System.out.println("end");
}
    }
}
