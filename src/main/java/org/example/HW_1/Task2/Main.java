package org.example.HW_1.Task2;


import javax.management.ObjectName;
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

        Reader reader = new Reader();
        reader.addReader("Lana", 100);
        reader.addReader("Sara", 10);
        reader.addReader("Thom", 1000);

        System.out.println("----------------------------------------------------");

        reader.getBook("Alphabet", "Sara"); // 'Alphabet' not listed & Sara получил(а) книгу - Alphabet
        reader.getBook("Harry Potter", "Lana"); // not listed НЕ ДОЛЖНЛО ОТОБРАЖАТЬСЯ

        System.out.println("----------------------------------------------------");

        System.out.println("Содержимое bookList:");
        for (Book bookBook : reader.bookList) {
            System.out.println("name reader: " + bookBook.getNameReader() + ", book: " + bookBook.getNameBook());
        }
        System.out.println("----------------------------------------------------");

        reader.returnBook("Alphabet", "Sara");

        System.out.println("Содержимое bookList:");
        for (Book bookBook : reader.bookList) {
            System.out.println("name reader: " + bookBook.getNameReader() + ", book: " + bookBook.getNameBook());
        }
        System.out.println("----------------------------------------------------");

        //Reader.getBook("Alphabet", "Sara");
        // Reader.returnBook("Alphabet", "Sara");
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


/*
System.out.println("Содержимое listBook:");
        List<Book> allBooks = book.getListBook();
        for (Book books :
                allBooks) {
            System.out.println("book information: name - " + books.getNameBook()
                    + ", author - " + books.getNameAuthor()
                    + ", publication - " + books.getYearPublication()
                    + " year");
        }

System.out.println("----------------------------------------------------");


  List<Reader> allReaders = reader.getReaderList();
        for (Reader readers :
                allReaders) {
            System.out.println(readers.getNameReader()
                    + " - " + readers.getEgeReader() + " year ");
        }

 */


