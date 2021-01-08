package Advanced.Composition;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(
                new Bed(10.4, 4),
                new TV("4k")
        );

    }
}
