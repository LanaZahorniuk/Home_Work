package org.example.HW_4;
/*
- Абстрактный класс:
    LibraryItem (Элемент Библиотеки)
        Поля:
            String title (название)
            String author (автор)
            Genre genre (жанр)

 */
public abstract class LibraryItem {
    public String title;
    public String author;
    public Genre genre;

    public LibraryItem(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
}
