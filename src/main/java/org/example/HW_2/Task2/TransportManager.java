package org.example.HW_2.Task2;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/*
Класс TransportManager:
Поля: Vehicle[] vehicles, int totalVehicles, String managerName.
Реализация методов управления транспортными средствами.
 */
public class TransportManager extends Vehicle implements Maintenance, TransportControl {
    private Vehicle[] vehicles;
    private int totalVehicles;
    private String managerName;




    public static void addToBase(Vehicle vehicle) {
        Vehicle vehicle1 = new TransportManager();
        vehicle.setCapacity(vehicle.getCapacity());
        vehicle.setFare(vehicle.getFare());
        vehicle.setRoute(vehicle.getRoute());
        vehicleList.add(vehicle1);
        System.out.println(vehicle + " add to Base");
    }
    public static int getQuantityVehicles(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
        } return  vehicles.length;
    }


    public TransportManager() {
        super();
    }

    public TransportManager(String model, int capacity, double fare, String route) {
        super(model, capacity, fare, route);
    }



    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }

    @Override
    public void setCapacity(int capacity) {
        super.setCapacity(capacity);
    }

    @Override
    public double getFare() {
        return super.getFare();
    }

    @Override
    public void setFare(double fare) {
        super.setFare(fare);
    }

    @Override
    public String getRoute() {
        return super.getRoute();
    }

    @Override
    public void setRoute(String route) {
        super.setRoute(route);
    }

    @Override
    public List<Vehicle> getVehicleList() {
        return super.getVehicleList();
    }

    @Override
    public void setVehicleList(List<Vehicle> vehicleList) {
        super.setVehicleList(vehicleList);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public int size() {
        return vehicleList.size();
    }

    public boolean isEmpty() {
        return vehicleList.isEmpty();
    }

    public boolean contains(Object o) {
        return vehicleList.contains(o);
    }

    public Iterator<Vehicle> iterator() {
        return vehicleList.iterator();
    }

    public Object[] toArray() {
        return vehicleList.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return vehicleList.toArray(a);
    }

    public boolean add(Vehicle vehicle) {
        return vehicleList.add(vehicle);
    }

    public boolean remove(Object o) {
        return vehicleList.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return vehicleList.containsAll(c);
    }

    public boolean addAll(Collection<? extends Vehicle> c) {
        return vehicleList.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends Vehicle> c) {
        return vehicleList.addAll(index, c);
    }

    public boolean removeAll(Collection<?> c) {
        return vehicleList.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return vehicleList.retainAll(c);
    }

    public void replaceAll(UnaryOperator<Vehicle> operator) {
        vehicleList.replaceAll(operator);
    }

    public void sort(Comparator<? super Vehicle> c) {
        vehicleList.sort(c);
    }

    public void clear() {
        vehicleList.clear();
    }

    public Vehicle get(int index) {
        return vehicleList.get(index);
    }

    public Vehicle set(int index, Vehicle element) {
        return vehicleList.set(index, element);
    }

    public void add(int index, Vehicle element) {
        vehicleList.add(index, element);
    }

    public Vehicle remove(int index) {
        return vehicleList.remove(index);
    }

    public int indexOf(Object o) {
        return vehicleList.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return vehicleList.lastIndexOf(o);
    }

    public ListIterator<Vehicle> listIterator() {
        return vehicleList.listIterator();
    }

    public ListIterator<Vehicle> listIterator(int index) {
        return vehicleList.listIterator(index);
    }

    public List<Vehicle> subList(int fromIndex, int toIndex) {
        return vehicleList.subList(fromIndex, toIndex);
    }

    public Spliterator<Vehicle> spliterator() {
        return vehicleList.spliterator();
    }

    public <T> T[] toArray(IntFunction<T[]> generator) {
        return vehicleList.toArray(generator);
    }

    public boolean removeIf(Predicate<? super Vehicle> filter) {
        return vehicleList.removeIf(filter);
    }

    public Stream<Vehicle> stream() {
        return vehicleList.stream();
    }

    public Stream<Vehicle> parallelStream() {
        return vehicleList.parallelStream();
    }

    public void forEach(Consumer<? super Vehicle> action) {
        vehicleList.forEach(action);
    }

    @Override
    public String toString() {
        return "TransportManager{" +
                "vehicles=" + Arrays.toString(vehicles) +
                ", totalVehicles=" + totalVehicles +
                ", managerName='" + managerName + '\'' +
                '}';
    }

    @Override
    public void getModel() {
        super.getModel();
    }
}
