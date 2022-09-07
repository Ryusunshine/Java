package ch16;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        // getInstane()를 호출할려면 company 객체를 하나 만들어야하는데 static 이라서 바로 호출가능하다.
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();
        // 정리
        // company는 외부에서 생성할수없고, 내부에 private으로 하나 생성돼있고, getInstance 메서드만 제공되어있기때문에 메인보드에서
        // 이 메서드만 사용할수있다.
        // 유일한 객체를 제공할때 싱글톤 패턴을 쓴다.
    }
}
