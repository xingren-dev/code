import java.util.Scanner;

/**
 * 菜单小系统（独立写，卡住先自己试 25 分钟）
 * 需求（菜单叫什么都行，结构对了就赢）：
 * <p>
 * 程序启动后循环显示菜单，比如：1-查询成绩 2-录入成绩 3-显示帮助 0-退出
 * 用 Scanner 读用户输入的数字
 * switch 匹配执行对应分支——每个分支里 println 一句话模拟功能即可，不用真写增删查
 * 执行完自动回到菜单，等下一次选择
 * 输入 0 → 程序退出
 * 输入没定义的数字（比如 9）→ 提示“无此选项”，然后照样回菜单
 * 写完用这 3 条自测：
 * <p>
 * 连续选 1、2、9 之后，菜单每次都重新出现了吗？
 * 输 0 之后程序是不是干脆利落地结束（没有报错、exit code 0）？
 * 把 while(true) 临时改成 while(i < 1) 之类的假条件试试——体会一下死循环为什么“死”，再改回来
 * 会用到：while(true) 死循环、Scanner.nextInt()、switch + case + break、循环里的 break。全是你这两天刚学的，没有新知识。
 */


public class MenuSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=======学生成绩管理系统=======");
            System.out.println("1-查询成绩");
            System.out.println("2-录入成绩");
            System.out.println("3-显示帮助");
            System.out.println("0-退出");
            System.out.print("请输入你的选择:");

            int i = sc.nextInt();
            if (i == 0) {
                System.out.println("系统已退出");
                break;
            }
            switch (i) {
                case 1:
                    System.out.println("查询成绩");
                    break;
                case 2:
                    System.out.println("录入成绩");
                    break;
                case 3:
                    System.out.println("显示帮助");
                    break;
                default:
                    System.out.println("无此选项");

            }

        }

    }
}
