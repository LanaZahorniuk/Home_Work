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

    private static List<Librarian> availableBooks;

    public Librarian() {
        availableBooks = new ArrayList<>();
    }

    public static void giveBookFromReader(String nameBook, Librarian nameLibrarian, String nameReader) {
        Librarian librarian = new Librarian();
        librarian.setNameBook(String.valueOf(nameBook));
        availableBooks.remove(librarian);
        System.out.println(nameLibrarian.nameLibrarian + ", выдал(a) книгу - "+ nameBook + " --> " + nameReader);
    }

    public static void takeBookFromReader(String nameBook, Librarian nameLibrarian, String nameReader) {
        Librarian librarian = new Librarian();
        librarian.setNameBook(String.valueOf(nameBook));
        librarian.setNameLibrarian(librarian.getNameLibrarian());
        availableBooks.add(librarian);
        System.out.println(nameLibrarian.nameLibrarian + ", принял(a) книгу - "+ nameBook + " от <-- " + nameReader);
    }

    public String getNameLibrarian() {
        return nameLibrarian;
    }

    public void setNameLibrarian(String nameLibrarian) {
        this.nameLibrarian = nameLibrarian;
    }

}
