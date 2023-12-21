package org.example.HW_2.Task2;

import java.util.ArrayList;
import java.util.List;

/*
Абстрактный класс Vehicle:

Поля: String model, int capacity, double fare, String route.
Абстрактные методы для основных операций транспортного средства.
 */
public abstract class Vehicle {
    private String model;
    private int capacity;
    private double fare;
    private String route;

    public static List<Vehicle> vehicleList;

    public Vehicle() {
        vehicleList = new ArrayList<>();
    }
    public Vehicle(String model, int capacity, double fare, String route) {
        this.model = model;
        this.capacity = capacity;
        this.fare = fare;
        this.route = route;
    }

    public static void addToBase() {

    }
    public void getModel() {

    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
