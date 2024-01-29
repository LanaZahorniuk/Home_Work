package org.example.HW_4;

import java.time.LocalDate;

/*
    Book (Книга) Реализует: LibraryItem, Borrowable, Maintainable
        Поля:
            BookStatus status
            LocalDate publishDate
            int pageCount  11111
 */
public class Book extends LibraryItem implements Borrowable, Maintainable {

    BookStatus status;
    public LocalDate publishDate;
    public int pageCount;


    public Book(String title, String author, Genre genre, BookStatus status, LocalDate publishDate, int pageCount) {
        super(title, author, genre);
        this.status = status;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
    }

    @Override
    public void borrowItem(User user) {

    }

    @Override
    public void returnItem(User user) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void repairItem() {

    }

    @Override
    public void updateItemCondition(BookStatus condition) {

    }

    @Override
    public ItemCondition checkCondition() {
        return null;
    }

    @Override
    public String toString() {
        return "status: " + status +
                ", publishDate: " + publishDate +
                ", pageCount: " + pageCount +
                ", title: " + title+
                ", author: " + author +
                ", genre: " + genre;
    }

    public BookStatus getStatus() {
        return status;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
