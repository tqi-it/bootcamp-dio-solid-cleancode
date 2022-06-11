package br.com.tqi.cleancodesolid.cleancode.designrules.lod;

class PostalCode {
    private final String number = "38400-000";

    public String getNumber() {
        return number;
    }
}

class Address {
    private final PostalCode postalCode = new PostalCode();

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public String getPostalCodeNumber() {
        return postalCode.getNumber();
    }
}

class Person {
    private final Address address = new Address();

    public Address getAddress() {
        return address;
    }

    public String getPostalCodeNumber() {
        return address.getPostalCodeNumber();
    }
}

class Main {
    public static void main(String[] args) {
        //notApplied
        Person person = new Person();
        System.out.println(person.getAddress().getPostalCode().getNumber());

        //Applied
        System.out.println(person.getPostalCodeNumber());
    }
}
