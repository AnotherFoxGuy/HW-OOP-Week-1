package com.ToLazyToMakeShitUp;

public class Student extends Persoon {
    private int Studiepunten;
    public Student(String naam, String adres) {
        super(naam, adres);
    }

    private int GetStudiepunten(){
        return Studiepunten;
    }

    public void addStudiepunten(int punten) {
        Studiepunten += punten;
    }
}
