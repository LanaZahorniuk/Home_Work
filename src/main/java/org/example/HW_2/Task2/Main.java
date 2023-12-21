package org.example.HW_2.Task2;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("model", 5, 3.2, "route", true, 1234456);
        Bus bus2 = new Bus("model", 7, 2.2, "route", false, 5555456);

        Taxi taxi1 = new Taxi("model", 3, 1.1, "route", "123456", false);
        Taxi taxi2 = new Taxi("model", 5, 8.2, "route", "789023", true);

        Tram tram1 = new Tram("model", 4, 7.2, "route", 3, true);
        Tram tram2 = new Tram("model", 6, 3.2, "route", 2, true);



    }
}
