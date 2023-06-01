package org.java8.memory;

public class TestCustomerPassByValue {
    public static void main(String[] args) {
        Customer customer = new Customer(10, "silly");
        renameCustomer(customer);
        System.out.println(customer.getCustomerName());
    }

    public static void renameCustomer(Customer customer) {
        customer.setCustomerName("lalli");
    }
}
