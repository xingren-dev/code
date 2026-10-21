import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       test3();
    }

    public static void test1() {
        //根据男女性别的不同，推荐不同的书本
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的性别:");
        String sex = sc.next();
        switch (sex){
            case "男":
                System.out.println("推荐《如何让女孩喜欢你》");
                break;
            case "女":
                System.out.println("推荐《如何让男孩喜欢你》");
                break;
            default:
                System.out.println("输入的性别有误");
        }
    }

    public static void test2() {
        /*
        可以通过穿透性，减少重复代码的书写
        周一：工作日
        周二：工作日
        周三：工作日
        周四：工作日
        周五：工作日
        周六：休息日
        周日：休息日
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入星期几:");
        String day = sc.next();
        switch (day){
            case "周一":
            case "周二":
            case "周三":
            case "周四":
            case "周五":
                System.out.println("工作日");
                break;
            case "周六":
            case "周日":
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入的星期有误");
        }
    }

    public static void test3() {
        System.out.println("====欢迎使用学生管理系统====");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.添加学生信息");
        System.out.println("2.查询学生信息");
        System.out.println("3.修改学生信息");
        System.out.println("4.删除学生信息");
        System.out.println("5.退出系统");

        System.out.print("请输入你的选项:");

        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("添加学生信息");
                break;
            case 2:
                System.out.println("查询学生信息");
                break;
            case 3:
                System.out.println("修改学生信息");
                break;
            case 4:
                System.out.println("删除学生信息");
                break;
            case 5:
                System.out.println("退出系统");
                break;
            default:
                System.out.println("输入的选项有误");
                break;
        }

    }



}
