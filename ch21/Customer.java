package ch21;

public class Customer {

    protected String customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;


    Customer() {
        customerGrade = "Silver";
        bonusRatio = 0.01;
    }

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
