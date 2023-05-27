package JavaOOPS1;

public interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }
class Circle implements Shape {
    private double radius;
    public Circle(double radius){
        this.radius= radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*3.14159*radius;
    }
}
class Square implements Shape {
    private double side;
    public Square (double side){
        this.side= side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}

