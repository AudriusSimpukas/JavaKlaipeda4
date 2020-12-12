package Advanced.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {
    public static void main(String[] args) {
        List<String> visitedCountries = new ArrayList<>();

        visitedCountries.add("Germany");
        visitedCountries.add("Spain");
        visitedCountries.add("France");
        visitedCountries.add("Germany");

        visitedCountries.remove("Spain");

        System.out.println("List");
        for (String country: visitedCountries) {
            System.out.println(country);
        }

        System.out.println("Set");
        Set<String> uniqueVisitedCountries = new HashSet<>(visitedCountries);
        for (String country: uniqueVisitedCountries) {
            System.out.println(country);
        }
    }
}
