package Advanced.Polymorphism;

public interface RemoteControler {

    String FILE_LOCATION = "users/home/documents/...";

    void enable(boolean action);

    default void print() {
        System.out.println("Printing statement.");
    }
}
