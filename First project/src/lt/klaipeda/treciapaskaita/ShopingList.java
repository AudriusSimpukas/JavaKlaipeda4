package lt.klaipeda.treciapaskaita;

public class ShopingList {
    private String shopName;
    private Item [] items;
    private double finalBalance;

    public ShopingList (String shopName, Item[] items) {
        this.shopName = shopName;
        this.items = items;
        this.finalBalance = 0;

        for (int i =0; i < items.length; i++) {
            finalBalance += items[i].getPrice();
        }
    }
    public double getFinalBalance() {
          return finalBalance;
    }

}
