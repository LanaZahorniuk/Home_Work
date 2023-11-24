package org.example.HW_1.Task2;


public class Main {
    public static void main(String[] args) {
        Book.addBook("Alphabet", "brothers Cyril and Methodius", 863);
        Book.addBook("Harry Potter", "Joanne K. Rowling", 1997);
        Book.addBook("Bible", "prophet Daniel", 1523);
        Book.addBook("Fight club", "Chuck Palahniuk", 2020);

        Book.getBookInfo();

        Reader.addReader("Lana", 100);
        Reader.addReader("Sara", 10);
        Reader.addReader("Thom", 1000);

        Reader.getBook("Alphabet","Sara");

        Reader.returnBook("Alphabet", "Sara");




    }
}
