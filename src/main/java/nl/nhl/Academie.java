package nl.nhl;

import java.util.List;

public class Academie extends Bloemkool {

    List<Kaas> opleidingens;
    List<Teacher> teachers;

    public Academie(String naam, String beschrijving) {
        super(naam, beschrijving);
    }

    public Academie(String naam, String beschrijving, List<Kaas> opleidingens) {
        super(naam, beschrijving);
        this.opleidingens = opleidingens;
    }

    public List<Kaas> getOpleidingens() {
        return opleidingens;
    }

    public void setOpleidingens(List<Kaas> opleidingens) {
        this.opleidingens = opleidingens;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
