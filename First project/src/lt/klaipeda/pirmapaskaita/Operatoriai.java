package lt.klaipeda.pirmapaskaita;

public class Operatoriai {
    public static void main (String[] args) {
        int x = 1;
        x = x + 2;
        x += 2; // x = x + 2;
        System.out.println(x);   //result 5;
        x -= 4;
        System.out.println(x);   //result 1;
        x *= 4;
        x /= 2;
        System.out.println(x);   //result 2;

        x = 15;
        x = x % 7;
        System.out.println(x);

        x = 20;
        x++; // tas patskas x = x + 1;
        ++x;
        x--;
        --x;

        x = 5;
        System.out.println("x++ lygu: " + x++);
        System.out.println("po atspausdinimo x lygu: " + x);

        x = 5;
        System.out.println("++x lygu: " + ++x);
        System.out.println("po atspausdinimo x lygu: " + x);

        int y;
        y = 10;
        x = 9;
        System.out.println("ar y lygu x? " + (y==x));
        System.out.println("ar y nelygu x? " + (y!=x)); // javoj sauktukas ! reiskia ne;

        System.out.println("ar y daugiau x? " + (y > x)); // arba >=;
        System.out.println("ar y maziau x? " + (y < x));  // arba <=;

        boolean value1 = true;
        boolean value2 = false;
        System.out.println(value1 && value2);  // && - IR
        System.out.println(value1 || value2);  // || - ARBA
        System.out.println(!value1);           // ! - NE
    }
}
