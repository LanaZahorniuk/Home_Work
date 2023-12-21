package org.example.HW_4;

import java.util.List;

/*
    Searchable (Поисковый)
        Методы:
            List<LibraryItem> findByTitle(String title)
            List<LibraryItem> findByAuthor(String author)
            List<LibraryItem> findByGenre(Genre genre)

 */
public interface Searchable {
    List<LibraryItem> findByTitle(String title);
    List<LibraryItem> findByAuthor(String author);
    List<LibraryItem> findByGenre(Genre genre);
}
