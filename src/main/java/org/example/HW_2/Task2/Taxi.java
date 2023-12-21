package org.example.HW_2.Task2;
/*
Класс Taxi:
Наследуется от Vehicle.
Дополнительные поля: String licensePlate, boolean available.
Реализация специфических методов для такси.
 */
public class Taxi extends Vehicle {
    private String licensePlate;
    private boolean available;

    public Taxi(String licensePlate, boolean available) {
        this.licensePlate = licensePlate;
        this.available = available;
    }

    public Taxi(String model, int capacity, double fare, String route, String licensePlate, boolean available) {
        super(model, capacity, fare, route);
        this.licensePlate = licensePlate;
        this.available = available;
    }
}
