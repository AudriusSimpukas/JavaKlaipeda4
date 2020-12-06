package lt.klaipeda.javafundamentals.task19;

public class Poem {
    Author creator;
    int stropheNumbers;

    public Poem (Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }
    public int getStropheNumbers() {
        return stropheNumbers;
    }
    public void setCreator(Author creator) {
        this.creator = creator;
    }
    public String getCreator() {
        return creator.getSurname() + " " + creator.getNatiobality();
    }
}
