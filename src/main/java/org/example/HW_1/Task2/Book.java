package org.example.HW_1.Task2;
/*
Классы:
Книга (Book)
Поля: название, автор, год издания.
Методы: вывод информации о книге, проверка на старинность (старше 50 лет).
 */

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String nameBook;
    private String nameAuthor;
    private int yearPublication;

    private static List<Book> listBook;

    public Book() {
        listBook = new ArrayList<>();
    }


    public static void addBook(String nameBook, String nameAuthor, int yearPublication) {
        Book newBook = new Book();
        newBook.setNameBook(nameBook);
        newBook.setNameAuthor(nameAuthor);
        newBook.setYearPublication(yearPublication);
        listBook.add(newBook);
        // System.out.println(listBook.toString());
    }


    public static void getBookInfo() {
        int thisYear = java.time.Year.now().getValue();
        for (Book book :
                listBook) {
            if (thisYear - book.getYearPublication() >= 50)
                System.out.println(book);
        }

    }

    @Override
    public String toString() {
        return "book information: name - " + nameBook +
                ", author - " + nameAuthor +
                ", publication - " + yearPublication + " year";
    }


    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }



    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

}

