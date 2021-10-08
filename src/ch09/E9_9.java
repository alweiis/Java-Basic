package ch09;

public class E9_9 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(new Point2(1, 1), 2.0);
        Circle2 c2 = c1.shallowCopy();
        Circle2 c3 = c1.deepCopy();

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        c1.p.x = 9;
        c1.p.y = 9;

        System.out.println("= c1의 변경후 =");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}

class Point2 {
    int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Circle2 implements Cloneable {
    Point2 p;
    double r;

    public Circle2(Point2 p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle2 shallowCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle2)obj;
    }

    public Circle2 deepCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        Circle2 c = (Circle2) obj;
        c.p = new Point2(this.p.x, this.p.y);

        return c;
    }

    @Override
    public String toString() {
        return "[p = " + p + ", r=" + r + "]";
    }
}