/**
 * public 表示公开的
 * class 表示定义一个类
 * HelloWorld 是这个类起个名
 */
public class HelloWorld {

    //类体
    /*
     * 编译报错，类体中不能直接编写这样的Java语句
     * System.out.println("HelloWorld");
     */

    /*
    1.这是main方法，也叫做主方法
    2.main方法是JVM规定的，固定写法，程序就是从这个位置进来执行的，这是程序的入口
    3.对于main方法来说能修改的就是args这个变量名
    4.public 表示公开的
    5.static 表示静态的
    6.void 表示main方法执行结束后不返回任何数据
     */
    public static void main(String[] args) {

        //方法体
        /*
        方法体中是由一行一行java语句组成
        任何一行java语句必须以“;”结尾
        方法体当中的代码是有执行顺序的，遵循自上而下的顺序依次逐行执行
         */

        //这行代码的作用是将"HelloWorld"打印输出到控制台，并且输出之后还会换行
        //没有ln是不换行的，有ln是换行的
        System.out.println("HelloWorld");
    }
}






























