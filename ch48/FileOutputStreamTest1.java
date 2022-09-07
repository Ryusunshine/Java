package ch48;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("File1");) {
            //파일에 한 바이트씩 쓰기
            fos.write(65); // 숫자를 쓰면 그에 해당하는 글자가 나옴.
            fos.write(66);
            fos.write(67);

        } catch (IOException e) {
            System.out.println(e);        }

        System.out.println("end");
    }
}
