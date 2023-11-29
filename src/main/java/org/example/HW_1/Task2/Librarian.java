package org.example.HW_1.Task2;

import java.util.ArrayList;
import java.util.List;

/*
Библиотекарь (Librarian)
Поля: имя, стаж работы, список доступных книг (массив).
Методы: выдать книгу читателю, принять книгу от читателя.
 */
public class Librarian extends Book {
    private String nameLibrarian;
    private int experience;


    public Librarian(String nameLibrarian, int experience) {
        this.nameLibrarian = nameLibrarian;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Вас приветствует библиотекарь -> " + nameLibrarian
                + ", с опытом работы " + experience + " года/лет.";
    }

    private static List<Librarian> availableBooks; // список доступных книг

    public Librarian() {
        availableBooks = new ArrayList<>();
    }



    public static void giveBook(String nameBook, Librarian nameLibrarian, String nameReader) {
        Book book = new Book();
        boolean bookExists = book.getBookInfo(nameBook);

        if (bookExists) {
            Librarian librarian = new Librarian();
            librarian.setNameBook(String.valueOf(nameBook));
            availableBooks.add(librarian);
            System.out.println(nameLibrarian.nameLibrarian + ", выдал(a) книгу - " + nameBook + " --> " + nameReader);
        } else {
            System.out.println("'" + nameBook + "'" + " не найдена или недоступна");
        }
    }

    public static void takeBookFromReader(String nameBook, Librarian nameLibrarian, String nameReader) {
        Librarian librarian = new Librarian();
        librarian.setNameBook(String.valueOf(nameBook));
        librarian.setNameLibrarian(librarian.getNameLibrarian());
        availableBooks.remove(librarian);
        System.out.println(nameLibrarian.nameLibrarian + ", принял(a) книгу - " + nameBook + " от <-- " + nameReader);
    }

    public static void showAvailableBooks() {
        System.out.println("Доступные книги:");
        for (Librarian book : availableBooks) {
            System.out.println("Книга: " + book.getNameBook());
        }
    }

    public String getNameLibrarian() {
        return nameLibrarian;
    }

    public void setNameLibrarian(String nameLibrarian) {
        this.nameLibrarian = nameLibrarian;
    }

}
