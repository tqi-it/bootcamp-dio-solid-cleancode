package br.com.tqi.cleancodesolid.solid.srp.base;

import java.math.BigInteger;

public class Employee {

    private String name;
    private String addressStreet;
    private BigInteger salaryInCents;


    public BigInteger calculatePayment() {
        return salaryInCents;
    }

    public String getAddressStreet() {
        return addressStreet;
    }
}
