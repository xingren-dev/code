public class For {

    public static void main(String[] args) {

        System.out.println(sum(10));

        test4();

    }

    public static void test1() {
        //打印三次Hello World
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }

    }

    public static void test2() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void test4() {
        int sum = 0;
        for (int i = 1; i <= 10; i+=2) {
                sum += i;
        }
        System.out.println("sum=" + sum);
    }
}
