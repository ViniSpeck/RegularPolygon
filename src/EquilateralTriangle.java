public class EquilateralTriangle {
    private int sideLength;

    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public int getNumSides() {
        return 3;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "sideLength=" + sideLength +
                '}';
    }
}
