package ch07;

public class E7_17 {
    public static void main(String[] args) {
        FireEngine2 fe = new FireEngine2();

        if (fe instanceof FireEngine2) {
            System.out.println("This is a FireEngine instance.");
        }

        if (fe instanceof Car2) {
            System.out.println("This is a Car Engine.");
        }

        if (fe instanceof Object) {
            System.out.println("This is a Object instnace.");
        }
        System.out.println(fe.getClass().getName());
    }
}

class Car2 {}
class FireEngine2 extends Car2{}