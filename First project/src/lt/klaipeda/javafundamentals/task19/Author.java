package lt.klaipeda.javafundamentals.task19;

public class Author {
    private String surname;
    private String natiobality;

    public Author (String surname, String natiobality) {
        this.surname = surname;
        this.natiobality = natiobality;
    }
    public String getSurname() {
        return surname;
    }
    public String getNatiobality() {
        return natiobality;
    }
}
