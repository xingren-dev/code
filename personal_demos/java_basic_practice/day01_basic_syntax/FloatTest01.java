/**
 * 浮点型数据：
 *  1.类型：
 *   ① float（4个字节）：单精度，可以精确到7位小数
 *   ② double（8个字节）：双精度，可以精确到15位小数
 *  2.double是常用的
 *  3.浮点型的字面量默认都会被当做double类型来处理，如果想让其当做float类型来处理的话，需要在字面量的末尾添加f或F
 */
public class FloatTest01 {
    public static void main(String[] args) {

        //不存在类型转换
        double d = 3.14;

        /*
        编译报错
        float f = 3.14;
        3.14默认是double类型，8个字节
        f变量是4个字节，大容量不能直接转换成小容量
         */

        //修改方案一（不存在类型转换）
        float f1 = 3.14f;

        //修改方案二(借助强制类型转换)
        float f2 = (float) 3.14;
    }
}
