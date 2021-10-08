package ch06;

public class E6_15 {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }
//    static int factorial(int n) {
//        // factorial의 결과값을 저장할 변수
//        int result = 0;
//
//        if (n == 1)
//            result = 1;
//        else
//            result = n * factorial(n - 1);
//        return result;
//    }
    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
