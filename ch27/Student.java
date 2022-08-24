package ch27;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public String toString(){ // toString 메서드 오버라이딩
        return studentNum + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){ // 넘어온 매개변수가 Student 가 조상타입이면
            Student std = (Student)obj;
            if (this.studentNum == std.studentNum)
                return true;
            else return false;
            }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum; // 학번이 같을때 학번을 반환해주니깐 hashcode가 일치한다.
    }

    // clone() 메서드
    //- 객체의 원본을 복제하는데 사용하는 메서드
    //- 생성과정의 복잡한 과정을 반복하지않고 복제할 수 있음
    //- clone()메서드를 사용하면 객체의 정보(멤버 변수 값등) 가 동일한 또 다른 인스턴스가 생성되는 것이므로, 객체 지향 프로그램에서의 정보은닉, 객체 보호의 관점에서 위배될수 있음
    //- 해당 클래스의 clone()메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시해줌
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
