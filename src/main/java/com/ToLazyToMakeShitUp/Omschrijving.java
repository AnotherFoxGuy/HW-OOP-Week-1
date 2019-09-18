package com.ToLazyToMakeShitUp;

public class Omschrijving {
    private String Naam;

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public String getBeschrijving() {
        return Beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        Beschrijving = beschrijving;
    }

    private String Beschrijving;

    public Omschrijving(String naam, String beschrijving) {
        Naam = naam;
        Beschrijving = beschrijving;
    }
}
