package NamuDarbai;

import TestingNamuDarbai.OperatingCountry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperatingCountryTest {

    @Test
    public void testCorectCo2Emission() {
        // given
        OperatingCountry testOperation = new OperatingCountry();

        // when
        float result = testOperation.corectCo2Emission(10,"transportation");

        // then
        Assertions.assertEquals(9, result);
    }

    @Test
    public void testGetLowestCo2EmissionCountry() {
        // given
        OperatingCountry testOperation = new OperatingCountry();

        // when
        String result = testOperation.getLowestCo2EmissionCountry("vienas", "du", "trys", 3, 1, 2);

        // then
        Assertions.assertEquals("du", result);
    }

    @Test
    public void testGetSumOfAllCountriesCo2Emission() {
        // given
        OperatingCountry testOperation = new OperatingCountry();

        // when
        float result = testOperation.getSumOfAllCountriesCo2Emission(2.4f, 3.6f, 1.8f);

        // then
        Assertions.assertEquals(7.8f, result);
    }

    @Test
    public void testGetAverageSumOfAllCountriesCo2Emission() {
        // given
        OperatingCountry testOperation = new OperatingCountry();

        // when
        float result = testOperation.getAverageSumOfAllCountriesCo2Emission(2.4f, 4.4f, 2.2f);

        // then
        Assertions.assertEquals(3f, result);
    }
}
