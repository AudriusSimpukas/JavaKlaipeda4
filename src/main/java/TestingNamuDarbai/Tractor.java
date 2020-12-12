package TestingNamuDarbai;

import java.time.LocalDate;

public class Tractor {

    private String tractorMaker;
    private String model;
    private int tankSize;
    private LocalDate make;
    private double price;

    static Object[][] tractors = new Object[3][5];
    static int counter = -1;

    {
        counter += 1;
    }

    public Tractor(String tractorMaker, String model, int tankSize, String makeDate, double price) {
        this.tractorMaker = tractorMaker;
        this.model = model;
        this.tankSize = tankSize;
        this.make = LocalDate.parse(makeDate);
        this.price = price;

        Object[] tractor = new Object[]{tractorMaker, model, tankSize, make, price};
        tractors[counter] = tractor;
    }
}
