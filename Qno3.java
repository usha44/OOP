class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 5;

    int area() {
        return length * width;
    }
}

class Square extends Rectangle {
    int side = 6;

    int areaSquare() {
        return side * side;
    }

    public static void main(String[] args) {
        Square sq = new Square();
        sq.display();
        System.out.println("Area of Rectangle: " + sq.area());
        System.out.println("Area of Square: " + sq.areaSquare());
    }
}
