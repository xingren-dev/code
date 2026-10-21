import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //test2();
        //test3();
        // test4();
        //test5();
        //test6();
        test7();
    }
    public static void test7() {
        int[] ints = new int[3];
        System.out.println(ints[0]);

        double[] doubles = new double[3];
        System.out.println(doubles[0]);

        boolean[] booleans = new boolean[3];
        System.out.println(booleans[0]);

        String[] strings = new String[3];
        System.out.println(strings[0]);
    }

    public static void test6() {
        //二维数组存3学生4门课并求和
        double[][] score = new double[3][4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print("请输入第" + (i + 1) + "个学生第" + (j + 1) + "门课的成绩：");
                score[i][j] = sc.nextDouble();
            }
            System.out.println();

        }
        double sum =0;
        for (int i = 0; i < score.length; i++) {
            for (int j= 0; j <score[i].length ; j++) {
                sum+=score[i][j];
            }
        }
        System.out.println(sum);

    }

    public static void test5() {

        int[][] arr = new int[5][5];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("=========");

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int row = r.nextInt(arr.length);
                int col = r.nextInt(arr[i].length);
                int temp = arr[i][j];
                arr[i][j] = arr[row][col];
                arr[row][col] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void test4() {
        /*
        二维数组静态初始化
        数据类型[][] 数组名 = { {元素1,元素2,……},{元素1,元素2,……} ,…… };

         */
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        //二维数组的遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        /*
        二维数组动态初始化
        数据类型[][] 数组名 = new 数据类型[行数][列数];
         */
        //int[][] arr = new int[3][4];


    }

    public static void test3() {

        String[] poker = new String[54];

        //四种花色
        String[] colors = {"♠", "♥", "♣", "♦"};
        //13个点数
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //图标大小王
        String[] special = {"大王", "小王"};

        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                poker[index++] = colors[j] + numbers[i];
            }
        }

        System.out.println(poker[4]);
        for (int i = 0; i < special.length; i++) {
            poker[index++] = special[i];
        }

        for (String s : poker) {
            System.out.print(s + "\t");
        }

        //洗牌
        Random r = new Random();
        for (int i = 0; i < poker.length; i++) {
            int randomIndex = r.nextInt(poker.length);
            String temp = poker[i];
            poker[i] = poker[randomIndex];
            poker[randomIndex] = temp;
        }
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
            if (i % 5 == 4) {
                System.out.println();
            }
        }


    }

    public static void test2() {

        Scanner sc = new Scanner(System.in);


        /*
        动态初始化数组：在声明数组的同时指定数组的长度，数组元素的值默认为0
        数据类型[] 数组名 = new 数据类型[数组长度];
         */
        double[] scores = new double[8];
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生成绩：");
            double score = sc.nextDouble();
            scores[i] = score;
        }


        double max = scores[0];
        double min = scores[0];
        for (int i = 0; i < scores.length; i++) {

            double score = scores[i];

            sum += score;

            if (score > max) {
                max = score;
            }

            if (score < min) {
                min = score;
            }
        }
        System.out.println("平均分是" + sum / scores.length + "，最高分是" + max + "，最低分是" + min);


    }

    public static void test1() {
        /*
        静态初始化数组：在声明数组的同时给数组元素赋值
        数据类型[] 数组名 = { 元素1，元素2 ，元素3，… };
         */
        int[] arr = {12, 24, 36};
        //数据名[索引]
        System.out.println(arr[0]);//12
        System.out.println(arr[1]);//24
        arr[0] = 100;
        System.out.println(arr[0]);//100
        //获取数组的长度：数组名.length
        System.out.println(arr.length);//3
    }


}
