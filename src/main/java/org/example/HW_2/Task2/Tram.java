package org.example.HW_2.Task2;
/*
Класс Tram:
Наследуется от Vehicle.
Дополнительные поля: int trackWidth, boolean electric.
Реализация специфических методов для трамвая.
 */
public class Tram extends Vehicle {
    private int trackWidth;
    private boolean electric;

    public Tram(int trackWidth, boolean electric) {
        this.trackWidth = trackWidth;
        this.electric = electric;
    }

    public Tram(String model, int capacity, double fare, String route, int trackWidth, boolean electric) {
        super(model, capacity, fare, route);
        this.trackWidth = trackWidth;
        this.electric = electric;
    }
}
