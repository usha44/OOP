class Vehicle {
    void drive() {
        System.out.println("The vehicle is driving.");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("Car details: Brand - Toyota, Model - Corolla");
    }
    
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.display();
    }
}
