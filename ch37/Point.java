package ch37;

public class Point<T,V> {// 클래스가 쓸 타입을 매개변수로 쓴다.
    T x; //인스턴스는 T타입의 x와 V타입의 y
    V y;

    Point(T x, V y){
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
