import java.util.Scanner;

/**
 *找素数
 * 1.输入两个正整数m,n，输出m到n之间的所有素数。
 * 2.素数：只能被1和它本身整除的数。
 */

public class FindPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("请输入一个正整数:");
        int m = sc.nextInt();

        System.out.print("请输入另外一个正整数:");
        int n=sc.nextInt();

        for (int i = m; i <=n ; i++) {
           if(i<2){
               continue;
           }
            boolean isPrime = true;
           for (int j = 2; j <= i/2; j++) {
               if (i % j == 0) {
                   isPrime = false;
                   break;
               }
           }
           if (isPrime) {
               System.out.print(i + " ");
           }
        }

    }

}
