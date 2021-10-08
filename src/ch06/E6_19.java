package ch06;

public class E6_19 {
    public static void main(String[] args) {
        // 클래스 메서드 호출. 인스턴스 생성없이 호출가능
        System.out.println(MyMath.add(200L, 100L));
        System.out.println(MyMath.subtract(200L, 100L));
        System.out.println(MyMath.multiply(200L, 100L));
        System.out.println(MyMath.divide(200L, 100L));

        // 인스턴스를 생성
        MyMath mm = new MyMath();
        mm.a = 200L;
        mm.b = 100L;
        // 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}

class MyMath {
    long a, b;

    long add() { return a + b; }
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide() { return a/ b; }

    static long add(long a, long b) { return a + b; }
    static long subtract(long a, long b) { return a - b; }
    static long multiply(long a, long b) { return a * b; }
    static double divide(double a, double b) { return a / b; }
}
