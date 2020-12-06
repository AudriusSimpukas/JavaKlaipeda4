package lt.klaipeda.antrapaskaita;

public class Method {
    public static void main(String[] args) {
        int changedNumber = changeNumber (90, 5);
        System.out.println(changedNumber);
        greetings("Jonas");

    }

    public static int changeNumber(int numberToChange, int valueToChange) {
        if (numberToChange > 100) {
            return numberToChange + valueToChange;
        } else if (numberToChange < 100) {
            return numberToChange - valueToChange;
        }
        return numberToChange;
    }
    public static void greetings(String name) {
        System.out.println("Greetings " + name);
    }

}
