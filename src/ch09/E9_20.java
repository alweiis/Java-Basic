package ch09;

import static java.lang.Math.*;
import static java.lang.System.out;

public class E9_20 {
    public static void main(String[] args) {
        double val = 90.7552;
        out.println("round("+ val + ")= " + round(val));

        val *= 100;
        out.println("round("+ val + ")= " + round(val));

        out.println("round("+ val + ")/100= " + round(val)/100);
        out.println("round("+ val + ")/100.0= " + round(val)/100.0);
        out.println();

        out.println(ceil(1.1));
        out.println(floor(1.5));
        out.println(round(1.1));
        out.println(round(1.5));
        out.println(rint(1.5));
        out.println(round(-1.5));
        out.println(rint(-1.5));
        out.println(ceil(-1.5));
        out.println(floor(-1.5));
    }
}
