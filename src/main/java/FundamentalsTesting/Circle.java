package FundamentalsTesting;

public class Circle {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double circleLength() {
        return Math.PI * 2 * radius;
    }

    public double circleArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
