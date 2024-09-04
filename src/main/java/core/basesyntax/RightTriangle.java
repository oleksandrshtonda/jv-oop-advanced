package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);

        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: " + getArea() + " sq. units, first leg: "
                        + firstLeg + " units, second leg: " + secondLeg + " units, color: " + color
        );
    }
}
