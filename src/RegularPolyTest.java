public class RegularPolyTest {
    public static void main(String[] args) {
        EquilateralTriangle eqt = new EquilateralTriangle(5);
        Square sqr = new Square(11);

        System.out.println(eqt);
        System.out.println(sqr);

        System.out.println(eqt.getNumSides());
        System.out.println(eqt.getSideLength());

        System.out.println(sqr.getNumSides());
        System.out.println(sqr.getSideLength());
    }
}
