package org.example.HW_4;

import java.time.LocalDate;
import java.util.*;

public class CollectionProcessor {
    static void printAllItems(List<LibraryItem> items) {
        System.out.println(items);

    }

    static void listItemsByGenre(List<LibraryItem> items, Genre genre) {
        for (LibraryItem item :
                items) {
            if (item.genre == genre) {
                System.out.println(item.genre + " - " + item.author + ", " + item.title);
            }
        }
    }

    static void sortByTitle(List<LibraryItem> items) {
        items.sort(Comparator.comparing(item -> item.title));
        for (LibraryItem item : items) {
            System.out.println(item.title + ", " + item.author);
        }
    }

    static void filterByAuthor(List<LibraryItem> items, String author) {
        boolean foundAuthor = false;
        for (LibraryItem item :
                items) {
            if (item.author.equalsIgnoreCase(author)) {
                System.out.println(item.author + ", " + item.title);
                foundAuthor = true;
            }
        }
        if (!foundAuthor) {
            System.out.println("Author not found");
        }
    }

    public static int countItemsByStatus(List<LibraryItem> items, BookStatus status) {
        int count = 0;
        for (LibraryItem item :
                items) {
            if (item instanceof Book && ((Book) item).getStatus() == status) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }


    static void updateStatus(List<LibraryItem> items, String title, BookStatus oldStatus, BookStatus newStatus) {
        for (LibraryItem item :
                items) {
            if (item instanceof Book && item.title.equalsIgnoreCase(title) && ((Book) item).getStatus() == oldStatus) {
                ((Book) item).setStatus(newStatus);
            }
        }
    }


    static void listAvailableItems(List<LibraryItem> items) {
        List list = new ArrayList<>();
        for (LibraryItem item :
                items) {
            if (item instanceof Book && ((Book) item).getStatus() == BookStatus.AVAILABLE) {
                list.add(item);
            }
        }
        System.out.println(list.toString());
    }

    static void findOldestItem(List<LibraryItem> items) {
        if (items.isEmpty()) {
            System.out.println("The list is empty");
            return;
        }

    }



    void groupItemsByAuthor(List<LibraryItem> items) {

    }

    void listItemsForRepair(List<LibraryItem> items) {

    }

    void displayItemCount(List<LibraryItem> items) {

    }

    void listBorrowedItemsByUser(List<LibraryItem> items, User user) {

    }

    void removeLostItems(List<LibraryItem> items) {

    }

    void addItemToList(List<LibraryItem> items, LibraryItem item) {

    }

    void removeItemFromList(List<LibraryItem> items, LibraryItem item) {

    }

    void sortItemsByPublicationDate(List<LibraryItem> items) {

    }

    void findMostPopularGenre(List<LibraryItem> items) {

    }

    void calculateAveragePageCount(List<Book> books) {

    }

    void listMonthlyMagazines(List<Magazine> magazines) {

    }

    void listItemsByCondition(List<LibraryItem> items, BookStatus condition) {

    }
}

/*
CollectionProcessor (Обработчик Коллекций)
        Методы:
            void printAllItems(List<LibraryItem> items)
            void listItemsByGenre(List<LibraryItem> items, Genre genre)
            void sortByTitle(List<LibraryItem> items)
            void filterByAuthor(List<LibraryItem> items, String author)
            void countItemsByStatus(List<LibraryItem> items, BookStatus status)
            void updateStatus(List<LibraryItem> items, BookStatus oldStatus, BookStatus newStatus)
            void listAvailableItems(List<LibraryItem> items)
            void findOldestItem(List<LibraryItem> items)
            void groupItemsByAuthor(List<LibraryItem> items)
            void listItemsForRepair(List<LibraryItem> items)
            void displayItemCount(List<LibraryItem> items)
            void listBorrowedItemsByUser(List<LibraryItem> items, User user)
            void removeLostItems(List<LibraryItem> items)
            void addItemToList(List<LibraryItem> items, LibraryItem item)
            void removeItemFromList(List<LibraryItem> items, LibraryItem item)
            void sortItemsByPublicationDate(List<LibraryItem> items)
            void findMostPopularGenre(List<LibraryItem> items)
            void calculateAveragePageCount(List<Book> books)
            void listMonthlyMagazines(List<Magazine> magazines)
            void listItemsByCondition(List<LibraryItem> items, ItemCondition condition)
 */