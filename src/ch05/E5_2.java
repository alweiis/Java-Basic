package ch05;

public class E5_2 {
    public static void main(String[] args) {
        int[] score = new int[5];

        for (int i = 0; i < score.length; i++) {
            score[i] = i * 10;
        }

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

        int[] score2 = new int[]{11, 22, 33, 44, 55};

        // 길이가 0인 배열
        int[] chk1 = new int[0];
        int[] chk2 = new int[]{};
        int[] chk3 = {};

    }
}
