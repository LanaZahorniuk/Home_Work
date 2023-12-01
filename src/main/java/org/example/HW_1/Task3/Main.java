package org.example.HW_1.Task3;

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

        order.calculationOrderSum(); // sdfgh

    }
}
