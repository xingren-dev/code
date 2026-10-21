import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        String[] poker = new String[54];

        //四种花色
        String[] colors = {"♠", "♥", "♣", "♦"};

        //13种牌
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //大小王
        String[] kings = {"小王", "大王"};

        int index=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                poker[index++]=colors[j] + numbers[i];
            }

        }

        for (int i = 0; i < kings.length; i++) {
            poker[index++]=kings[i];
        }


        System.out.println("洗牌之前：");
        //洗牌之前
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i]+"\t");
            if(i%5==4){
                System.out.println();
            }
        }

        System.out.println();

        System.out.println("======================");

        //洗牌之后
        Random r = new Random();
        for (int i = 0; i < poker.length; i++) {
            int j=r.nextInt(poker.length);
            String temp=poker[i];
            poker[i]=poker[j];
            poker[j]=temp;
        }

        System.out.println("洗牌之后：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i]+"\t");
            if(i%5==4){
                System.out.println();
            }
        }
    }
}
