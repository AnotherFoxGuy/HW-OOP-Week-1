package com.ToLazyToMakeShitUp;

import java.util.List;

public class Opleiding extends Omschrijving {
    List<Student> students;

    public Opleiding(String naam, String beschrijving, List<Student> students) {
        super(naam, beschrijving);
        this.students = students;
    }

    public Opleiding(String naam, String beschrijving) {
        super(naam, beschrijving);
    }
}
