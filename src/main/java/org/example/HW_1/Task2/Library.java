package org.example.HW_1.Task2;

import java.util.ArrayList;
import java.util.List;

/*
Библиотека (Library)
Поля: название, адрес, список библиотекарей (массив).
Методы: добавить библиотекаря, найти библиотекаря по имени.
 */
public class Library {
    private String nameLibrary;
    private String addressLibrary;
    private String nameLibrarian;
    public List<Library> librarianList; // список библиотекарей

    public Library() {
        librarianList = new ArrayList<>();
    }

    public void addLibrary (String nameLibrary, String addressLibrary, String nameLibrarian) {
        Library library = new Library();
        library.setNameLibrary(nameLibrary);
        library.setAddressLibrary(addressLibrary);
        library.setNameLibrarian(nameLibrarian);
        librarianList.add(library);
        System.out.println("Librarian - " + nameLibrarian + ", from " + addressLibrary + " - " + nameLibrary);
    }

    public void searchLibrarian (String nameLibrarian){
        boolean search = false;
        for (Library l :
                librarianList) {
            if (l.getNameLibrarian().equalsIgnoreCase(nameLibrarian)) {
                System.out.println("name Librarian: " + nameLibrarian);
                search = true;
                break;
            }
        } if (!search) {
            System.out.println("not listed");
        }
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    public void setAddressLibrary(String addressLibrary) {
        this.addressLibrary = addressLibrary;
    }


    public String getNameLibrarian() {
        return nameLibrarian;
    }

    public void setNameLibrarian(String nameLibrarian) {
        this.nameLibrarian = nameLibrarian;
    }

    @Override
    public String toString() {
        return "nameLibrary - " + nameLibrary +
                ", addressLibrary - " + addressLibrary;
    }
}
