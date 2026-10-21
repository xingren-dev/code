import java.util.Scanner;

/**
 * 计算器功能
 *   1.键盘输入两个整数、一个运算符（+ - * /）
 *   2.根据运算符进行相应的计算，并输出结果
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.提示用户输入两个整数和一个运算符
        System.out.print("请输入第一个整数：");
        int a = sc.nextInt();

        System.out.print("请输入第二个整数：");
        int b = sc.nextInt();

        System.out.print("请输入一个运算符：");
        String operator = sc.next();

        calculate(a, b, operator);



    }

    public static void calculate(int a, int b, String operator) {
        int result=0;
        switch(operator){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":

                //要判断除数是否为0
                if(b==0){
                    System.out.println("除数不能为0");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("输入的运算符有误");
                return;
        }
        System.out.println(a + " " + operator + " " + b + " = " + result);


    }

}
