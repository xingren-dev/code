public class ForFor {
    public static void main(String[] args) {
        //test1();
        test2();
        //test3();
        //test4();
    }

    public static void test1() {
        //打印四行五列的*
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void test2(){
        //九九乘法表
        for (int i = 1; i <=9 ; i++) {
            //System.out.println(i);
            /*for (int j = 1; j <=9; j++) {
                System.out.println(i+"*"+j+"="+(i*j));
            }*/
/*            for (int j = 1; j <=9; j++) {
                System.out.print(i+"*"+j+"="+(i*j));
            }*/
/*            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+(i*j));
            }*/
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
    public static void test3(){
        int sum=0;
        for (int i = 2; i <=100 ; i+=2) {
            sum+=i;
        }
        System.out.println("sum="+sum);
    }

    public static void test4(){
        int sum=0;
        int i=2;
        while(i<=100){
            sum+=i;
            i+=2;
        }
        System.out.println("sum="+sum);
    }


}


