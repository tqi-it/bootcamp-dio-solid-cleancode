package br.com.tqi.cleancodesolid.solid.lsp.applied;

public class MainAppliedLsp {
    public static void main(String[] args) {
        Mammal mammal = new Whale();
        mammal.move();
    }
}
