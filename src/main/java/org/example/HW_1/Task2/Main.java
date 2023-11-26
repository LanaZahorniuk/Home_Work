package org.example.HW_1.Task2;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.addBook("Alphabet", "brothers Cyril and Methodius", 863);
        book.addBook("Harry Potter", "Joanne K. Rowling", 1997);
        book.addBook("Bible", "prophet Daniel", 1523);
        book.addBook("Fight club", "Chuck Palahniuk", 2020);

        System.out.println("----------------------------------------------------");

        book.getBookInfo("the quantum physics");
        book.getBookInfo("Bible");

        book.getOldBook("Alphabet");
        book.getOldBook("Fight club");

        System.out.println("----------------------------------------------------");





//        Reader.addReader("Lana", 100);
//        Reader.addReader("Sara", 10);
//        Reader.addReader("Thom", 1000);
//
//        Reader.getBook("Alphabet", "Sara");
//        Reader.returnBook("Alphabet", "Sara");
//
//        Librarian librarian1 = new Librarian("Artur", 54);
//        Librarian librarian2 = new Librarian("Giselle", 23);
//        System.out.println(librarian1);
//        System.out.println(librarian2);
//
//        Librarian.giveBookFromReader("Alphabet", librarian1, "Thom");
//        Librarian.giveBookFromReader("Harry Potter", librarian2, "Lana");
//
//        Librarian.takeBookFromReader("Alphabet", librarian1, "Thom");
//        Librarian.takeBookFromReader("Harry Potter", librarian2, "Lana");

    }
}



  /*  List<Book> allBooks = book.getListBook();
        for (Book books :
                allBooks) {
            System.out.println("book information: name - " + books.getNameBook()
                    + ", author - " + books.getNameAuthor()
                    + ", publication - " + books.getYearPublication()
                    + " year");
        } */