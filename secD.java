// 1. Create a Java program that demonstrates inheritance:
// ● Define a superclass Vehicle with attributes brand and a method start().
// ● Create a subclass Car that adds a model name and overrides the start() method.
// ● Use the super keyword appropriately.
// ● Demonstrate the working in the main method.

class Vehicle {
    String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Vehicle is starting.");
    }
}
class Car extends Vehicle {
    String model;

    public Car(String brand, String model) {
        super(brand);  
        this.model = model;
    }

    @Override
    public void start() {
        super.start();  
        System.out.println(brand + " " + model + " is starting with a roar!");
    }
}

public class secD {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic Brand");
        v.start();

        System.out.println();

        Car c = new Car("Toyota", "Corolla");
        c.start();
    }
}