package com.ToLazyToMakeShitUp;

import java.util.List;

public class Academie extends Omschrijving {
    List<School> Scholen;
    List<Docent> Docenten;
    List<Opleiding> Opleidingen;

    public Academie(String naam, String beschrijving) {
        super(naam, beschrijving);
    }

    public Academie(String naam, String beschrijving, List<School> scholen, List<Docent> docenten, List<Opleiding> opleidingen) {
        super(naam, beschrijving);
        Scholen = scholen;
        Docenten = docenten;
        Opleidingen = opleidingen;
    }

    public List<School> getScholen() {
        return Scholen;
    }

    public void addSchool(String naam, String beschrijving) {
        Scholen.add(new School(naam, beschrijving));
    }

    public List<Docent> getDocenten() {
        return Docenten;
    }

    public void addDocent(String naam, String adres) {
        Docenten.add(new Docent(naam, adres));
    }

    public List<Opleiding> getOpleidingen() {
        return Opleidingen;
    }

    public void addOpleidingen(String naam, String beschrijving) {
        Opleidingen.add(new Opleiding(naam, beschrijving));
    }


}
