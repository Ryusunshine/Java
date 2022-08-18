package ch22;

// 다형성
// 하나의 코드가 여러 자료형으로 구현되어 실행되는것
// 같은 코드에서 여러 다른 실행결과가 나옴
// 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
// 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수있음.

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("Animal is moving.");
    }

    public void eating(){
        System.out.println("Animal is eating."); // 하위클래스의 공통 속성 또는 메서드는 상위클래스에서 설정해주면 하위클래스에서 호출가능하다.
    }
}
class Human extends Animal {
    @Override
    public void move() {
        System.out.println("Human walks");
    }

    public void read() {
        System.out.println("Human reads books.");
    }
}

class Tiger extends Animal{

    @Override
    public void move() {
        System.out.println("Tiger runs with four legs");
    }

    public void hunt() {
        System.out.println("Tiger hunts preys");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("Eagle flies");
    }

    public void flying(){
        System.out.println("Eagle flies with its wings");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal Hanimal = new Human();
        Animal Tanimal = new Tiger();
        Animal Eanimal = new Eagle();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(Hanimal);
//        test.moveAnimal(Tanimal);
//        test.moveAnimal(Eanimal);

        ArrayList<Animal> AnimalList = new ArrayList<>();
        AnimalList.add(Hanimal);
        AnimalList.add(Tanimal);
        AnimalList.add(Eanimal);

        for (Animal animal: AnimalList) {
            animal.move();
        }
    }

    public void moveAnimal(Animal animal) { // 이 메서드는 AnimalTest 클래스의 메서드이므로 이 메서드에 접근할수있게 참조변수 생성한다.
        animal.move();
    }
}
