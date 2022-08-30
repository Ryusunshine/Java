package ch49;

import ch48.FileOutputStreamTest1;

/*
BufferedInputStream과 BufferedOutputStream
약 8k의 배열이 제공되어 입출력이 빠르게 하는 기능이 제공되는 보조 스트림
BufferedReader와 BufferedWriter는 문자용 입출력 보조 스트림
BufferedInputStream과 BufferedOutputStream을 이용하여 파일 복사하는 예
 */

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) throws FileNotFoundException {
        long millisecond = 0;
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))){
            millisecond = System.currentTimeMillis(); // 한번 timestep찍는다
            int i;
            while ((i = bis.read()) != -1){ // while문을 이용해서 파일에서 한 바이트씩 읽는다.
                bos.write(i); //읽은걸 파일에다가 써준다.
            }
            millisecond = System.currentTimeMillis() - millisecond;

        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(millisecond + ": consumed time");
    }
} // 결론: 한 바이트씩 읽고 쓰면 시간이 오래걸려서 buffer로 감싸준다.
