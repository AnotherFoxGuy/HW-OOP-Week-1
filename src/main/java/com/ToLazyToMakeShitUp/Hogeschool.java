package com.ToLazyToMakeShitUp;

import java.util.List;

public class Hogeschool extends Omschrijving {
    List<Academie> Academies;

    public Hogeschool(String naam, String beschrijving, List<Academie> academies) {
        super(naam, beschrijving);
        Academies = academies;
    }

    public Hogeschool(String naam, String beschrijving) {
        super(naam, beschrijving);
    }

    public void addAcademie(String naam, String beschrijving){
        Academies.add(new Academie(naam, beschrijving));
    }

    public void removeAcademie(String naam){
        Academies.remove(naam);
    }
}
