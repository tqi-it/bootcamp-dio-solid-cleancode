package br.com.tqi.cleancodesolid.solid.dip.applied;

class Book extends Product {

    public Book(String name) {
        super(name);
    }

    @Override
    void seeReviews() {
        System.out.println("This is the reviews from book: " + this.getName());
    }

    @Override
    void getSample() {
        System.out.println("This is the sample from book: " + this.getName());
    }
}
