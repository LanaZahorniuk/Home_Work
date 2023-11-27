package org.example.HW_1.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Читатель (Reader)
Поля: имя, возраст, список взятых книг (массив).
Методы: взять книгу, вернуть книгу.
 */
public class Reader extends Book {
    private String nameReader;
    int egeReader;
    public List<Reader> readerList;
    public List<Book> bookList; // список взятых книг


    public Reader() {
        readerList = new ArrayList<>();
        bookList = new ArrayList<>();
    }

    public void addReader(String nameReader, int egeReader) {
        Reader readerBook = new Reader();
        readerBook.setNameReader(nameReader);
        readerBook.setEgeReader(egeReader);
        readerList.add(readerBook);
        System.out.println("читатель(ница) " + nameReader + ", " + egeReader + " лет, теперь в списке читателей! ");

    }

    public void getBook(String nameBook, String nameReader) {
        boolean bookExists = false;
        for (Book book :
                listBook) {
            if (book.getNameBook().equalsIgnoreCase(nameBook)) {
                bookExists = true;
                break;
            }
        }
        if (bookExists = true) { // 'Alphabet' not listed & Sara получил(а) книгу - Alphabet
            getBookInfo(nameBook);
            Book newBook = new Book();
            newBook.setNameBook(nameBook);
            newBook.setNameReader(nameReader);
            bookList.add(newBook);
            System.out.println(nameReader + " получил(а) книгу - " + nameBook);
        } else {
            System.out.println("'" + nameBook + "'" + " нет в доступе");
        }
    }

    /*public void getBook(String nameBook, String nameReader) {
        boolean search = false;

        for (Book book :
                listBook) {
            if (book.getNameBook().equalsIgnoreCase(nameBook)) {
                System.out.println("'" + nameBook + "'" + " +");
                search = true;
                break;
            }
        }
        if (search) {
            Book newBook = new Book();
            newBook.setNameBook(nameBook);
            newBook.setNameReader(nameReader);
            bookList.add(newBook);
            System.out.println(nameReader + " получил(а) книгу - " + nameBook);
        } else {
            System.out.println("'" + nameBook + "'" + " нет в доступе");
        }
    } */

    public void returnBook(String nameBook, String nameReader) {
        Iterator<Book> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getNameBook().equalsIgnoreCase(nameBook) && book.getNameReader().equalsIgnoreCase(nameReader)) {
                iterator.remove();
                System.out.println(nameReader + " - returned the book - " + nameBook);
            }
        }
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

    public String getNameReader() {
        return nameReader;
    }

    public int getEgeReader() {
        return egeReader;
    }

    public List<Reader> getReaderList() {
        return readerList;
    }

    public void setReaderList(List<Reader> readerList) {
        this.readerList = readerList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
