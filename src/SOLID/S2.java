package SOLID;

interface Shape {
    double area();
}
class Circle implements Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Square implements Shape {
    private double side;
    Square(double side) {
        this.side = side;
    }
    public double area() {
        return side * side;
    }
}
class AreaCalculator {
    public double calculateArea(Shape s) {/*It means this method accepts any
       object that implements the Shape interface
       (e.g., Circle, Square, or even future shapes like Triangle) and s is a variable name*/
        return s.area();
    }
}
public class S2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);   // Circle with radius 5
        Shape square = new Square(4);   // Square with side 4
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Area of Circle: " + calculator.calculateArea(circle));
        System.out.println("Area of Square: " + calculator.calculateArea(square));
    }
}