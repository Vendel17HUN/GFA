package com.gfa.exam.bookshelf;

import com.gfa.exam.bookshelf.books.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bookshelf {
  private List<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    if (book == null) {
      throw new IllegalArgumentException("Book can't be null.");
    }
    books.add(book);
  }

  public List<Book> getBooks(int year) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.getReleaseYear() == year) {
        result.add(book);
      }
    }
    return result;
  }

  public String getLightestAuthor() {
    if (books.size() < 1) {
      return "";
    }
    Book lightestBook = books.get(0);
    for (Book book : books) {
      if (book.getWeightInGram() < lightestBook.getWeightInGram()) {
        lightestBook = book;
      }
    }
    return lightestBook.getAuthor();
  }

  public String getAuthorOfMostWrittenPages() {
    if (books.size() < 1) {
      return "";
    }
    HashMap<String, Integer> countAuthorPages = countAuthorPages();
    String authorOfMostWrittenPages = "";
    int mostWrittenPages = -1;
    for (String author : countAuthorPages.keySet()) {
      Integer writtenPages = countAuthorPages.get(author);
      if (writtenPages > mostWrittenPages) {
        authorOfMostWrittenPages = author;
        mostWrittenPages = writtenPages;
      }
    }
    return authorOfMostWrittenPages;
  }

  public void printBooks() {
    for (Book book : books) {
      System.out.println(book.getBookInfo());
    }
  }

  private HashMap<String, Integer> countAuthorPages() {
    HashMap<String, Integer> countAuthorPages = new HashMap<>();
    for (Book book : books) {
      String author = book.getAuthor();
      int numberOfPages = book.getNumberOfPages();
      if (countAuthorPages.containsKey(author)) {
        countAuthorPages.put(author, countAuthorPages.get(author) + numberOfPages);
      } else {
        countAuthorPages.put(author, numberOfPages);
      }
    }
    return countAuthorPages;
  }
}
