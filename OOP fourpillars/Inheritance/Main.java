// Parent Class
class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }
}

// Child Class
class Car extends Vehicle {

    void drive() {
        System.out.println("Car is Driving");
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.start();   // Inherited from Vehicle
        car.drive();   // Car's own method
    }
}