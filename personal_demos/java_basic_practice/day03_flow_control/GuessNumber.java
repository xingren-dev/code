import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 * 1.随机生成一个1-100之间的整数
 * 2.提示用户输入一个1-100之间的整数
 * 3.判断用户输入的数字与随机生成的数字的大小关系，并给出相应的提示
 * 4.如果用户输入的数字与随机生成的数字相等，则提示用户“恭喜你，猜对了！”
 * 5.如果用户输入的数字比随机生成的数字大，则提示用户“你猜的数字太大了！”
 * 6.如果用户输入的数字比随机生成的数字小，则提示用户“你猜的数字太小了！”
 * 7.如果猜中了之后，用户还想继续猜，则提示用户“是否继续猜？(y/n)”。如果用户输入y，则继续猜；如果用户输入n，则结束程序。
 */

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个1-100之间的整数：");

        Random r = new Random();
        int num = r.nextInt(100) + 1;



        while (true) {
            int input = sc.nextInt();

            // 判断输入的数字是否在1-100之间
            if(input < 1 || input > 100) {
                System.out.print("输入有误，请重新输入:");

            }else{
                if (input == num) {
                    System.out.println("恭喜你，猜对了！");
                    System.out.println("是否继续猜？(y/n)");

                    while (true) {
                        String choice = sc.next();

                        if (choice.equals("y")) {
                            num = r.nextInt(100) + 1;
                            System.out.print("请输入一个1-100之间的整数：");
                            break;

                        } else if (choice.equals("n")) {
                            return;

                        } else {
                            System.out.print("输入有误，请重新输入:");

                        }
                    }

                } else if (input > num) {
                    System.out.println("你猜的数字太大了！");
                    System.out.print("请继续输入:");

                } else {
                    System.out.println("你猜的数字太小了！");
                    System.out.print("请继续输入:");

                }
            }

        }

    }
}
