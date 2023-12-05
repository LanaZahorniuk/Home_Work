package org.example.HW_1.Task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.addProduct("TV", 1500, 10);
        product.addProduct("smartphone", 500, 100);
        product.addProduct("radio", 70, 5);

        System.out.println(product.productList.toString());

        product.checkProductAvailability("TV");
        product.checkProductAvailability("laptop");

        product.changeQuantity("TV", 9);
        product.changeQuantity("smartphone", 200);
        product.changeQuantity("laptop", 2);
        System.out.println(product.productList.toString());

        System.out.println("----------------------------------------------------");

        Order order = new Order();
        order.addProductInOrderList("TV", 1, 1500);
        order.addProductInOrderList("radio", 2, 70);

        System.out.println(order.orderList.toString());

        order.calculationOrderSum();

        System.out.println("----------------------------------------------------");

        Customer customer = new Customer();

        customer.makeOrder("TV, radio, laptop","Elon Musk");
        customer.makeOrder("TV, radio", "Edgar Allan Poe");
        customer.makeOrder("radio","Ernest Hemingway");

        customer.checkList();

        customer.cancelOrder("radio","Ernest Hemingway");
        System.out.println("----------------------------------------------------");
        customer.checkList();

        System.out.println("----------------------------------------------------");

        OrderManager orderManager = new OrderManager();

        orderManager.processingNewOrder();
        orderManager.updateOrderStatus();






    }
}
