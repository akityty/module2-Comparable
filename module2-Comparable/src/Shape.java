abstract class Shape {
    public Shape() {
    }
    abstract  double getPerimeter();
    abstract double getArea();
    @Override
    public String toString() {
        return "Shape";
    }
}
