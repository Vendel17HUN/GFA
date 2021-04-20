package com.gfa.exam.bookshelf.books;

public class PaperbackBook extends Book {

  public PaperbackBook(String title, String author, int releaseYear, int numberOfPages) {
    super(title, author, releaseYear, numberOfPages);
  }

  @Override
  public int getWeightInGram() {
    return numberOfPages * 10 + 20;
  }

}
