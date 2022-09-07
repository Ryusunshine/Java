package ch49;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("Reader.txt")) {
            //FileInputStream fis = new FileInputStream("Reader.txt") 처럼 FileInputStream을 쓰면 바이트로 읽기때문에 깨짐.
            int i;
            while ((i = fr.read()) != -1){
                System.out.println((char)i);
            }} catch (IOException e){
            System.out.println(e);
        }
}}
