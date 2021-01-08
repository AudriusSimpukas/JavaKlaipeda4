package Advanced.Enumerators;

public class EnumExampleMain {
    public static void main(String[] args) {

        String coffee = "latte";
        Coffee coffeeEnum = Coffee.valueOf(coffee.toUpperCase());

        System.out.println(coffeeEnum);
        System.out.println(Coffee.AMERICANO.toString());

        System.out.println(AutoMakers.VOLVO.getEngineSize());
        System.out.println(AutoMakers.AUDI.getCarName());

    }
}
