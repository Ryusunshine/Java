package ch29;

public class Person_Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c1 = Class.forName("ch29.Person_newInstance"); // ch29클래스안에 있는 클래스를 가져올수있다.
        // 클래스 이름과 호출 생성자를 사용하여 인스턴스 만들기
        Person_newInstance person = (Person_newInstance) c1.newInstance(); // newInstance의 반환값이 object이니깐 Person으로 형변환
        person.setName("Lee");
        System.out.println(person);

        Class c2 = person.getClass();
        // getClass()함수를 써서도 클래스를 가져올수있다.
        // 하지만 getClass함수를 쓸려면 이미 인스턴스가 생성된 상태에서 인스턴스.getClass()를 써서 사용할수있다.
        Person_newInstance p = (Person_newInstance)c2.newInstance();

    }
}
