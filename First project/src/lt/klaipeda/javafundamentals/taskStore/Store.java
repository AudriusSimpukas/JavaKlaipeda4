package lt.klaipeda.javafundamentals.taskStore;

public class Store {
    private Product[] productsList;
    private Cart kortele;
    private int productCount;
    private int maxItemsInShop;

    public Store(int maxItemsInShop) {
        this.maxItemsInShop = maxItemsInShop;
        this.productsList = new Product[maxItemsInShop];
        this.kortele = new Cart();
        this.productCount = 0;
    }

    public void addProduct(String newName, float newPrice) {
        if (productCount < maxItemsInShop) {
            this.productsList[productCount] = new Product(newName, newPrice);
            productCount++;
        }
    }
    public Product[] getProductsList () {
        return productsList;
    }
}
