package br.com.tqi.cleancodesolid.cleancode.comprehension;

public class BoundaryConditions {

    public static void main(String[] args) {

        int level = 0;

        // ....

        if (level + 1 < args.length) {
            Main main = new Main(args, level + 1);
        }

        int nextLevel = level + 1;
        if(nextLevel < args.length) {
            Main main = new Main(args, nextLevel);
        }

    }

}
