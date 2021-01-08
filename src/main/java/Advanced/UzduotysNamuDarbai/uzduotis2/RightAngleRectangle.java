package Advanced.UzduotysNamuDarbai.uzduotis2;

public class RightAngleRectangle extends Shape {

    private double width;
    private double height;

    public RightAngleRectangle(String shapeDescription, double width, double height) {
        super(shapeDescription);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double countRightAngleRectangleArea () {
        return width * height / 2;
    }
}
