package ch05;

public class E5_10 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        // 배열의 각 요소에 1~45의 값을 저장한다.
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int temp = 0;   // 두 값을 바꾸는데 사용할 임시변수
        int j = 0;      // 임의의 값을 얻어서 저장할 변수

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        // 배열 ball의 앞에서부터 6개의 요소를 출력한다.
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }

    }
}
