package br.com.tqi.cleancodesolid.solid.dip.applied;

class DVD extends Product {

    public DVD(String name) {
        super(name);
    }

    @Override
    void seeReviews() {
        System.out.println("This is the reviews from DVD: " + this.getName());
    }

    @Override
    void getSample() {
        System.out.println("This is the sample from DVD: " + this.getName());
    }
}
