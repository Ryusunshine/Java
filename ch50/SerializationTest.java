package ch50;
/*
# serialization 이란?
    인스턴스의 상태를 그대로 파일 저장하거나 네트웍으로 전송하고 (serialization) 이를 다시 복원(deserializatio) 하는 방식
    자바에서는 보조 스트림을 활용하여 직렬화를 제공함

# ObjectInputStream(InputStream in)
    InputStream을 생성자의 매개변수로 받아 ObjectInputStream을 생성합니다.

# ObjectOutputStream(OutputStream out)
    OutputStream을 생성자의 매개변수로 받아 ObjectOutputStream을 생성합니다.

# Externalizable 인터페이스
    writerExternal()과 readExternal()메서드를 구현해야 함
    프로그래머가 직접 객체를 읽고 쓰는 코드를 구현 할 수 있음
*/

import ch48.FileOutputStreamTest1;

import java.io.*;

class Person implements Externalizable {
    String name;
    String job; // transient를 쓰면 이 변수는 무시하고 직렬한다.

    public Person(){};
    public Person(String name, String job){
        this.name = name;
        this.job = job;
    }
    public String toString(){
        return name + " , " + job;
    }

    @Override
    public void writeExternal(ObjectOutput obj) throws IOException {
        obj.writeUTF(name); // string값으로 직렬화를 하겠다라는 의미
        obj.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
        name = obj.readUTF();
        job = obj.readUTF();

    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person person1 = new Person("Ryusun", "Student");
        Person person2 = new Person("Jewol", "BusinessWoman");
        Person person3 = new Person("KyungJoo", "Engineer");

        try(FileOutputStream fos = new FileOutputStream("serializationTest.txt"); // 애는 혼자 돌아가는게 아니라
            ObjectOutputStream oos = new ObjectOutputStream(fos)){// 괄호안에 input stream 넣어야해서 fos 를 넣어준다

            oos.writeObject(person1); // 이게 serialization
            oos.writeObject(person2); // 직렬하는 인스턴스 내용이 serializable 하다 라고 명시를 해줘야함. 그래서 person 클래스에
            oos.writeObject(person3); //implements Serializable 라고 적어줘야함.

        } catch (IOException e){
            System.out.println(e);}

        try(FileInputStream fis = new FileInputStream("serializationTest.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Person pLee = (Person)ois.readObject(); // readObject하면 반환값이 Object라서 형변환해준다.
            Person pKim = (Person)ois.readObject();

            System.out.println(pLee);
            System.out.println(pKim);

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        }
}
