package org.java8.memory;

import java.util.ArrayList;
import java.util.List;

public class TestGC {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<Customer>();
        while (true) {
            Customer customer = new Customer(1, "prashanth-j");
            customerList.add(customer);
            if (customerList.size() > 10000)
                for (int i = 0; i < 5000; i++) {
                    customerList.remove(0);
                }
        }
    }
}
