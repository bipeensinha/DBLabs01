// With default Constructor
class Car2 {
    String color;
    String model;

     Car2() {
        color = "Red";
        model = "BMW";
    }

    public static void main(String[] args) {

        Car2 c1 = new Car2();

        System.out.println(c1.color);
        System.out.println(c1.model);
    }
}
