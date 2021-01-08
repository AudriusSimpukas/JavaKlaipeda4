package Advanced.Composition;

public class Room {

    private Bed bed;
    private TV tv;

    public Room(Bed bed, TV tv) {
        this.bed = bed;
        this.tv = tv;
    }
}
