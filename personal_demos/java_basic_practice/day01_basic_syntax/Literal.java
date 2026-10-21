/**
 * 常见字面量的书写格式
 */

public class Literal {

    public static void main(String[] args) {
        printLiteral();
    }

    public static void printLiteral() {
        // 1、整型字面量
        System.out.println(1);

        // 2、浮点型字面量
        System.out.println(3.14);

        // 3、字符型字面量，用单引号包裹
        System.out.println('A');

        // 4、字符串字面量，用双引号包裹
        System.out.println("Hello");

        // 5、布尔型字面量，只有 true 和 false
        System.out.println(true);
        System.out.println(false);

        // 6、null 字面量，表示空引用
        System.out.println((String) null);

        //7.特殊字符
        // \n 换行 \t 制表符
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");
    }

}
