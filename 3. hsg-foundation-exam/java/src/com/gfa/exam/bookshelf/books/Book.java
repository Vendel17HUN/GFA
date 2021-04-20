package com.gfa.exam.bookshelf.books;

public abstract class Book {
  protected String title;
  protected String author;
  protected int releaseYear;
  protected int numberOfPages;
  protected int weightInGram;

  public Book(String title, String author, int releaseYear, int numberOfPages) {
    boolean invalidTitle = title == null || title.length() == 0;
    boolean invalidAuthor = author == null || author.length() == 0;
    boolean invalidNumberOfPages = numberOfPages < 1;

    if (invalidTitle || invalidAuthor || invalidNumberOfPages) {
      throw new IllegalArgumentException("Invalid argument in constructor.");
    }

    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
    this.numberOfPages = numberOfPages;
  }

  public String getBookInfo() {
    return author + ": " + title + " (" + releaseYear + ")";
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public abstract int getWeightInGram();
}
