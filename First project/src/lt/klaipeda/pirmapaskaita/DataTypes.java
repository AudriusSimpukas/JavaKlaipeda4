package lt.klaipeda.pirmapaskaita;

public class DataTypes {
    public static void main(String[] args) {
        byte baitTipas = 2;
        System.out.println("Byte: " + baitTipas);
        short shortTipas;
        shortTipas = 2;
        System.out.println("Short: " + shortTipas);
        int integerTipas = 10000;
        System.out.println("Int: " + integerTipas);
        long longTipas = 1865822L;
        System.out.println("Long: " + longTipas);
        float floatTipas = 1.0F;
        double doubleTipas = 2.00005D;

        boolean isGeras;
        isGeras = true;
        System.out.println("Ar geras? " + isGeras);
        isGeras = false;
        System.out.println("Ar tikrai geras? " + isGeras);

        char simbolis = 'a';
        System.out.println(simbolis);
        //System.out.println('aa'); galimas tik vienas simbolis.
        // saugo tik teigiama ir iki dviejubaitudydzio skaiciu.
        char tabs = '\t';
        System.out.println("Labas" + tabs + "labas");




    }
}
