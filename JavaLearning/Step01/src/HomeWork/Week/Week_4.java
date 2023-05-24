package HomeWork.Week;
import java.util.Scanner;
public class Week_4 {
    public static void main(String[] args) {
        //Factorial();//调用方法
        //WhileDemo();//p29实验3.4
        //ForSwitch();//p31 实验3.7
        JumpDemo();
        System.out.println("2221311024");
        System.out.println("高晖宇");
    }
    public static void JumpDemo(){
        for (int i = 1; i < 10; i++) {
            if(i>5)break;//大于5时跳出循环
            System.out.print("  "+i);
        }
        System.out.println("这些是10以内小于等于5的数字");
        for (int i = 1; i <10 ; i++) {
            if(i%2==0)
                continue;//返回到for循环开头
            System.out.print("  "+i);
        }
        System.out.println("这些是10以内的奇数");
    }
    public static void ForSwitch() {
        char c='\0';
        for (int i = 0; i <= 3; i++) {
            switch (i){
                case 1:
                    c='X';
                    System.out.print(c);
                case 2:
                    c='Y';
                    System.out.print(c);
                    break;
                case 3:
                    c='Z';
                    System.out.print(c);
                default:
                    System.out.print("字符");
            }

        }
    }
    public static void WhileDemo(){
        Scanner sc=new Scanner(System.in);
        int n=0,i=1,sum=0;
        while(true){
            System.out.println("input a num between 30 and 80");
            n=sc.nextInt();
            if(n<=80&&n>=30)
                break;
            else System.out.println("please enter again");
        }
        System.out.println("the number you entered is "+n);
        for(i=1;i<n;i++)
            sum+=i;
        System.out.println("1+2+3+4+...+"+n+"="+sum);
    }
    public static void Factorial(){//定义方法
        int n=1,m=1;
        for(n=1;n<20;n++){
            m*=n;//m即为n的阶乘
            if(m<=100)
                continue;
            if(m>=2000)
                break;
            System.out.println(n);
        }

    }
}
