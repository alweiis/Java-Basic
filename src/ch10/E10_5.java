package ch10;

import java.util.Calendar;

public class E10_5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2020, Calendar.JANUARY, 31);
        System.out.println(toString(date));

        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 "
                + date.get(Calendar.DATE) + "일";
    }
}
