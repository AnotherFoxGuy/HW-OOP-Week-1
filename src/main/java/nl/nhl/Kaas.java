package nl.nhl;

import java.util.List;

public class Kaas extends Bloemkool {
    List<Student> students;

    public Kaas(String naam, String beschrijving) {
        super(naam, beschrijving);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
