package br.com.tqi.cleancodesolid.cleancode.commentrules;

class Pc {
    private String n = "38400-000";

    public String getN() {
        return n;
    }
}

/**
 * This is the Address of the Person
 * @author I_WANT_THE_CREDIT
 */
class Addrs {

    /**
     * This is the Person Postal Code
     */
    private Pc pc = new Pc();

    /**
     * Get The Person Postal Code
     * @return {@link Pc}
     */
    public Pc getPc() {
        return pc;
    }

    public String getPCN() {
        return pc.getN();
    }
}

class Prsn {
    private Addrs addrs = new Addrs();

    public Addrs getAddrs() {
        return addrs;
    }

    public String getPCN() {
        return addrs.getPCN();
    }
}

class Main {
    public static void main(String[] args) {

        Prsn prsn = new Prsn(); // Instance a Person
        System.out.println(prsn.getPCN()); // Code Working don't comment this one
        //System.out.println(prsn.getAddrs().getPc().getN()); Code commented because I want to test if this is works in other way
    }
}
