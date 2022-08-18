package ch22;

public class GoldCustomer extends Customer{
    double salesRatio;


    public GoldCustomer(String CustomerId, String CustomerName){
        super(CustomerId, CustomerName);
        salesRatio = 0.05;
        bonusRatio = 0.02;
        customerGrade = "Gold";
    }

    public int calPrice(int price){
        bonusPoint += price * bonusRatio;
        return (int)(price * salesRatio);

    }
}
