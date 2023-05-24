/*
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //获取用户输入的年份
        System.out.println("输入年份：");
        int year=input.nextInt();
        //利用if语句判断是否为闰年
        if(year%400==0)
            System.out.println(year+"是闰年");
        else
            if(year%4==0)
                if(year%100!=0)
                    System.out.println(year+"是闰年");
                else
                    System.out.println(year+"不是闰年");
            else System.out.println(year+"不是闰年");

        //输出学号和姓名
        System.out.println("2221311024");
        System.out.println("高晖宇");
    }
}
*/
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 获取用户输入的年份
        System.out.print("请输入一个年份：");
        int year = input.nextInt();
        // 判断是否是闰年
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }
        // 输出结果
        if (isLeapYear) {
            System.out.println(year + "年是闰年。");
        } else {
            System.out.println(year + "年不是闰年。");
        }
        System.out.println("学号：22221311024，姓名：高晖宇");
    }
}
