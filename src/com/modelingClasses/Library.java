package com.modelingClasses;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    //Constructor
    public Library(){
        this.books = new ArrayList<>();
    }

    //Functions
    public boolean AddBook(Book book){
        for (Book b : books )
        {
            if(b.GetTitle().equals(book.GetTitle())){
                return false;
            }
        }
        books.add(book);
        return true;
    }
}
