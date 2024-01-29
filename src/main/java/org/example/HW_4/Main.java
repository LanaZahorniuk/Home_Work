package org.example.HW_4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "Joanne Rowling", Genre.FICTION, BookStatus.AVAILABLE, LocalDate.of(2007, 1, 27), 300);
        Book book2 = new Book("The Colour of Magic", "Terry Pratchett", Genre.NON_FICTION, BookStatus.BORROWED, LocalDate.of(1997, 3, 15), 1200);
        Book book3 = new Book("Rebecca", "Daphne du Maurier", Genre.SCIENCE, BookStatus.RESERVED, LocalDate.of(1845, 12, 4), 800);
        Book book4 = new Book("The Tenant of Wildfell Hall", "Anne Brontë", Genre.FANTASY, BookStatus.UNDER_REPAIR, LocalDate.of(2023, 4, 30), 450);
        Book book5 = new Book("Java", "Herbert Schildt", Genre.HISTORY, BookStatus.LOST, LocalDate.of(1977, 8, 28), 830);
        Book book6 = new Book("Fahrenheit 451", "Ray Douglas Bradbury", Genre.FANTASY, BookStatus.UNDER_REPAIR, LocalDate.of(2023, 4, 30), 450);
        Book book7 = new Book("Book", "Author", Genre.BIOGRAPHY, BookStatus.LOST, LocalDate.of(1967, 10, 12), 230);

        Magazine magazine1 = new Magazine("Playboy", "Playboy Enterprises", Genre.FANTASY, 100723, LocalDate.of(2012, 10, 2), false);
        Magazine magazine2 = new Magazine("Magazine2", "Author", Genre.HISTORY, 120004, LocalDate.of(1605, 7, 15), true);


        List<LibraryItem> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);
        listBook.add(book5);
        listBook.add(book6);
        listBook.add(book7);

        listBook.add(magazine1);
        listBook.add(magazine2);

        //CollectionProcessor.printAllItems(listBook);
        //CollectionProcessor.listItemsByGenre(listBook, Genre.FANTASY);
        //CollectionProcessor.sortByTitle(listBook);
        //CollectionProcessor.filterByAuthor(listBook, "author");
        //CollectionProcessor.countItemsByStatus(listBook, BookStatus.LOST);
        //CollectionProcessor.updateStatus(listBook, "Java", BookStatus.LOST, BookStatus.AVAILABLE );
        //CollectionProcessor.listAvailableItems(listBook);
        CollectionProcessor.findOldestItem(listBook);


    }
}
