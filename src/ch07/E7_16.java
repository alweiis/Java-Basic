package ch07;

public class E7_16 {
    public static void main(String[] args) {
//        Car car = new Car();
        Car car = new FireEngine();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car;
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrr~");
    }

    void stop() {
        System.out.println("stop!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!");
    }
}