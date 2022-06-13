package br.com.tqi.cleancodesolid.cleancode.methodrules;

public class SideEffect {

    private String name;

    public SideEffect(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void splitInToFirstName() {
        name = name.split(" ")[0];
    }

    public String getFirtName() {
        return name.split(" ")[0];
    }

    public static void main(String[] args) {
        SideEffect sideEffect = new SideEffect("Klérisson Paixão");
        sideEffect.splitInToFirstName();
        System.out.println(sideEffect.getName());

        sideEffect = new SideEffect("Klérisson Paixão");
        System.out.println(sideEffect.getFirtName());
    }
}
