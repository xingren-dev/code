public class Variable {
    /**
     * 认识变量
     */


    /**
     * 八种数据类型的默认值
     *    数据类型   默认值
     *    byte       0
     *    short      0
     *    int        0
     *    long       0L
     *    float      0.0f
     *    double     0.0
     *    char       \u0000
     *    boolean    false
     *
     *  所有的引用数据类型默认值都是null
     *
     *  语法规则：在java中，如果成员变量没有手动赋值，那系统会赋默认值
     */

    public static void printVariable() {
        //定义变量：数据类型 变量名 = 值;
        int a = 10;
        System.out.println(a);

        //定义一个小数变量，存储学生的成绩
        double score = 95.5;
        System.out.println(score);

        //为什么要用变量记数据呢？ 可以提高数据处理的灵活性和维护性


        //变量里的数据是可以被替换的
        int age = 18;//赋值（从右边往左边看）
        System.out.println(age);
        age = age + 1;//赋值（从右边往左边看）
        System.out.println(age);


        //微信钱包有100元，买衣服花了68元，又收到了50元
        int wallet = 100;
        System.out.println(wallet);

        //买衣服花了68元
        wallet = wallet - 68;
        System.out.println(wallet);

        //又收到了50元
        wallet = wallet + 50;
        System.out.println(wallet);


        //程序中可以直接写进制数据
        int i1 = 0b01100001;//二进制，0b或0B开头
        System.out.println(i1);//97

        int i2 = 0141;//八进制，0开头
        System.out.println(i2);//97

        int i3 = 0xFA;//十六进制，0x或0X开头
        System.out.println(i3);//250

    }

    //8种数据类型
    public static void printDataType() {

        byte b = 127;
        System.out.println(b);

        short s = 32767;
        System.out.println(s);

        int i = 2147483647;
        System.out.println(i);

        long l = 9223372036854775807L;
        System.out.println(l);

        float f = 3.14f;
        System.out.println(f);

        double d = 3.141592653589793;
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        boolean flag = true;
        System.out.println(flag);

    }


}
