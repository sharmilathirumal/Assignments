package org.example;

public class Book {
   private int bookId;
   private String title;
   private String author;
   private boolean isAvailable;
   private int count;

    public int getBookId() {

        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Book(int bookId, String title, String author, boolean isAvailable,int count){
        this.bookId =bookId;
        this.title = title;
        this.author =author;
        this.isAvailable=isAvailable;
        this.count = count;
    }
}
