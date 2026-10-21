
/**
 * 一旦有浮点型数据参与运算得出的结果，一定不要使用 == 与其他数字进行 相等比较
 * 主要原因是任何浮点型数据在计算机底层存储的都是它的近似值
 * 10 / 3 = 3.3333333......
 */
public class FloatTest03 {
    public static void main(String[] args) {

        double a = 6.9;

        double b = 3.0;

        double c = a / b;

        System.out.println("c="+c);//2.3000000000000003

        System.out.println(c == 2.3);//false

        System.out.println(0.1+0.2);//0.30000000000000004

    }
}
