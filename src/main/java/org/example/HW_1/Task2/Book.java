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

    public List<Book> listBook; // // список книг

    public Book() {
        listBook = new ArrayList<>();
    }

    private String nameReader;


    public void addBook(String nameBook, String nameAuthor, int yearPublication) {
        Book newBook = new Book();
        newBook.setNameBook(nameBook);
        newBook.setNameAuthor(nameAuthor);
        newBook.setYearPublication(yearPublication);
        listBook.add(newBook);
        System.out.println(nameBook + " add to listBook");
    }


    public void getBookInfo(String nameBook) {
        boolean search = false;
        for (Book book :
                listBook) {
            if (book.getNameBook().equalsIgnoreCase(nameBook)) {
                System.out.println("'" + nameBook + "'" + " +");
                search = true;
                break;
            }
        }
        if (!search) {
            System.out.println("'" + nameBook + "'" + " not listed");
        }
    }

    public void getOldBook(String nameBook) {
        int thisYear = java.time.Year.now().getValue();
        boolean search = false;
        for (Book book :
                listBook) {
            if ((thisYear - book.getYearPublication() >= 50) && (book.getNameBook().equalsIgnoreCase(nameBook))) {
                System.out.println(nameBook + " - " + book.yearPublication);
                search = true;
                break;
            }
        }
        if (!search) {
            System.out.println(nameBook + " - the book is not old");
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

    public String getNameBook() {
        return nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }

    public String getNameReader() {
        return nameReader;
    }

    public void setNameReader(String nameReader) {
        this.nameReader = nameReader;
    }
}

