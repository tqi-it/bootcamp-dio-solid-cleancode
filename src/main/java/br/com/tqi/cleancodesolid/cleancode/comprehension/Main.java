package br.com.tqi.cleancodesolid.cleancode.comprehension;

public class Main {

    public Main(String[] args, int i) {
       // ...
    }

    public static void main(String[] args) {
        String userName = args[1];
        if (isNull(userName))
            throw new RuntimeException("Bad Name");

    }

    private static boolean isNull(String userName) {
        if (userName == null) {
            return true;
        }
        return false;
    }
}
