package ch33;

import ch31.MyLinkedList;
import ch31.MyListNode;

interface Queue{
    public void enQueue(String data);
    public String deQueue();
    public void printqQueue();
}
public class MyListQueue extends MyLinkedList implements Queue {
    MyListNode front;
    MyListNode rear;

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if (isEmpty()){
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }
        else {
             newNode = addElement(data);
             rear = newNode;
        }
        System.out.println(newNode.getData() +" added");
    }


    @Override
    public String deQueue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        String data = front.getData();
        front = front.next;
        if( front == null ){  // 마지막 인덱스가 null이면 rear도 null
            rear = null;
        }
        return data;
    }

    @Override
    public void printqQueue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        MyListNode temp = front;
        while(temp!= null){
            System.out.print(temp.getData() + " ,");
            temp = temp.next;
        }
        System.out.println();
    }


}
