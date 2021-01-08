package Advanced.Interfaces.Example1;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(3);
        System.out.println("Plotas " + square.getArea());
        System.out.println("Perimetras " + square.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 2);
        System.out.println("Plotas: " + rectangle.getArea());
        System.out.println("Perimetras: " + rectangle.getPerimeter());

    }
}
