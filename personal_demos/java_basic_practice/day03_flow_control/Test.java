import java.util.Random;

/**
 * 综合测试
 */
public class Test {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();

        //test5();

        //test6();
        //test7();

        test8();
        test9();

    }

    public static void test8() {

        int i=2, sum=0;
        while(i <= 100){
            sum += i;
            i += 2;
        }
        System.out.println("sum="+sum);

    }
    public static void test9() {
        int i=2, sum=0;
        while(i <= 100){
            i += 2;
            sum += i;
        }
        System.out.println("sum="+sum);
        System.out.println(i);

    }
    public static void test7() {
        //控制行数
        for (int i = 1; i <=4 ; i++) {

            //空格
            for (int k = 1; k <=4-i ; k++) {
                System.out.print(" ");
            }

            //控制每行的列数
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            //换行
            System.out.println();
        }
    }
    public static void test6() {
        int count=0;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            //要想生成60-100的随机数，那我先生成0-40的随机数再加上60，这样就保证了随机数在60-100之间
            int num = r.nextInt(41)+60;
            System.out.println(num);
            if(num>=80){
                count++;
            }
        }
        System.out.println(">=80的个数为"+count);
    }

    public static void test5() {
        int count=0;
        int i=1;
        while(i<=100){
            if(i%7==0){
                count++;
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
        System.out.println("1-100之间7的倍数有"+count+"个");
    }

    public static void test1() {
        int sum = 0;
        int i = 1;
        while (i <= 5) {
            i++;
            sum += i;
        }
        System.out.println("sum=" + sum);
        System.out.println("i=" + i);
    }

    public static void test2() {
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            count++;
        }
        System.out.println(count);

    }

    public static void test3() {
        int total = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 2) {
                    break;
                }
                total++;
            }
        }
        System.out.println(total);

    }

    public static void test4() {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("奇数和=" + sum);

    }

}
