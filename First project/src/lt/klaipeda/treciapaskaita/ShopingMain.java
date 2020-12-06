package lt.klaipeda.treciapaskaita;

public class ShopingMain {
    public static void main(String[] args) {
        Item [] mondayShopingList = new Item[3];
        mondayShopingList [0] = new Item ("Coffee", 5.5, 500.0);
        mondayShopingList [1] = new Item ("Cace",1000.0);
        mondayShopingList [2] = new Item ();

        ShopingList cart = new ShopingList("Varle.lt", mondayShopingList);

        System.out.println(cart.getFinalBalance());
    }
}
