package org.example.HW_1.Task3;

import java.util.List;

/*
Менеджер Заказов (OrderManager)
Поля: список доступных товаров (массив), список заказов (массив).
Методы: обработка нового заказа, обновление статуса заказа.
 */
public class OrderManager {

    public List<Product> productList;

    public List<Order> orderList;


    public void processingNewOrder() {
        System.out.println("готов принять новый заказ");
    }

    public void updateOrderStatus() {
        Order order = new Order();
        System.out.println(order.status);
    }

}


