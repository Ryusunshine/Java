package ch45;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
    public static void main(String[] args) {
        TravelCustomer customer1 = new TravelCustomer("Ryusun", 26, 100);
        TravelCustomer customer2 = new TravelCustomer("Jonas", 25, 100);
        TravelCustomer customer3 = new TravelCustomer("Lily", 3, 50);

        List<TravelCustomer> CustomerList = new ArrayList<TravelCustomer>();
        CustomerList.add(customer1);
        CustomerList.add(customer2);
        CustomerList.add(customer3);

        System.out.println("Customers' Names");
        CustomerList.stream().map(n -> n.getName()).forEach(n-> System.out.println(n));
        System.out.println("Customers' Total Price");
        System.out.println(CustomerList.stream().mapToInt(c -> c.getPrice()).sum());
        System.out.println("Sort by Customers over 20");
        CustomerList.stream().filter(a -> a.getAge() > 20).map(a -> a.getName()).sorted().forEach(a-> System.out.println(a));



    }
}
