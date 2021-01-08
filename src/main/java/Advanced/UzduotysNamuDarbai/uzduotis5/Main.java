package Advanced.UzduotysNamuDarbai.uzduotis5;

import java.util.ArrayList;
import java.util.List;

import static Advanced.UzduotysNamuDarbai.uzduotis5.ItemList.getLastItem;

public class Main {
    public static void main(String[] args) {

        TwoItems<String> saldumynai = new TwoItems<>("Tortas", "Mandarinai");
        TwoItems<Integer> skaiciai = new TwoItems<Integer>(2, 3);

//        System.out.println(saldumynai.getEntry1());
//        System.out.println(saldumynai.toString());
//
//        System.out.println(skaiciai.getEntry2());
//        System.out.println(skaiciai.toString());

        List<String> vaisiai = new ArrayList<>();
        vaisiai.add("Obuolys");
        vaisiai.add("Kriause");
        vaisiai.add("Slyva");
        vaisiai.add("Braske");
        vaisiai.add("Vysnia");

        getLastItem(vaisiai);

        List<Integer> kilogramai = new ArrayList<>();
        kilogramai.add(5);
        kilogramai.add(2);
        kilogramai.add(4);
        kilogramai.add(7);
        kilogramai.add(12);

        kilogramai.remove(4);

        getLastItem(kilogramai);

    }
}
