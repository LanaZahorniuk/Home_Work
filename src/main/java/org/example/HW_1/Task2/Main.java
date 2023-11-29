package org.example.HW_1.Task2;


public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.addBook("Alphabet", "brothers Cyril and Methodius", 863);
        book.addBook("Harry Potter", "Joanne K. Rowling", 1997);
        book.addBook("Bible", "prophet Daniel", 1523);
        book.addBook("Fight club", "Chuck Palahniuk", 2020);

        System.out.println("----------------------------------------------------");

        book.getBookInfo("the quantum physics");
        book.getBookInfo("Bible");

        book.getOldBook("Alphabet");
        book.getOldBook("Fight club");

        System.out.println("----------------------------------------------------");

        Reader reader = new Reader();
        reader.addReader("Lana", 100);
        reader.addReader("Sara", 10);
        reader.addReader("Thom", 1000);

        System.out.println("----------------------------------------------------");

        reader.getBook("Alphabet", "Sara");
        reader.getBook("Harry Potter", "Lana");
        // reader.getBook("ABC", "Lana");

        System.out.println("----------------------------------------------------");

        System.out.println("Содержимое bookList:");
        for (Book bookBook : reader.bookList) {
            System.out.println("name reader: " + bookBook.getNameReader() + ", book: " + bookBook.getNameBook());
        }
        System.out.println("----------------------------------------------------");

        reader.returnBook("Alphabet", "Sara");

        System.out.println("Содержимое bookList:");
        for (Book bookBook : reader.bookList) {
            System.out.println("name reader: " + bookBook.getNameReader() + ", book: " + bookBook.getNameBook());
        }
        System.out.println("----------------------------------------------------");

        Librarian librarian1 = new Librarian("Artur", 54);
        Librarian librarian2 = new Librarian("Giselle", 23);
        System.out.println(librarian1);
        System.out.println(librarian2);

        System.out.println("----------------------------------------------------");

        Librarian.giveBook("Alphabet", librarian1, "Thom");
        Librarian.giveBook("Harry Potter", librarian2, "Lana");
        Librarian.showAvailableBooks();

        Librarian.takeBookFromReader("Alphabet", librarian1, "Thom");
        Librarian.takeBookFromReader("Harry Potter", librarian2, "Lana");
        Librarian.showAvailableBooks();
        System.out.println("----------------------------------------------------");

        Library library = new Library();

        library.addLibrary("Big American Library", "USA", "Artur");
        library.addLibrary("Big American Library", "USA", "Sara");
        library.addLibrary("Big American Library", "USA", "Leonardo");
        library.addLibrary("Big American Library", "USA", "Rosa");
        System.out.println(library.librarianList.toString());

        System.out.println("----------------------------------------------------");

        library.searchLibrarian("Artur");
        library.searchLibrarian("Lana");

    }
}


