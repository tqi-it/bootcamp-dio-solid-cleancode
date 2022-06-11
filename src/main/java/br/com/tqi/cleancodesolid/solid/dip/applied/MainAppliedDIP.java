package br.com.tqi.cleancodesolid.solid.dip.applied;

public class MainAppliedDIP {

    public static void main(String[] args) {
        Shelf shelf = new Shelf();

        shelf.addProduct(new Book("SOLID IS NOT COOL"));
        shelf.addProduct(new Book("HARRY POTTER"));
        shelf.addProduct(new Book("CLEAN CODE"));

        shelf.addProduct(new DVD("Forrest Gump"));

        shelf.listProducts();

        shelf.getProducts().forEach(Product::getSample);

    }
}
