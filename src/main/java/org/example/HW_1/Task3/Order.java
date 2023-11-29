package org.example.HW_1.Task3;

import java.util.ArrayList;
import java.util.List;

/*
Заказ (Order)
Поля: список товаров (массив), статус заказа, общая сумма.
Методы: добавить товар в заказ, рассчитать общую сумму.
 */
public class Order {
    public List<Order> orderList;

    public Order() {
        orderList = new ArrayList<>();
    }

    public String status;
    public int sum;
    public String nameProduct;
    public int quantity;

    public void addProductInOrderList(String nameProduct, int quantity, int price) {
        Order order = new Order();
        order.setNameProduct(nameProduct);
        order.setQuantity(quantity);
        order.setSum(price);
        orderList.add(order);
        System.out.println(nameProduct + " in orderList + ");
    }

    public void calculationOrderSum() {
        int sum = 0;
        for (Order or :
                orderList) {
            sum += or.getSum();
        }
        System.out.println("all: " + sum);
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderList=" + orderList +
                ", status='" + status + '\'' +
                ", sum=" + sum +
                ", nameProduct='" + nameProduct + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}