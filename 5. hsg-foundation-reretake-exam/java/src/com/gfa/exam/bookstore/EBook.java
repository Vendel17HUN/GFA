package com.gfa.exam.bookstore;

public class EBook extends Book{

    private int numberOfPages;

    public EBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear);
        this.numberOfPages = numberOfPages;
        this.estimatedTimeToRead = numberOfPages *5;
        this.format = "electronic";
    }
}
