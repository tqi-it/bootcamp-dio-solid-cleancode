package br.com.tqi.cleancodesolid.solid.dip.base;

import java.util.ArrayList;
import java.util.List;

class Shelf {
    List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("This adds a book!");
    }

    void listBooks(){
        System.out.println(books);
    }

    public List<Book> getBooks() {
        return books;
    }
}
