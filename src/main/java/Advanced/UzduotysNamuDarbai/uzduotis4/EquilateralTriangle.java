package Advanced.UzduotysNamuDarbai.uzduotis4;

public class EquilateralTriangle implements RegularPolygon {

    @Override
    public int getNumSides() {
        return 3;
    }

    private double length;

    public EquilateralTriangle(double length) {
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
        return (Math.pow(getSideLength(), 2) * Math.sqrt(getNumSides())) / 4;
    }
}
