package ch06;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv;  에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음
    static int cv2 = new MemberCall().iv;

    static void staticMethod() {
        System.out.println(cv);
//        System.out.println(iv);   에러. 클래스 메서드에서는 인스턴스 변수를 사용불가.
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    // 인스턴스 메서드는 클래스 변수와 인스턴스 변수 둘 다 사용가능하다.
    void instanceMethod() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod();
//        instanceMethod();     에러. 클래스 메서드에서는 인스턴스 메서드를 호출할 수 없음.
        MemberCall c = new MemberCall();
        c.instanceMethod();
    }

    // 인스턴스 메서드는 클래스 메서드와 인스턴스 메서들 둘 다 사용가능하다.
    void instanceMethod2() {
        staticMethod();
        instanceMethod();
    }
}
