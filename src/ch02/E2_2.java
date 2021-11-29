package ch02;

public class E2_2 {
    public static void main(String[] args) {
        int x = 100, y = 200;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:" + x + " y:" + y);
    }
}
