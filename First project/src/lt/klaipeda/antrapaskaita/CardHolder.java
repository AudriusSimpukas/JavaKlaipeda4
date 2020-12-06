package lt.klaipeda.antrapaskaita;

public class CardHolder {

    private int[] numberOfCards = new int[3];
    private int capasity = numberOfCards.length;

    public CardHolder() {
        System.out.println("Card holder space: " + capasity);
    }


}
