package TestingNamuDarbai;

public class OperatingCountry {

    public float corectCo2Emission(float co2, String factor) {
        float countedCo2 = 0;
        if (factor == "animal husbandry") {
            countedCo2 = co2 * 1.2f;
            return countedCo2;
        } else if (factor == "transportation") {
            countedCo2 = co2 * 0.9f;
            return countedCo2;
        } else if (factor == "factories") {
            countedCo2 = co2 * 1.4f;
            return countedCo2;
        } else {
            return countedCo2 = co2;
        }
    }

    public String getLowestCo2EmissionCountry(String c1, String c2, String c3, float l1, float l2, float l3) {

        String[] countries = new String[3];
        countries[0] = c1;
        countries[1] = c2;
        countries[2] = c3;
        float[] emisions = new float[3];
        emisions[0] = l1;
        emisions[1] = l2;
        emisions[2] = l3;

        int index = 0;
        float minValue = emisions[0];

        for (int i = 1; i < emisions.length; i++) {
            if (emisions[i] < minValue) {
                minValue = emisions[i];
                index = i;
            }
        }
        System.out.println("The lowest Co2 emission is in " + countries[index]);
        return countries[index];
    }

    public float getSumOfAllCountriesCo2Emission(float s1, float s2, float s3) {
        float sum = s1 + s2 + s3;
        System.out.println("The sum of Co2 emission in all countries is " + sum + " million tonnes.");
        return sum;
    }

    public float getAverageSumOfAllCountriesCo2Emission(float s1, float s2, float s3) {
        float averageSum = (s1 + s2 + s3) / 3;
        System.out.println("The average sum of Co2 emission in all countries is " + averageSum + " million tonnes.");
        return averageSum;
    }
}
