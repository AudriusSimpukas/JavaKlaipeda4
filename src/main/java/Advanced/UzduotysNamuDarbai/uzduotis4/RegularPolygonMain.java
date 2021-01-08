package Advanced.UzduotysNamuDarbai.uzduotis4;

public class RegularPolygonMain {
    public static void main(String[] args) {

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(3);

        System.out.println("Lygiakrascio trikampio perimetras ir plotas:");
        System.out.println(equilateralTriangle.getPerimeter());
        System.out.println(equilateralTriangle.getArea());

        Square square = new Square(5);

        System.out.println("Kvadrato perimetras ir plotas:");
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
    }
}
