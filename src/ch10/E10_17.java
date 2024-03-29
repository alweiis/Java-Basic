package ch10;

import java.text.ChoiceFormat;

public class E10_17 {
    public static void main(String[] args) {
        String patten = "60#D|70#C|80<B|90#A";

        int[] scores = {91, 90, 80, 88, 70, 52, 60};

        ChoiceFormat form = new ChoiceFormat(patten);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + ":" + form.format(scores[i]));
        }
    }
}
