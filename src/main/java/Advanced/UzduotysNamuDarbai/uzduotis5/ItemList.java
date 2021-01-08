package Advanced.UzduotysNamuDarbai.uzduotis5;

import java.util.List;

public class ItemList {

    public static <T> void getLastItem(List<T> a) {
        System.out.println(a.get(a.size() - 1));
    }
}
