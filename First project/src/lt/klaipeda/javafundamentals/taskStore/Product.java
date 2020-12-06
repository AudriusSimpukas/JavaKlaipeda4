package lt.klaipeda.javafundamentals.taskStore;

public class Product {
    String productName;
    float price;

    public Product(String productName, float price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }

    public String toString() {
        return productName + " - " + price + " Eur";
    }
}
