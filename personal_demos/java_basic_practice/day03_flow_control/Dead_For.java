public class Dead_For {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        for (; ; ) {
            System.out.println("Hello World");
        }


    }

    public static void test2() {
        while (true) {
            System.out.println("Hello World");
        }
    }

    public static void test3() {
        do {
            System.out.println("Hello World");
        } while (true);
    }

}
