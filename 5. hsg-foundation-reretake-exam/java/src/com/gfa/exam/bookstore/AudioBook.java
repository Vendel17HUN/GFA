package com.gfa.exam.bookstore;

public class AudioBook extends  Book{

    private int duration;

    public AudioBook(String title, String author, int releaseYear, int duration) {
        super(title, author, releaseYear);
        this.duration = duration;
        this.estimatedTimeToRead = duration *2;
        this.format = "audio";
    }
}
