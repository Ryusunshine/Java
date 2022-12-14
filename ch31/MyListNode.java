package ch31;

public class MyListNode {
    private String data;       // 자료
    public MyListNode next;    // 다음 노드를 가리키는 링크

    public MyListNode(){//객체 생성자. 모든값을 초기화
        data = null;
        next = null;
    }

    public MyListNode(String data){
        this.data = data;
        this.next = null;
    }

    public MyListNode(String data, MyListNode link){
        this.data = data;
        this.next = link;
    }

    public String getData(){
        return data;
    }

    public MyListNode next() {
        this.next = next;
        return this;
    }
}
