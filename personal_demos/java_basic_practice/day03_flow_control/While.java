public class While {
    public static void main(String[] args) {

        test1();
        test2();
        test3();
    }

    public static void test1() {
        int i=0;
        while(i<3){
            System.out.println("Hello World");
            i++;
        }
    }

    public static void test2() {
        /*
        假设你在银行投资了100000元，银行给出的复利是1.7%，问多少年后能实现本金翻倍？（不考虑通货膨胀）
         */
        double principal = 100000;
        double interestRate = 0.017;
        double target = principal * 2;
        int year = 0;
        while(principal < target){
            principal += principal * interestRate;
            year++;
        }
        System.out.println(year);
    }

    public static void test3() {
        /*
        世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，
        假如我有一张足够大的纸，它的厚度是0.1毫米。
        请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？
        */

        int height = 8848860;
        int count = 0;
        double v = 0.1;
        while (v<height){
            v=v*2;
            count++;
        }
        System.out.println(count);
    }

}
