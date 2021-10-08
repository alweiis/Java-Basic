package ch10;

import java.util.Calendar;

public class E10_1 {
    public static void main(String[] args) {
        // 기본적으로 현재날짜와 시간으로 설정된다.
        Calendar today = Calendar.getInstance();
        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
        
    }
}
