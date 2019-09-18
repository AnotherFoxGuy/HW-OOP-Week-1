package com.ToLazyToMakeShitUp;

import java.util.List;

public class School extends Omschrijving{
    List<Opleiding> Opleidingen;

    public School(String naam, String beschrijving) {
        super(naam, beschrijving);
    }

    public List<Opleiding> getOpleidingen() {
        return Opleidingen;
    }

    public void addOpleiding(String naam, String beschrijving) {
        Opleidingen.add(new Opleiding(naam, beschrijving));
    }
}
