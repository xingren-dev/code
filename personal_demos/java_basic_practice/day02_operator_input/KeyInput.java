import java.util.Scanner;

/**
 * 使用键盘接收用户的输入
 */
public class KeyInput {
    public static void main(String[] args) {

        // 创建一个Scanner对象，用于接收用户输入
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        /*
        程序执行到这里就会停下来，等待键盘的输入，键盘如果没有输入，程序就会一直等待
        直到用户输入一个数据并按下回车键，程序才会继续执行
         */
        int number = scanner.nextInt(); // 接收用户输入的整数
        System.out.println("你输入的整数是：" + number);

        System.out.print("请输入一个浮点数：");
        double v = scanner.nextDouble();
        System.out.println("你输入的浮点数是：" + v);

       System.out.print("请输入一个字符串：");
        //从键盘上接收一个字符串，但是接收的是第一个空格之前的内容
        String s = scanner.next();
        System.out.println("你输入的字符串是：" + s);

        scanner.nextLine(); // 消耗掉剩余的换行符

        System.out.print("请再输入一个字符串：");
        //从键盘上接收一个字符串，但是接收的是第一个换行符\n之前的内容
        String s1 = scanner.nextLine();
        System.out.println("你输入的字符串是：" + s1);

        plus();
    }

    //输入两个整数，输出它们的和
    public static void plus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        int b = scanner.nextInt();
        System.out.print("请输入第三个整数：");
        int c = scanner.nextInt();
        System.out.println("三个整数的和是：" + (a + b + c));
    }
}
