package nl.nhl;

public class Person {

    private String adres;
    private String name;

    Person(String adres) {
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

}
