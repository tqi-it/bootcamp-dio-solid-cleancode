package br.com.tqi.cleancodesolid.cleancode.methodrules;

public class FlagArgument {

    public int distance(int pointA, int pointB, boolean kilometers) {
        if (kilometers) {
            // ...
            //...
            return 1;
        } else {

            // ...
            //... miles
            return 1;
        }

    }

    public int distanceInMiles(int pointA, int pointB) {
        //...
        return 1;
    }

    public int distanceInKilometers(int pointA, int pointB) {
        //...
        return 1;
    }

}
