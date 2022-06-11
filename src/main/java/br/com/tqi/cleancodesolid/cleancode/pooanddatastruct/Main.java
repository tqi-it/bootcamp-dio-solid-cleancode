package br.com.tqi.cleancodesolid.cleancode.pooanddatastruct;

class Main {
    private final String personName;
    private final String personAddressStreetName;
    private final String personAddressPostalCodeNumber;

    public Main(String personName, String personAddressStreetName, String personAddressPostalCodeNumber) {
        this.personName = personName;
        this.personAddressStreetName = personAddressStreetName;
        this.personAddressPostalCodeNumber = personAddressPostalCodeNumber;
    }

    public String buildStringConcatOfFields(boolean allFields){
        if(allFields)
            return this.personAddressPostalCodeNumber + this.personAddressStreetName + this.personName;
        return this.personAddressPostalCodeNumber + this.personName;
    }

    public static void main(String[] args) {
        Main main = new Main("Jose", "Maria", "12345678--");
        System.out.println(main.buildStringConcatOfFields(true));
        System.out.println(main.buildStringConcatOfFields(false));
    }
}
