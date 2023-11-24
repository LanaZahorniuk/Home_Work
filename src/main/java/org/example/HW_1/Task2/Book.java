package org.example.HW_1.Task2;
/*
Классы:
Книга (Book)
Поля: название, автор, год издания.
Методы: вывод информации о книге, проверка на старинность (старше 50 лет).
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String nameBook;
    private String nameAuthor;
    private int yearPublication;

    private static List<Book> listBook;

    public Book() {
        listBook = new ArrayList<>();
        // Arrays.sort(new int[]{yearPublication});
    }


    public static void addBook(String nameBook, String nameAuthor, int yearPublication) {
        Book newBook = new Book();
        newBook.setNameBook(nameBook);
        newBook.setNameAuthor(nameAuthor);
        newBook.setYearPublication(yearPublication);
        listBook.add(newBook);
    }


    public static void getBookInfo() {
        int thisYear = java.time.Year.now().getValue();
        for (Book book :
                listBook) {
            if (thisYear - book.getYearPublication() >= 50) {
                System.out.println("book information: name - " + book.getNameBook() +
                        ", author - " + book.getNameAuthor() +
                        ", publication - " + book.getYearPublication() + ".");
            }
        }

    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
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




/*
Управление Библиотекой.





Читатель (Reader)
Поля: имя, возраст, список взятых книг (массив).
Методы: взять книгу, вернуть книгу.


Библиотекарь (Librarian)
Поля: имя, стаж работы, список доступных книг (массив).
Методы: выдать книгу читателю, принять книгу от читателя.


Библиотека (Library)
Поля: название, адрес, список библиотекарей (массив).
Методы: добавить библиотекаря, найти библиотекаря по имени.
 */