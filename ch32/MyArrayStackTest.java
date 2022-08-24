package ch32;

import ch30.MyArray;

public class MyArrayStackTest {
    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // 배열이 꽉차면 더이상 데이터를 안넣는다.

        stack.printAll();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
