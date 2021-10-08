package ch06;

public class E6_25 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("red");

        System.out.println("c1.color = " + c1.color + ", c1.gearType = " + c1.gearType + ", c1.door = " + c1.door);
        System.out.println("c2.color = " + c2.color + ", c2.gearType = " + c2.gearType + ", c2.door = " + c2.door);
    }
}

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}