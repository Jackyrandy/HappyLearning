package Learning;
import java.util.Scanner;//引用Scanner类
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month (1-12): ");
        int month = input.nextInt();//获取输入的月份
        System.out.println("Enter the year: ");
        int year = input.nextInt();//获取输入的年份
        int days = 0;
        switch (month) {         //前面思路和上一题一摸一样，这题多了一个年份的检验，由于闰年与否只会影响
            case 1:              //二月的结果，因此，只需在case 2：的情况下使用if语句对该年份是否为闰年检验
            case 3:              //为什么先检验年份，是因为如果用户输入的月份不是二月，那么不用运算到case 2
            case 5:              //程序就会结束运行，不会运行到if语句，提高了程序的运行速度
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("孩子放尊重点，你别闹");
                System.exit(0);//System.exit(0);以结束整个程序的运行，如果不加此语句当用户输入
        }                           //13 2000时，尽管月份出错且输出了语句“放尊重点孩子...”
                                    //程序仍然向后执行，输出13 2000 has 0 days。
        System.out.println(month + " " + year + " has " + days + " days.");
    }
}
