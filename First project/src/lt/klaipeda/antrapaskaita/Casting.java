package lt.klaipeda.antrapaskaita;

public class Casting {
    public static void main(String[] args) {
        byte b = 1;
        short s = 10;
        int i = 129;
        float f = 3549F;
        long l = 1852L;
        double d = 85.2;

        boolean bool = false;
        char c = 8;

        short byteToShort = b;
        byte shortToByte = (byte) s;
        byte intToByte = (byte) i;
        int sum = b + b;
        double newSum = sum + f;
        c = (char) newSum;
        int charToInt = c;

        i = (int) d;
        System.out.println(i);
        System.out.println(c);


    }
}
