package com.gfa.exam.bookstore;

public abstract class Book {
    protected String title;
    protected String author;
    protected int releaseYear;
    protected String format;
    protected int estimatedTimeToRead;

//    public Book() {
//    }

    public Book(String title, String author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getBookInfo(){
        return author + ":  "+ title + " (" + releaseYear + ")";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getEstimatedTimeToRead() {
        return estimatedTimeToRead;
    }

    public void setEstimatedTimeToRead(int estimatedTimeToRead) {
        this.estimatedTimeToRead = estimatedTimeToRead;
    }
}
