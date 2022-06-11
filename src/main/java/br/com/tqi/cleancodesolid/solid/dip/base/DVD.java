package br.com.tqi.cleancodesolid.solid.dip.base;

public class DVD {

    private String name;

    public DVD(String name) {
        this.name = name;
    }

    void seeReviews() {
        System.out.println("This is the reviews from DVD!");
    }

    void watchSample() {
        System.out.println("This is the sample from DVD!");
    }
}
