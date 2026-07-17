//Multiple Constructor example

class Car3 {

    // Instance variables
    String brand;
    String color;
    int year;

    // Parameterized Constructor
    Car3(String carBrand, String carColor, int carYear) {
        brand = carBrand;
        color = carColor;
        year = carYear;
    }

    // Method to display car details
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Year  : " + year);
        System.out.println("------------------------");
    }


    public static void main(String[] args) {

        // Creating Car objects
        Car3 car1 = new Car3("BMW", "Black", 2024);
        Car3 car2 = new Car3("Audi", "White", 2023);
        Car3 car3 = new Car3("Tesla", "Red", 2025);

        // Displaying details
        car1.display();
        car2.display();
        car3.display();
    }
}