package com.cloudproject.subscriptionservice.model;

public class Book {

  private long bookId;
  private String bookName;
  private String author;
  private long availableCopies;
  private long totalCopies;

  public Book() {
  }

  public Book(long bookId, String bookName, String author, long availableCopies, long totalCopies) {
    this.bookId = bookId;
    this.bookName = bookName;
    this.author = author;
    this.availableCopies = availableCopies;
    this.totalCopies = totalCopies;
  }

  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public long getAvailableCopies() {
    return availableCopies;
  }

  public void setAvailableCopies(long availableCopies) {
    this.availableCopies = availableCopies;
  }

  public long getTotalCopies() {
    return totalCopies;
  }

  public void setTotalCopies(long totalCopies) {
    this.totalCopies = totalCopies;
  }

  @Override
  public String toString() {
    return "book{" +
        "bookId=" + bookId +
        ", bookName='" + bookName + '\'' +
        ", author='" + author + '\'' +
        ", availableCopies=" + availableCopies +
        ", totalCopies=" + totalCopies +
        '}';
  }
}

