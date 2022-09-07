package ch20;

public class VIPCustomer extends Customer { // 상속
    double salesRatio;
    private String agentId; // 전문상담원

    VIPCustomer() {
        // super(); super 키워드
        // 하위 클래스에서  상위 클래스 참조값를 가진다.
        // super을 이용해서 상위 클래스의 메서드나 멤버 변수에 접근할수있음.
        // super()는 상위클래스의 기본 생성자를 호출함
        // 하위클래스에서 명시적으로 상위클래스의 생성자를 호출하지않으면 super()가 호출됨(이때 반드시 상위 클래스의 기본 생성자가 존재 해야됨)
        // 상위 클래스의 기본 생성자가 없는경우(다른 생성자가 있는 경우) 하위클래스의 생성자에서 super를 자동적으로 생성하여  상위 클래스의 생성자를 호출함. 직접쓰는경우는 거의없음.
        salesRatio = 0.1; //vip에게만 salesRatio를 가능하게함.
        bonusRatio = 0.05;
        customerGrade = "VIP";
    }

//    Customer생성자에 매개변수가 들어있는 경우는
//    public VIPCustomer(String customerId, String CustomerName) {
//        super(customerId, customerName);
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        SalesRatio = 0.1;
//    } 로 적어주면 된다.


    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
}
