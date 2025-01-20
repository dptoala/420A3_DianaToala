package com.modelingClasses;

public class Main {
    public static void main (String[] args){
    System.out.println("Hello world");

    //Library Class
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", 328);
        System.out.println("Adding book1: " + library.AddBook(book1));  // true
    }
}
