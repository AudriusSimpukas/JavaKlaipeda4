package lt.klaipeda.antrapaskaita;

public class Card {

    private String name;
    private String surname;
    private Boolean employment;
    private double amount;


    public Card(String name, String surname, Boolean employment, double amount) {
        this.name = name;
        this.surname = surname;
        this.employment = employment;
        this.amount = amount;
    }

    public String getSurname() {
        return this.surname;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void addToBalance(double addBalance) {
        amount = addBalance + amount;
        System.out.println(amount);
    }

    public void withdrawFromBalance(double withdrawBalance) {
        amount = amount - withdrawBalance;
        if (amount >= 0) {
            System.out.println(amount);
        } else {
            System.out.println("Not enough money.");
        }
    }
}
