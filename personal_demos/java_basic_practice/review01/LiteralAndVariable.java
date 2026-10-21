/**
 *字面量：
 *  1.整型
 *  2.浮点型
 *  3.字符型
 *  4.字符串型
 *  5.布尔型
 *  6.null
 */
public class LiteralAndVariable {
    public static void main(String[] args) {
        //整型
        System.out.println(1);

        //浮点型
        System.out.println(3.14);

        //字符型
        System.out.println('a');

        //字符串型
        System.out.println("A");

        //布尔型
        System.out.println(true);

        //null
        System.out.println((String) null);

        /*
        现在我钱包里有100元，我做公交花了两元，然后又在商场买了一杯奶茶20元，我现在钱包还有多少钱？
         */
        int money = 100;

        //坐公交花了2元
        money=money-2;

        //买了一杯奶茶花了20元
        money=money-20;

        System.out.println("我现在钱包里还有"+money+"元");

    }
}
