package ch48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamTest2 {
    public static void main(String[] args) {
        int i;

        try (FileInputStream fis= new FileInputStream("input.txt")){
            while ((i = fis.read()) != -1) { // 한바이트씩 읽는다.
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
