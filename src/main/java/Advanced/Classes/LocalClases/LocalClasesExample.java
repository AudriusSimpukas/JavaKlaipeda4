package Advanced.Classes.LocalClases;

public class LocalClasesExample {
    public static void main(String[] args) {

        System.out.println("Locql class example");

        class Pair {
            String key;
            int value;

            public Pair(String key, int value) {
                this.key = key;
                this.value = value;
            }
        }
        Pair pair = new Pair("k1", 1);
    }
    // lokali klase matoma tik lauztiniu skliaustu ribose (if, for loop, metodas).
}
