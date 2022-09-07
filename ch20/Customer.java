package ch20;

public class Customer {
    // 일반 고객 클래스 구현
    //- 고격의 속성: 고객 아이디, 고객이름, 고객등급(일반/VIP), 보너스 포인트, 보너스 포인트 적립비율
    //- 일반 고객의 경우 물품 구매시 1% 보너스 포인트 적립

    protected String customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;
    // private String customerId;
    //Private접근자는 외부클래스에서 접근못함
    //이런 상속관계에서는 사용할일이 많으므로 하위클래스에서는 접근할수있도록 protected를 사용한다.
    // protected는 하위클래스에서는 접근가능하지만 외부클래스에서는 접근불가능

    Customer() {
        // 생성자에서 초기화하는 코드는 인스턴스마다 다른경우 매개변수를 받는다.
        // 이름같은경우는 다르니깐 매개변수로 받고 일반고객의 보너스 비율은 모두 똑같으니깐 미리 생성자안에 적어준다.
        customerGrade = "Silver";
        bonusRatio = 0.01;
    }

    // Customer(String customerName, String customerId){
        // this.customerName = customerName;
        // this.customerId = customerId;
        // customerGrade = "Silver";
        // bonusRatio = 0.01;
    // 이렇게 매개변수가 있는 생성자를 만들어주면 Vipcustomer패키지안에서 Customer생성자를 호출할때 super(); 가 에러가 뜬다.

    public int calPrice(int price){
        bonusPoint = (int) (price * bonusRatio);
        return  price;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo(){
        return customerName + "'s grade is " + customerGrade + " and bonus point is " + bonusPoint;

    }

}
