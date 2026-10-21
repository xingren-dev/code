import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Test5();
    }

    public static void Test1() {
        int a = 20;
        if (a > 18) {
            System.out.println("成年了");
        }
        System.out.println("if 语句块结束");
        //注意；if语句中如果只有一行代码，大括号可以省略不写
    }

    public static void Test2() {
        /*
        钱包现在有100元，需要转出60元
        转出成功，打印"转出成功"
        余额不足，打印"余额不足"
         */
        int money = 100;
        if (money >= 60) {
            System.out.println("转出成功,剩余" + (money - 60) + "元");
        } else {
            System.out.println("余额不足");
        }

    }


    public static void Test3() {
        /*
        有一个绩效系统，每个月由主管给员工打分
        绩效级别分为5个等级，A，B，C，D，E
        A；90-100
        B；80-89
        C；70-79
        D；60-69
        E；60以下
         */
        System.out.print("请输入该员工的分数:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("等级为A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("等级为B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("等级为C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("等级为D");
        } else if (score >= 0 && score < 60) {
            System.out.println("等级为E");
        } else {
            System.out.println("输入的分数有误");
        }

    }

    public static void Test4() {

        /*
        有红，绿，黄三种信号灯
        红灯亮，停止
        绿灯亮，通行
        黄灯亮，准备
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入信号灯的颜色:");
        String color = sc.next();
        if (color.equals("红")) {
            System.out.println("红灯亮，停止");
        } else if (color.equals("绿")) {
            System.out.println("绿灯亮，通行");
        } else if (color.equals("黄")) {
            System.out.println("黄灯亮，准备");
        } else {
            System.out.println("输入的信号灯颜色有误");
        }
    }


    public static void Test5() {
        System.out.print("请输入学生的成绩:");

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("等级为A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("等级为B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("等级为C");
        } else if (score >= 0 && score <= 69) {
            System.out.println("等级为D");
        } else {
            System.out.println("输入的成绩有误");
        }
    }


}
