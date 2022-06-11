package br.com.tqi.cleancodesolid.cleancode.namerules;

class Pc {
    private String n = "38400-000";

    public String getN() {
        return n;
    }
}

class Addrs {
    private Pc pc = new Pc();

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
        Prsn prsn = new Prsn();
        System.out.println(prsn.getPCN());
    }
}
