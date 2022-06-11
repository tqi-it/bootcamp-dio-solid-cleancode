package br.com.tqi.cleancodesolid.solid.dip.base;

class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    void seeReviews() {
        System.out.println("This is the reviews from book: "+ name);
    }

    void readSample() {
        System.out.println("This is the sample from book: " + name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
