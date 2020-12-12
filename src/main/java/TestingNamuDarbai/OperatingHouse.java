package TestingNamuDarbai;

public class OperatingHouse {

    public int getNewestHouse(int h1, int h2, int h3) {
        int newestYear = Math.max(h1, Math.max(h2, h3));
        System.out.println("The newest house is built in " + newestYear);
        return newestYear;
    }

    public int countFittedHouses(String  c1, String c2, String c3) {
        int counter = 0;
        String[] houseConditions = new String[3];
        houseConditions[0] = c1;
        houseConditions[1] = c2;
        houseConditions[2] = c3;

        for (String condition : houseConditions) {
            if (condition == "fitted") {
                counter++;
            }
        }
        System.out.println("There is/are " + counter + " house/es, with 'fitted' condition.");
        return counter;
    }

    public int getSmallestHouse(int s1, int s2, int s3) {
        int smallestHouse = Math.min(s1, Math.min(s2, s3));
        System.out.println("The smallest house is " + smallestHouse + " squere meters.");
        return smallestHouse;
    }
}