// 5. You are building a shape manipulation application. There are different types of shapes, such as circles, squares, and triangles. Each shape has its own resizing and rotation methods. Implement a Java program using polymorphism to manipulate and transform different shapes.
abstract class Shape {
    abstract void resize();
    abstract void rotate();
}

class Circle extends Shape {
    void resize() {
        System.out.println("Resizing circle...");
    }

    void rotate() {
        System.out.println("Rotating circle...");
    }
}

class Square extends Shape {
    void resize() {
        System.out.println("Resizing square...");
    }

    void rotate() {
        System.out.println("Rotating square...");
    }
}

class Triangle extends Shape {
    void resize() {
        System.out.println("Resizing triangle...");
    }

    void rotate() {
        System.out.println("Rotating triangle...");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square(), new Triangle() };

        for (Shape s : shapes) {
            s.resize();
            s.rotate();
        }
    }
}

