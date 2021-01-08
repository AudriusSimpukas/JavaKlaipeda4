package Advanced.Polymorphism;

public class TvRemoteControler implements RemoteControler{

    @Override
    public void enable(boolean action) {
        System.out.println("Turning TV on - " + FILE_LOCATION);
    }


}
