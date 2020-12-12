package NamuDarbai;

import TestingNamuDarbai.OperatingHouse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperatingHouseTest {

    @Test
    public void testGetNewestHouse() {
        // given
        OperatingHouse testOperation = new OperatingHouse();

        // when
        int result = testOperation.getNewestHouse(2015, 2018, 2020);

        // then
        Assertions.assertEquals(2020, result);
    }

    @Test
    public void testCountFittedHouses() {
        // given
        OperatingHouse testOperation = new OperatingHouse();

        // when
        int result = testOperation.countFittedHouses("fitted", "not finished", "fitted");

        // then
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testGetSmallestHouse() {
        // given
        OperatingHouse testOperation = new OperatingHouse();

        // when
        int result = testOperation.getSmallestHouse(80, 120, 160);

        // then
        Assertions.assertEquals(80, result);
    }

}
