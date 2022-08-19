package ch23;
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

        AnimalTest test = new AnimalTest();
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

        test.testDownCasting(AnimalList);


    }

    public void testDownCasting(ArrayList<Animal> list){
        // 이 메서드는 위에 있는 AnimalTest의 메서드니깐 호출할려면 AnimalTest 타입의 객체를 생성해야한다.
        for (int i = 0; i<list.size(); i++){
            Animal animal = list.get(i); // list에 들어있는 참조변수 animal 주소값이
            if (animal instanceof Human){ // animal 조상이 human 이면
                Human human = (Human)animal;  // Animal 타입을 Human타입으로 형변환
                human.read();
            }

            else if (animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunt();
            }

            else if (animal instanceof Eagle){
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }

            else {
                System.out.println("unsupported type");
            }
        }
    }
}
