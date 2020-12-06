package lt.klaipeda.javafundamentals.taskStore;

public class Main {
    public static void main(String[] args) {

        Store parduotuve = new Store(2);
        parduotuve.addProduct("Pienas", 1.8f);
        Product[] productsList = parduotuve.getProductsList();
        System.out.println(productsList[0]);
        parduotuve.addProduct("Duona", 2.80f);
        System.out.println(productsList[1]);



    }
}
