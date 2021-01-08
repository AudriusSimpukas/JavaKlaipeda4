package Advanced.UzduotysNamuDarbai.uzduotis4;

public class Square implements RegularPolygon {
    @Override
    public int getNumSides() {
        return 4;
    }

    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getSideLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return getNumSides() * getSideLength();
    }

    @Override
    public double getInteriorAngleSum() {
        return (getNumSides() - 2) * 180;
    }

    @Override
    public double getArea() {
        return Math.pow(getNumSides(), 2);
    }
}
