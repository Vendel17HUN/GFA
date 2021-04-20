package com.gfa.exam.bookstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class BookStore {

    private List<Book> shelf = new ArrayList<>();

    public BookStore(){}
    public BookStore(List<Book> shelf){
        this.shelf = shelf;
    }

    public void addBook(Book book){
        shelf.add(book);
    }

    public List<Book> getBooks(int year){
        return shelf.stream()
                .filter(book -> book.getReleaseYear() == year)
                .collect(Collectors.toList());
    }

    public String getAuthorOfLongestBook(){
        OptionalInt maxTime = shelf.stream()
                .map(Book::getEstimatedTimeToRead)
                .mapToInt(Integer::intValue).max();

        String author = "";

        for (Book book : shelf) {
           if(book.getEstimatedTimeToRead() == maxTime.getAsInt()){
               author = book.getAuthor();
           }
        }

        return author;
    }

    public void printBooks(){
        for (Book book : shelf) {
            System.out.println(book.getBookInfo());
        }
    }

    public List<Book> getShelf() {
        return Collections.unmodifiableList(shelf);
    }

    public void setShelf(List<Book> shelf) {
        this.shelf = shelf;
    }
}
