package br.com.tqi.cleancodesolid.cleancode.comprehension;

public class UserName {

    private String value;

    public UserName(String value) {
        if (value == null)
            throw new IllegalArgumentException("null name");

        if (!UserName.IsValid(value))
            throw new IllegalArgumentException("Invalid value " + value);

        this.value = value;
    }

    public static boolean IsValid(String candidate) {
        if (null == candidate)
            return false;

        return candidate.trim().toUpperCase() == candidate;
    }

}
