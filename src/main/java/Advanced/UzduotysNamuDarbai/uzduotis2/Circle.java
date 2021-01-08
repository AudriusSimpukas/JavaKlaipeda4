package Advanced.UzduotysNamuDarbai.uzduotis2;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeDescription, double radius) {
        super(shapeDescription);
        this.radius = radius;
    }
    public double countCirclePerimeter () {
        return Math.PI * radius * 2;
    }
    public double countCircleArea () {
        return Math.PI * Math.pow(radius, 2);
    }
}
