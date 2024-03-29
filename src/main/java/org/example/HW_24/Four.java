package org.example.HW_24;

public class Four {
    public static void main(String[] args) {

        Storage storage = new Storage();

        Pit pit = new Pit(storage);
        Factory factory = new Factory(storage);
        Customer customer = new Customer(storage);
        Delivery delivery = new Delivery(storage);

        Thread pitThread = new Thread(pit);
        Thread factoryThread = new Thread(factory);
        Thread customerThread = new Thread(customer);
        Thread deliveryThread = new Thread(delivery);

        pitThread.start();
        factoryThread.start();
        deliveryThread.start();
        customerThread.start();
    }

    static class Storage {
        private int item = 0;
        private int order = 0;
        private int material = 0;
        private final Object lock = new Object();

        public void makeSupply() {
            synchronized (lock) {
                while (material >= 5) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                material++;
                System.out.println("extraction of raw materials. material = " + material);
                lock.notifyAll();
            }
        }

        public void makeManufacture() {
            synchronized (lock) {
                while (item >= 5 || material < 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                item++;
                material--;
                System.out.println("the Factory produces. production = " + item);
                lock.notifyAll();
            }
        }

        public void makeOrder() {
            synchronized (lock) {
                while (item < 1 || order >= item) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                order++;
                System.out.println("customer makes an order. quantity orders = " + order);
                lock.notifyAll();
            }
        }

        public void makeDelivery() {
            synchronized (lock) {
                while (item < 1 || order < 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                item--;
                order--;
                System.out.println("do delivery. production = " + item);
                lock.notifyAll();
            }
        }

    }

    static class Pit implements Runnable {
        Storage storage;

        public Pit(Storage storage) {

            this.storage = storage;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                storage.makeSupply();
            }
        }
    }

    static class Factory implements Runnable {
        Storage storage;

        public Factory(Storage storage) {

            this.storage = storage;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                storage.makeManufacture();
            }
        }
    }

    static class Customer implements Runnable {
        Storage storage;

        public Customer(Storage storage) {

            this.storage = storage;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                storage.makeOrder();
            }
        }
    }

    static class Delivery implements Runnable {
        Storage storage;

        public Delivery(Storage storage) {

            this.storage = storage;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                storage.makeDelivery();
            }
        }
    }
}
