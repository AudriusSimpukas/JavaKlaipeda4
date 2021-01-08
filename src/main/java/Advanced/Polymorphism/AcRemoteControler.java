package Advanced.Polymorphism;

public class AcRemoteControler implements RemoteControler{

    @Override
    public void enable(boolean action) {
        System.out.println("Turning Air Comdition on - " + action);
    }
}
