class Shapes {
    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    
    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    double radius = 7;

  
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circ = new Circle();

        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());

        System.out.println("Circle Area: " + circ.calculateArea());
        System.out.println("Circle Circumference: " + circ.calculateCircumference());
    }
}
