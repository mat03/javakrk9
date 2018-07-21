package DP.models;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private Integer quntity;

    public Book(String author, String title, Integer quntity) {
        this.author = author;
        this.title = title;
        this.quntity = quntity;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Integer getQuntity() {
        return quntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(author, title);
    }
}


