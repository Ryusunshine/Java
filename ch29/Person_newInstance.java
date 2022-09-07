package ch29;

// Class의 newInstance()메서드로 인스턴스 생성
//new 키워드를 사용하지 않고 클래스 정보를 활용하여 인스턴스를 생성할 수 있음

public class Person_newInstance {
    private String name;
    private int age;

    public Person_newInstance(){} // default constructor
    public Person_newInstance(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name;
    }
}
