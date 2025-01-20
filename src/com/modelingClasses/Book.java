package com.modelingClasses;

public class Book {
    //Attributes
    String title;
    String author;
    int numberOfPages;

    //Constructor
    public Book(String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    //Methods Get and Set
    public String GetTitle(){
        return this.title;
    }

    public void SetTitle(String title) {
      this.title = title;
    }

    public String GetAuthor(){
        return this.author;
    }

    public void SetAuthor(String author){
        this.author = author;
    }

    public int GetNumberOfPages(){
        return this.numberOfPages;
    }

    public void SetNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
}
