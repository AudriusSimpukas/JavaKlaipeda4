package TestingNamuDarbai;

import java.time.LocalDate;

public class OperatingTractor {

    public double findMostExpensiveTractor(Object[][] vehicle) {
        double price = (double) vehicle[0][4];
        int index = 0;
        for (int i = 1; i < vehicle.length; i++) {
            if ((double) vehicle[i][4] > price) {
                price = (double) vehicle[i][4];
                index = i;
            }
        }
        System.out.println("The most expensive tractor is " + vehicle[index][0] + " " + vehicle[index][1]);
        return price;
    }

    public LocalDate findOldestTractor(Object[][] vehicle) {
        LocalDate oldestDate = (LocalDate) vehicle[0][3];
        int index = 0;
        for (int i = 1; i < vehicle.length; i++) {
            if (oldestDate.isAfter((LocalDate) vehicle[i][3])) {
                oldestDate = (LocalDate) vehicle[i][3];
                index = i;
            }
        }
        System.out.println("The oldest tractor is " + vehicle[index][0]);
        return oldestDate;
    }

    public void findTractorWithLargeTank(Object[][] vehicle) {
        System.out.print("Tractors with tank capacity, bigger than 300l: ");
        for (int i = 0; i < vehicle.length; i++) {
            if ((int) vehicle[i][2] > 300) {
                System.out.print(vehicle[i][0] + ", ");
            }
        }
        System.out.println();
    }

    public void findTractorModel(Object[][] vehicle) {
        System.out.print("Tractors with model name beginning 'M': ");
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i][1].toString().matches("(?i)^[m].+$")) {
                System.out.print(vehicle[i][0] + " (" + vehicle[i][1] + "), ");
            }
        }
        System.out.println();
    }
}
