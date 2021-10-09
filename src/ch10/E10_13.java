package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E10_13 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.OCTOBER, 9);

        Date day = cal.getTime();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        System.out.println(sdf1.format(day));
        System.out.println(sdf2.format(day));
        System.out.println(sdf3.format(day));
        System.out.println(sdf4.format(day));
    }
}