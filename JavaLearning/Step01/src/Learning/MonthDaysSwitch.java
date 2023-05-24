package Learning;
import java.util.Scanner;
    public class MonthDaysSwitch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入月份（1-12）：");//思路：1.3.5.7.8.10.12.31天永不差
            int month = sc.nextInt();              // 首先使用Scanner类获取用户输入的月份，然后使用switch语句根据月份计算天数。
            if(month>12||month<=0){
                System.out.println("哎呦，你干嘛");
                System.exit(1);
            }
            int days;                              // 对于二月份，天数为28天；对于4月、6月、9月和11月，天数为30天
            switch (month) {                       // 对于其它月份，天数为31天。最后，使用printf方法将月份和天数输出到控制台
                case 2:
                    days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
                    break;
            }

            System.out.printf("%d月有%d天", month, days);
            //此处可以改为System.out.println(month + "月有" + days + "天");
            //区别：printf方法是一个格式化输出方法，可以将多个参数根据指定的格式转换为字符串并输出
            //而println方法则是一个简单的输出方法，它可以直接输出一个字符串，并在末尾添加一个换行符
        }


}
