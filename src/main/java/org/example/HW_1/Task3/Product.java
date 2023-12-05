package org.example.HW_1.Task3;

import java.util.ArrayList;
import java.util.List;

/*
Система Управления Заказами
Классы:
Товар (Product)
Поля: название, цена, количество на складе.
Методы: проверка наличия, обновление количества на складе.
 */
public class Product {
    private String nameProduct;
    private int price;
    private int quantity;

    public List<Product> productList;

    public Product() {
        productList = new ArrayList<>();
    }

    public void addProduct(String nameProduct, int price, int quantity) {
        Product product = new Product();
        product.setNameProduct(nameProduct);
        product.setPrice(price);
        product.setQuantity(quantity);
        productList.add(product);
        System.out.println("product added " + nameProduct);
    }

    public void checkProductAvailability(String nameProduct) {
        boolean found = false;
        for (Product product :
                productList) {
            if (product.getNameProduct().equalsIgnoreCase(nameProduct)) {
                System.out.println(product.getNameProduct() + " product found! Price: "
                        + product.getPrice() + ", Quantity: " + product.getQuantity());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product '" + nameProduct + "' not found");
        }
    }

    public void changeQuantity(String nameProduct, int quantity) {
        boolean found = false;
        for (Product product :
                productList) {
            if (product.getNameProduct().equalsIgnoreCase(nameProduct)) {
                product.setQuantity(quantity);
                System.out.println(nameProduct + " количество изменено: " + quantity);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product '" + nameProduct + "' not found");
        }
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", productList=" + productList +
                '}';
    }
}


