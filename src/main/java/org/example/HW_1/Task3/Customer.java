package org.example.HW_1.Task3;

import java.util.ArrayList;
import java.util.List;

/*
Клиент (Customer)
Поля: имя, email, история заказов (массив).
Методы: сделать заказ, отменить заказ.
 */
public class Customer {
    private String nameCustomer;
    private String email;
    public List<Customer> customerList;

    public Customer() {
        customerList = new ArrayList<>();
    }

    public void makeOrder(String nameProduct, String nameCustomer) {
        Customer customer = new Customer();
        customer.setNameProduct(nameProduct);
        customer.setNameCustomer(nameCustomer);
        customerList.add(customer);
        System.out.println("для " + nameCustomer + " сформирован заказ: " + nameProduct);
    }

    public void cancelOrder(String nameProduct, String nameCustomer) {
        boolean found;

        found = customerList.removeIf(customer ->
                customer.getNameProduct().equalsIgnoreCase(nameProduct)
                        && customer.getNameCustomer().equalsIgnoreCase(nameCustomer));
        if (found) {
            System.out.println("заказ отменён");
        } else {
            System.out.println("заказ не найден");
        }

    }

    public void checkList() {
        for (Customer customer : getCustomerList()) {
            System.out.println(customer);
        }
    }

    private String nameProduct;


    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", email='" + email + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }
}
