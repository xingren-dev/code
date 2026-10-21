/**
 * 浮点型数据的两种表示方式：
 *  1. 十进制表示方式
 *     double x = 1.23;
 *     double y=0.23;
 *     double z=.23;
 *  2. 科学计数法表示方式
 *     double a = 0.123E2;//表示0.123*10^2
 *     double b = 123.34E-2//表示123.34*10^-2
 *
 */
public class FloatTest02 {
    public static void main(String[] args) {

        double x = 1.23;
        double y = 0.23;
        double z = .23;

        System.out.println(x);//1.23
        System.out.println(y);//0.23
        System.out.println(z);//0.23

        double a = 0.123E2;
        double b = 123.34E-2;
        System.out.println(a);//12.3
        System.out.println(b);//1.2334
    }
}
