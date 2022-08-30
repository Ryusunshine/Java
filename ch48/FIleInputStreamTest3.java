package ch48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamTest3 {
    public static void main(String[] args) {
        int i;

        try (FileInputStream fis= new FileInputStream("input2.txt")){
            byte[] array = new byte[10]; //이번에는 byte array를 만든다.
            while ( (i = fis.read(array)) != -1){ //입력 스트림으로부터 한 바이트의 자료를 읽습니다. 읽은 자료의 바이트 수를 반환합니다.
                // 바이트수가 -1이면 end of page이라는 의미.
                for (int j = 0; j<i; j++){ // 읽은걸 하나씩 출력
                    System.out.println((char)array[j]);
                    // for(int ch:array) 쓰면 남아있는 buffer에 qrst인 남은 자료가 들어가서 출력돼서 이렇게 쓰면안되고
                    // 있는 자료만 읽기위해 변수j를 만들어서 buffer의 크기만큼만 출력한다.
                }
                System.out.println((": " +i + "Byte"));

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
