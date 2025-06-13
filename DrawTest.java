abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;
    Cube(double side) { this.side = side; }

    double calculateVolume() { return side * side * side; }
    double calculateArea() { return 6 * side * side; }
    double calculatePerimeter() { return 12 * side; }
}

class Cuboid extends Draw {
    double length, width, height;
    Cuboid(double l, double w, double h) {
        length = l; width = w; height = h;
    }

    double calculateVolume() { return length * width * height; }
    double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }
    double calculatePerimeter() { return 4 * (length + width + height); }
}

class Cylinder extends Draw {
    double radius, height;
    Cylinder(double r, double h) {
        radius = r; height = h;
    }

    double calculateVolume() { return Math.PI * radius * radius * height; }
    double calculateArea() { return 2 * Math.PI * radius * (radius + height); }
    double calculatePerimeter() { return 4 * Math.PI * radius; }
}

public class DrawTest {
    public static void main(String[] args) {
        Draw cube = new Cube(5);
        Draw cuboid = new Cuboid(4, 5, 6);
        Draw cylinder = new Cylinder(3, 7);

        System.out.println("Cube: Volume=" + cube.calculateVolume() + ", Area=" + cube.calculateArea() + ", Perimeter=" + cube.calculatePerimeter());
        System.out.println("Cuboid: Volume=" + cuboid.calculateVolume() + ", Area=" + cuboid.calculateArea() + ", Perimeter=" + cuboid.calculatePerimeter());
        System.out.println("Cylinder: Volume=" + cylinder.calculateVolume() + ", Area=" + cylinder.calculateArea() + ", Perimeter=" + cylinder.calculatePerimeter());
    }
}
