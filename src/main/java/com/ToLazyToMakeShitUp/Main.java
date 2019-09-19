package com.ToLazyToMakeShitUp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Hogeschool kaas = new Hogeschool("Kaas", "Boter", new ArrayList<Academie>() {{
            add(new Academie("Technologie", "Technishe opleidingen", new ArrayList<School>() {{
                add(new School("School of ICT", "Alle IT opleidingen"));
            }}, new ArrayList<Docent>() {{
                add(new Docent("Jos", "Privé"));
                add(new Docent("Wouter", "Privé"));
            }}, new ArrayList<Opleiding>() {{
                add(new Opleiding("Test", "Test", new ArrayList<Student>() {{
                    add(new Student("Harry", "Amsterdam"));
                    add(new Student("Piet", "Limburg"));
                    add(new Student("Alex", "Groningen"));
                }}));
            }}));

            add(new Academie("Zaklijk", "Zakelijke opleidingen", new ArrayList<School>() {{
                add(new School("School of ICT", "Alle IT opleidingen"));
            }}, new ArrayList<Docent>() {{
                add(new Docent("Jos", "Privé"));
                add(new Docent("Wouter", "Privé"));
            }}, new ArrayList<Opleiding>() {{
                add(new Opleiding("Test", "Test", new ArrayList<Student>() {{
                    add(new Student("Harry", "Amsterdam"));
                    add(new Student("Piet", "Limburg"));
                    add(new Student("Alex", "Groningen"));
                }}));
            }}));
        }});

        System.out.println("Console is: ");

    }
}
