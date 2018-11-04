public class Circle extends Shape {
    private int radius;

    public Circle(int r) {
        this.radius = r;

    }

    @Override
    public double getArea() {
        // TODO
        double s = Math.PI * radius * radius;
        return s; // to be replaced
    }
}