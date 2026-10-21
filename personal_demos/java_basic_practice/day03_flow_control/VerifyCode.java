import java.util.Random;
import java.util.Scanner;

/**
 * 验证码
 * 1.输入一个数字，表示生成验证码的位数
 * 2.生成一个指定长度的验证码，验证码由数字和大小写字母组成
 * 3.输出生成的验证码
 */

public class VerifyCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入验证码的位数：");
        int length = sc.nextInt();
        System.out.println("验证码：" + generateVerifyCode(length))  ;

    }

    public static String generateVerifyCode(int length) {

        String code = "";
        Random r = new Random();

        for (int i = 0; i < length; i++) {
            int type = r.nextInt(3);
            if (type == 0) {
                int digit = r.nextInt(10);
                code += digit;
            } else if (type == 1) {
                int offset = r.nextInt(26);
                code += (char) (offset + 'A');
            } else {
                int offset = r.nextInt(26);
                code += (char) (offset + 'a');
            }

        }



        return code;
    }

}
