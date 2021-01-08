package Advanced.Enumerators;

public enum AutoMakers {

    BMW(2, "Boomer", true),
    AUDI(4, "Avant", true),
    VW(3, "Passat", false),
    VOLVO(5, "S60", false);

    private final int engineSize;
    private final String carName;
    private final boolean runAndDrive;

    AutoMakers(int engineSize, String carName, boolean runAndDrive) {
        this.engineSize = engineSize;
        this.carName = carName;
        this.runAndDrive = runAndDrive;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getCarName() {
        return carName;
    }

    public boolean isRunAndDrive() {
        return runAndDrive;
    }
}
