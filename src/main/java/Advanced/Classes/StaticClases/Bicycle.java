package Advanced.Classes.StaticClases;

public class Bicycle {

    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // nested class
    public static class Mechanic {
        public void upgrade(Bicycle bicycle) {
            bicycle.maxSpeed += 3;
        }
    }
}
