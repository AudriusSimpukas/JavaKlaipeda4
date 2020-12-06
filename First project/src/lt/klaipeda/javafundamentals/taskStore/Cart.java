package lt.klaipeda.javafundamentals.taskStore;

public class Cart {
    float sum = 0.0f;

    public void addProduct (Product produktas) {
        sum += produktas.getPrice();
    }
    public float getTotalSum () {
        return sum;
    }
}
