public class Break_Continue {
    public static void main(String[] args) {

        //test1();
        test2();
        test3();
    }

    public static void test1() {

        for (int i = 0; i < 10; i++) {
            if (i==5){
                break;
            }
            System.out.println(i);//0 1 2 3 4
        }

        System.out.println("------------");

        for (int i = 0; i < 10; i++) {
            if (i==5){
                continue;
            }
            System.out.println(i);//0 1 2 3 4 6 7 8 9
        }
    }

    public static void test2(){
        int sum = 0;
        int i = 2;
        while(i <= 100){
            sum += i;
            i += 2;
        }
        System.out.println("sum=" + sum);

    }

    public static void test3(){
        int sum = 0;
        int i = 2;
        while(i <= 100){

            i += 2;
            sum += i;
        }
        System.out.println("sum=" + sum);
        System.out.println("i=" + i);

    }
}
