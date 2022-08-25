package ch35;

// 타입을 모든조상인 object로 정하면 나중에 형변환해야해서 번거로움. 해결점: 제너릭메서드

// 제너릭메서드
//자료형 매개변수: 이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정. static 변수는 사용할수 없음
//GenericPrinter = 제네릭 자료형
//E: element, K :key, V : value 등 여러 알파벳을 의미에 따라 사용가능

//private T material; material이라는 변수가 여러가지 자료형을 가질수 잇다는 의미

public class GenericPrinter<T> { // 제너릭타입을 쓴다는 의미인 <T>를 쓴다..

    private T material;

    public T getMaterial(){
        return material;
    }

    public void setMaterial(T material){
        this.material = material;
    }

    public String toString(){
        return material.toString();
    }
}
