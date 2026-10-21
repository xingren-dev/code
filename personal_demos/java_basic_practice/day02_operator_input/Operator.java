/**
 * 算术运算符
 * + ：求和，字符串拼接，正数
 * - :相减，负数
 * * :乘积
 * / ：商（除以）
 * % ：取模（余数）
 * 取模公式：a % b = a - (a / b) * b
 * ++ ：让变量自身加1
 * -- ：让变量自身减1
 */

/**
 * 关系运算符
 * >
 * >=
 * <
 * <=
 * == ：等于
 * != ：不等于
 */

/**
 * 逻辑运算符
 *   & 逻辑与（并且） 左右两边都是true，结果就是true;只要有一个是false,结果就是false
 *   | 逻辑或（或者） 左右两边都是false，结果就是false;只要有一个是true,结果就是true
 *   ! 逻辑非（取反） true变成false  false变成true
 *   ^ 逻辑异或      相同为false，不同为true
 *   && 短路与（并且） 和逻辑与计算结果完全相同，没有区别，只不过&&存在短路现象，如果左边为false，则右边不再计算
 *   || 短路或（或者） 和逻辑或计算结果完全相同，没有区别，只不过||存在短路现象，如果左边为true，则右边不再计算
 *   开发中优先使用&&和||
 * 逻辑运算符的特点：
 *   1.逻辑运算符两边的操作数必须是布尔类型
 *   2.并且最终运算结果还是布尔类型
 */

/**
 * 赋值运算符
 *  基本的赋值运算符
 *     =
 *  扩展的赋值运算符
 *    +=
 *    -=
 *    *=
 *    /=
 *    %=
 *    对于扩展赋值运算符来说，中间不能有空格
 *    += 是正确的
 *    + =是错误的
 *
 *    对于扩展赋值运算符来说，永远不会改变运算结果类型，哪怕精度损失
 */

import java.util.Scanner;

/**
 * 条件运算符
 *   三元运算符
 *   语法：布尔表达式？表达式1：表达式2
 *   如果布尔表达式为true，则结果是表达式1
 *   如果布尔表达式为false，则结果是表达式2
 *   表达式1和表达式2必须是相同类型或者可以隐式转换为相同类型
 */

public class Operator {
    public static void main(String[] args) {



       /* boolean sex = true;
        System.out.println(sex ? "男" : "女");

        //使用条件运算符完成两个整数中较大数字的筛选
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int i = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int j = sc.nextInt();
        System.out.println("较大数字是：" + (i > j ? i : j));*/
/*
        //基本的赋值运算符
        int i = 10;

        //重新赋值
        i=20;
        System.out.println("i="+i);//i=20

        //+=
        int a = 100;
        a+=200;//等同于a = a + 200
        System.out.println("a="+a);//a=300

        int b = 10;
        b*=3;
        System.out.println("b="+b);//b=30

        b=10;
        b/=3;
        System.out.println("b="+b);//b=3

        b=10;
        b%=3;
        System.out.println("b="+b);//b=1

        b=10;
        b-=5;
        System.out.println("b="+b);//b=5*/

        /*int i1 = 100;
        int i2 = 90;
        System.out.println(i1 > i2 && i1 > ++i2);//true
        i2=99;
        System.out.println(i1 > i2 && i1 > ++i2);//false


        int a = 10;
        int b = +3;
        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);

        int d = 10;
        int e = -3;
        int f = d - e;
        System.out.println(d + "-(" + e + ")=" + f);

        int x = 10;
        int y = 3;
        int z = x * y;
        System.out.println(x + "*" + y + "=" + z);

        int m = 10;
        int n = 3;
        int o = m / n;
        System.out.println(m + "/" + n + "=" + o);

        int p = 10;
        int q = 3;
        int r = p % q;//r=1
        System.out.println(p + "%" + q + "=" + r);

        p = -10;
        r = p % q;//r=-1
        System.out.println(p + "%" + q + "=" + r);

        p = 10;
        q = -3;
        r = p % q;//r=1
        System.out.println(p + "%" + q + "=" + r);

        int i = 10;
        //一元运算符
        i++;
        System.out.println(i); //11

        i = 100;
        i--;
        System.out.println(i); //99
*/
    }
}
