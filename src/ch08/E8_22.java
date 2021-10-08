package ch08;

public class E8_22 {
    public static void main(String[] args) {
        try {
//            method1();
            method2();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
        }
    }
    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외가 처리되었습니다.");
            throw e;
        }
    }

    static void method2() throws Exception {
        try {
            System.out.println("method2()가 호출되었습니다.");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method2() 메서드에서 예외가 처리되었습니다.");
            throw e;
        } finally {
            System.out.println("method2()의 finally 블럭이 실행되었습니다.");
        }
    }
}
