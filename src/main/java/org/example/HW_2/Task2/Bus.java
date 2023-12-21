package org.example.HW_2.Task2;
/*
Класс Bus:
Наследуется от Vehicle.
Дополнительные поля: boolean accessibility, int busNumber.
Реализация специфических методов для автобуса.
 */
public class Bus extends Vehicle {
    private boolean accessibility;
    private int busNumber;

    public Bus(boolean accessibility, int busNumber) {
        this.accessibility = accessibility;
        this.busNumber = busNumber;
    }

    public Bus(String model, int capacity, double fare, String route, boolean accessibility, int busNumber) {
        super(model, capacity, fare, route);
        this.accessibility = accessibility;
        this.busNumber = busNumber;
    }


}
