//3. You are developing a car rental system. There are different types of vehicles available for rent, such as cars, motorcycles, and bicycles. Each vehicle type has different rental calculation rules. Implement a Java program using polymorphism to calculate the rental cost for different vehicle types.
abstract class Vehicle {
    abstract double calculateRent(int days);
}

class Car extends Vehicle {
    double calculateRent(int days) {
        return days * 50;
    }
}

class Motorcycle extends Vehicle {
    double calculateRent(int days) {
        return days * 30;
    }
}

class Bicycle extends Vehicle {
    double calculateRent(int days) {
        return days * 10;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(),
            new Motorcycle(),
            new Bicycle()
        };

        for (Vehicle v : vehicles) {
            System.out.println("Rental Cost: $" + v.calculateRent(5));
        }
    }
}



