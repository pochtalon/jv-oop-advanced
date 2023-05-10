package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Figure: circle; "
                + "area: " + this.getArea() + " sq.units"
                + "; radius: " + radius
                + "; colour: " + this.getColor()
                + ';';
    }

    @Override
    public double getArea() {
        return  Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("area: " + this.getArea() + " sq.units");
    }
}
