package ch06;

public class E6_27 {
    // 클래스 초기화 블럭
    static {
        System.out.println("static { }");
    }
    // 인스턴스 초기화 블럭
    {
        System.out.println("{ }");
    }
    public E6_27() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("E6_27 e = new E6_27(); ");
        E6_27 e = new E6_27();

        System.out.println("E6_27 e2 = new E6_27(); ");
        E6_27 e2 = new E6_27();
    }
}
