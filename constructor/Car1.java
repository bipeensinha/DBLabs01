// Without Constructor
class Car1 {
    String color;
    String model;

    public static void main(String[] args) {

        Car1 c1 = new Car1();

        c1.color = "Red";
        c1.model = "BMW";

        System.out.println(c1.color);
        System.out.println(c1.model);
    }
}