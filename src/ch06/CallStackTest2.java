package ch06;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main method 시작");
        firstMethod();
        System.out.println("main method 끝났음");
    }

    static void firstMethod() {
        System.out.println("first method 시작");
        secondMethod();
        System.out.println("first method 끝났음");
    }

    static void secondMethod() {
        System.out.println("second method 시작");
        System.out.println("second method 끝났음");
    }
}
