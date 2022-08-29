package ch46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        //throws 는 미루겠다 라는 의미. 여기서 handling안하고 이 메서드를 쓰는쪽에서 handling한다.
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className); // forName() : 물리적인 클래스 파일명을 인자로 넣어주면 이에 해당하는 클래스를 반환해줍니다.
        return c;

    }
    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("end"); // exception이 handling되고 현재 코드를 수행.


    }
}
