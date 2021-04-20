package com.gfa.exam.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new EBook("Spring Time Memories", "Rohsen Fayling", 2021, 230));
    books.add(new EBook("Summer Time Memories", "Rohsen Fayling", 2021, 340));
    books.add(new EBook("Autumn Time Memories", "Rohsen Fayling", 2021, 250));
    books.add(new EBook("Winter Time Memories", "Rohsen Fayling", 2021, 310));
    books.add(new EBook("Living in a Time Of Revolutions", "Marquis de Lafayette", 1794, 222));
    books.add(new EBook("In memoriam of Marie Antoniette", "Rohsen Fayling", 1793, 233));
    books.add(new EBook("Notorious", "Lana May Hawthrone", 1994, 600));
    books.add(new EBook("How to Teach Dunderheads", "Severus Snape", 1997, 50));
    books.add(new EBook("How to be a double agent", "Severus Snape", 2000, 800));
    books.add(new EBook("Advanced Potion making new Edition", "Severus Snape", 1997, 420));

    BookStore bookStore = new BookStore();
    bookStore.setShelf(books);

    System.out.println(bookStore.getAuthorOfLongestBook());
    List<Book> booksOf2021 = bookStore.getBooks(2021);
    for (Book book : booksOf2021) {
      System.out.println(book.getBookInfo());
    }
    System.out.println();
    System.out.println("----------------");
    System.out.println();
    bookStore.printBooks();
  }
}
