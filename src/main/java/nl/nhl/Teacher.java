package nl.nhl;

public class Teacher extends Person {
    private String functie;

    public Teacher(String adres, String functie) {
        super(adres);
        this.functie = functie;
    }

    public Teacher(String adres) {
        super(adres);
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }


}
