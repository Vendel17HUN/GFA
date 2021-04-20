package com.gfa.exam.bookshelf.books;

public class HardcoverBook extends Book {

  public HardcoverBook(String title, String author, int releaseYear, int numberOfPages) {
    super(title, author, releaseYear, numberOfPages);
  }

  @Override
  public int getWeightInGram() {
    return numberOfPages * 10 + 100;
  }
}
