package Advanced.UzduotysNamuDarbai.uzduotis2;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Staciakampis", 5, 3);
        RightAngleRectangle rightAngleRectangle = new RightAngleRectangle(
                "Status trikampis", 4, 2);
        Circle circle = new Circle("Apskritimas", 3);

        System.out.println(circle.countCirclePerimeter());
        System.out.println(circle.countCircleArea());

        System.out.println(rightAngleRectangle.countRightAngleRectangleArea());
        System.out.println(rectangle.countRightAngleRectangleArea());

        System.out.println(rectangle.countRectangleArea(
                rightAngleRectangle.getHeight(), rightAngleRectangle.getWidth())
        );

    }
}
