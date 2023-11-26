package org.example.HW_1.Task2;

import java.util.ArrayList;
import java.util.List;

/*
Читатель (Reader)
Поля: имя, возраст, список взятых книг (массив).
Методы: взять книгу, вернуть книгу.
 */
public class Reader extends Book {
    private String nameReader;
    int egeReader;
    private static List<Reader> readerList;
    private static List<Book> bookList;


    public Reader() {
        readerList = new ArrayList<>();
        bookList = new ArrayList<>();
    }

    public static void addReader(String nameReader, int egeReader) {
        Reader readerBook = new Reader();
        readerBook.setNameReader(nameReader);
        readerBook.setEgeReader(egeReader);
        readerList.add(readerBook);
        System.out.println("читатель(ница) " + nameReader + ", " + egeReader + " лет, теперь в списке читателей! ");

    }

    public static void getBook(String nameBook, String nameReader) {
        Reader readerBook = new Reader();
        readerBook.setNameBook(nameBook);
        readerBook.setNameReader(nameReader);
        bookList.add(readerBook);
        System.out.println(bookList.toString());

    }

    public static void returnBook(String nameBook, String nameReader) {
        Reader readerBook = new Reader();
        readerBook.setNameReader(nameReader);
        bookList.remove(readerBook);
        System.out.println(nameReader + " - returned the book - " + nameBook);


    }

    @Override
    public String toString() {
        return "Reader information: name - " + nameReader + ", book - " + nameBook;
    }


    public void setNameReader(String nameReader) {
        this.nameReader = nameReader;
    }

    public void setEgeReader(int egeReader) {
        this.egeReader = egeReader;
    }

}
