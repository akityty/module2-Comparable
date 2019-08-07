public class Rectangle extends Shape {
    private double width = 1;
    private double height =1;
    public Rectangle(){

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return (this.width+this.height)*2;
    }

    @Override
    double getArea() {
        return this.height*this.width;
    }

}
