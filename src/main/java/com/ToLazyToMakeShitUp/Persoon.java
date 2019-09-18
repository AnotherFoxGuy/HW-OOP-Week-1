package com.ToLazyToMakeShitUp;

public class Persoon {
    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String adres) {
        Adres = adres;
    }

    private String Naam;
    private String Adres;

    public Persoon(String naam, String adres) {
        Naam = naam;
        Adres = adres;
    }
}
