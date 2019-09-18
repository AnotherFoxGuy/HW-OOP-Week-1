package com.ToLazyToMakeShitUp;

public class Docent extends Persoon {
    private String Functie;
    public Docent(String naam, String adres) {
        super(naam, adres);
    }

    public String getFunctie() {
        return Functie;
    }

    public void setFunctie(String functie) {
        Functie = functie;
    }
}
