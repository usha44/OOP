
//1. You are developing a shape drawing application. There are different types of shapes such as circles, rectangles, and triangles. Each shape has its own area calculation method. Implement a Java program using polymorphism to calculate and display the area of different shapes.
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }

    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 7)
        };

        for (Shape s : shapes) {
            System.out.println("Area: " + s.calculateArea());
        }
    }
}
