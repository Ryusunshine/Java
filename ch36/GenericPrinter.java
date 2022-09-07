package ch36;

public class GenericPrinter<T> extends Material{ // T 제너릭타입은 Material 타입의 자손타입들만 가능하다고 제한둔것.

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

    @Override
    public void doPrinting() {

    }
}
