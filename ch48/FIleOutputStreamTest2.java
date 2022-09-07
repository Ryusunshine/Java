package ch48;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputStreamTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        // byte[] 배열에 A-Z 까지 넣고 배열을 한꺼번에 파일에 쓰기
        FileOutputStream fos = new FileOutputStream("file2", true);

        try(fos){
            byte[] bs = new byte[26];
            byte data = 56;
            for (int i =0; i<bs.length; i++){
                bs[i] = data++; //배열에 하나씩 데이터를 넣는다.
            }
            fos.write(bs);// 그리고 그 배열을 파일에 넣는다.
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
