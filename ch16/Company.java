package ch16; // 싱글톤 패턴

public class Company { // 회사가 하나인 싱글톤 인스턴스를 만들어보자
    // 싱글톤 패턴은 클래스 내부에 유일한 private 인스턴스있는 디자인패턴이다.
    private static Company instance = new Company(); //클래스내부에서 객체를 하나 만듦으로써 유일한 객체가 되었음.

    // 생성자를 만들지않으면 default 값으로 외부에서 여러개의 회사를 만들수있기 때문에 company 생성자를 private으로 생성한다.
    private Company() {}; // 생성자를 만들면 컴파일러는 생성자를 제공해주지않음.

    // 이 클래스의 직원수나 메서드에 접근을 할려면 이 유일한 인스턴스에 접근을 해야함.
    // 그래서 외부에서 유일한 인스턴스를 참조할수있는 public 메서드를 제공.
    public static Company getInstance() { // 이 메서드는 static으로 설정해서 외부에서 객체 생성안하고 호출할수 있도록 한다.
        if (instance == null)
            instance = new Company();

        return instance;
    }
}
