package nl.nhl;

public class Student extends Person {
    private int studiePunten;

    public Student(String adres, int studiePunten) {
        super(adres);
        this.studiePunten = studiePunten;
    }

    public Student(String adres) {
        super(adres);
    }

    public int getStudiePunten() {
        return studiePunten;
    }

    public void setStudiePunten(int studiePunten) {
        this.studiePunten = studiePunten;
    }
}
