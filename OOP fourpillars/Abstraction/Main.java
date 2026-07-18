// Abstraction means showing only the essential features and hiding the complex implementation.
//When you drive a car, you simply:

//Press the Start button.

//You don't need to know:

//How fuel is injected.
//How the battery powers the starter motor.
//How the engine begins running.

//You only know "Press Start to start the car."

//That's abstraction.

// Abstract Class
abstract class Vehicle {

    abstract void start();
}
//The parent class defines the "what"; the child class can define the "how"

// Child Class
class Car extends Vehicle {

    @Override  //@Override tells the Java compiler that this method is intended to replace (override) a method from the parent class or interface. 
               //It is called an annotation.
    void start() {
        System.out.println("Car Started");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();

        car.start();
    }
}