package ch22;

//다형성
//하나의 코드가 여러 자료형으로 구현되어 실행되는것
//같은 코드에서 여러 다른 실행결과가 나옴
//정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
//다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수있음.

//다형성을 사용하는 이유
//다른 동물을 추가하는 경우
//상속과 메서드 재정의를 활용하여 확장성있는 프로그램을 만들 수 있음
//그렇지 않은 경우 많은 if-else if 문이 구현되고 코드의 유지보수가 어려워짐
//여러 클래스를 하나의 타입(상위 클래스)으로 핸들링 할 수 있음

//다형성을 활용한 멤버십 프로그램 확장
//일반 고객과 vip 고객 중간 멤버십 만들기
//고객이 늘어 일반 고객보다는 많이 구매하고 VIP 보다는 적게 구매하는 고객에게도 해택을 주기로 했다.
//GOLD 고객 등급을 만들고 혜택은 다음과 같다
//  1. 제품을 살때는 10프로를 할인해준다
//  2. 보너스 포인트는 2%를 적립해준다


import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer("yeom5001", "Ryusun");
        Customer customer2 = new Customer("yeom5002", "Ryujin");
        Customer customer3 = new GoldCustomer("yeom5003", "Ryumi");
        Customer customer4 = new VIPCustomer("yeom5004", "Ryuseok");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        int price = 10000; // 똑같은 만원짜리 제품을 살때 등급따라 얼마를 지불해야하는지 출력해보자
        for (Customer customer: customerList){
            int cost = customer.calPrice(price);
            System.out.println(customer.getCustomerName() + " has to pay " + cost);
        }

        for (Customer customer: customerList){
            System.out.println(customer.showCustomerInfo());
        }

        if (customer3 instanceof GoldCustomer){ // instanceof를 이용한 형 체크 
            GoldCustomer customer5 = (GoldCustomer) customer3;
            System.out.println(customer3.showCustomerInfo());
        }

    }


}
