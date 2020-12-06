package lt.klaipeda.javafundamentals.task19;

public class Main {
    public static void main(String[] args) {
        Author pirmas = new Author("Jonaitis", "lietuvis");

        Poem pirmaPoema = new Poem(pirmas, 300);
        System.out.println(pirmaPoema.getStropheNumbers());

        pirmaPoema.stropheNumbers = 200;
        pirmaPoema.setCreator(pirmas);

        System.out.println(pirmaPoema.getCreator());
    }
}
