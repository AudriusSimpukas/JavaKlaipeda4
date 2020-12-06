package lt.klaipeda.javafundamentals.task0;

public class Task0 {
    private static final String model = "Casio";
    private String owner;

    public Task0(String owner) {
        this.owner = owner;
    }

    public void wakeUp() {
        System.out.println("Laikas keltis " + owner);
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
}
