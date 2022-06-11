package br.com.tqi.cleancodesolid.solid.dip.applied;

import java.util.ArrayList;
import java.util.List;

class Shelf {
    private List<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
        System.out.println("This adds a product!");
    }

    void listProducts() {
        System.out.println(products);
    }

    public List<Product> getProducts() {
        return products;
    }
}
