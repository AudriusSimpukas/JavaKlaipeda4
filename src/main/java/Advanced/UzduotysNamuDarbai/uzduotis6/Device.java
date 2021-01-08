package Advanced.UzduotysNamuDarbai.uzduotis6;

public class Device<V> {

    private V name;
    private V price;
    private V quantity;
    private V description;

    public Device(V name, V price, V quantity, V description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
}
