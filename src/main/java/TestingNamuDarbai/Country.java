package TestingNamuDarbai;

public class Country {

    private String name;
    private float co2Emission;
    private String pollutionFactor;

    public Country(String name, float co2Emission, String pollutionFactor) {
        this.name = name;
        this.co2Emission = co2Emission;
        this.pollutionFactor = pollutionFactor;
    }

    public String getName() {
        return name;
    }

    public float getCo2Emission() {
        return co2Emission;
     }

     public String getPollutionFactor() {
        return pollutionFactor;
     }

     public float setCorrectCo2Emission(float newCo2) {
        return this.co2Emission = newCo2;
     }
}
