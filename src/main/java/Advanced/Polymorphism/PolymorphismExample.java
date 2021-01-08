package Advanced.Polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {

        RemoteControler remote = new TvRemoteControler();
        remote.enable(true);

        remote = new AcRemoteControler();
        remote.enable(false);

        remote.print();
    }
}
