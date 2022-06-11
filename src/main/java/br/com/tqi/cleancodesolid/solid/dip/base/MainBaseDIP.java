package br.com.tqi.cleancodesolid.solid.dip.base;

public class MainBaseDIP {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();

        shelf.addBook(new Book("SOLID IS NOT COOL"));
        shelf.addBook(new Book("HARRY POTTER"));
        shelf.addBook(new Book("CLEAN CODE"));
        shelf.listBooks();

        shelf.getBooks().get(0).readSample();

    }
}
