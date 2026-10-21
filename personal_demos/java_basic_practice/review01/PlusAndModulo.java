/**
 * + 的作用：
 * 1.求和
 * 2.字符串的拼接
 */
public class PlusAndModulo {
    public static void main(String[] args) {
        System.out.println(1 + 2);//3
        System.out.println(1 + 2 + "3");//33
        System.out.println(1 + (2 + "3"));//123

        /*
        % :取余
        a%b=a-(a/b)*b
         */
        System.out.println(10 % 3);//1
        System.out.println(-10 % 3);//-1
        System.out.println(10 % 3);//1
    }
}
