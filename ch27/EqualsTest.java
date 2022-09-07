package ch27;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");
        Student std3 = std1;

        System.out.println(std1 == std3);
        System.out.println(std1.equals(std2));
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        // 진짜 가지고있는 hashcode 반환해주는 함수 = identityHashcode
        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));

        //clone
        Student copyStudent = (Student)std1.clone();
        System.out.println(copyStudent); // clone()메서드 사용할려면 클래스 이름 옆에 implements Cloneable 써줘야해!
    }
}
