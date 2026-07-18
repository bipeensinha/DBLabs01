

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.start();   // Inherited from Vehicle
        car.drive();   // Car's own method
    }
}