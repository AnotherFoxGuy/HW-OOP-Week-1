package com.ToLazyToMakeShitUp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Hogeschool kaas = new Hogeschool("Kaas", "Boter", new ArrayList<Academie>() {{
            new Academie("Technologie", "Technishe opleidingen", new ArrayList<School>() {{
                new School("School of ICT", "Alle IT opleidingen");
            }}, new ArrayList<Docent>() {{
                new Docent("Jos", "Privé");
                new Docent("Wouter", "Privé");
            }}, new ArrayList<Opleiding>() {{
                new Opleiding("Test", "Test", new ArrayList<Student>() {{
                    new Student("Harry", "Amsterdam");
                    new Student("Piet", "Limburg");
                    new Student("Alex", "Groningen");
                }});
            }});

            new Academie("Zaklijk", "Zakelijke opleidingen", new ArrayList<School>() {{
                new School("School of ICT", "Alle IT opleidingen");
            }}, new ArrayList<Docent>() {{
                new Docent("Jos", "Privé");
                new Docent("Wouter", "Privé");
            }}, new ArrayList<Opleiding>() {{
                new Opleiding("Test", "Test", new ArrayList<Student>() {{
                    new Student("Harry", "Amsterdam");
                    new Student("Piet", "Limburg");
                    new Student("Alex", "Groningen");
                }});
            }});
        }});

    }
}
