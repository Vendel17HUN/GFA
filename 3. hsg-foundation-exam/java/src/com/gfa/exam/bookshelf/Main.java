package com.gfa.exam.bookshelf;

import com.gfa.exam.bookshelf.books.HardcoverBook;
import com.gfa.exam.bookshelf.books.PaperbackBook;

public class Main {
  public static void main(String[] args) {
    // program belépési pontja
    // innen tudod kipróbálni az általad írt kódot
    Bookshelf bookshelf = new Bookshelf();
    bookshelf.addBook(new HardcoverBook("asd", "asd", 2, 100));
    bookshelf.addBook(new HardcoverBook("asd2", "asd", 3, 10));
    bookshelf.addBook(new PaperbackBook("asd3", "asd2", 3, 100));
    bookshelf.addBook(new PaperbackBook("asd4", "asd2", 1, 10));
    bookshelf.addBook(new PaperbackBook("asd4", "asd2", 1, 10));

    System.out.println(bookshelf.getBooks(3));
    System.out.println(bookshelf.getLightestAuthor());
    System.out.println(bookshelf.getAuthorOfMostWrittenPages());
    bookshelf.printBooks();
    try {
//      bookshelf.addBook(null);
//      bookshelf.addBook(new HardcoverBook("", "asd", 3, 10));
//      bookshelf.addBook(new HardcoverBook("sad", null, 3, 10));
      bookshelf.addBook(new PaperbackBook("asd4", "asd2", 1, -10));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
