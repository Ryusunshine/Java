package ch20;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerName("Ryusun");
        customer1.setCustomerId("ryusunshine");
        customer1.bonusPoint = 1000;
        System.out.println(customer1.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("Suzy");
        customerKim.setCustomerId("Suzy");
        customerKim.bonusPoint = 50000;
        System.out.println(customerKim.showCustomerInfo());

        Customer customer2 = new VIPCustomer(); // 형변환

    }


}
