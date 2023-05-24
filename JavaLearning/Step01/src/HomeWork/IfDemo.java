package HomeWork;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        int a=0,b=0,c=0,min=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("从键盘输入分隔符分开三个整数：");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<b)
            min=a;
        else
            min=b;
        if(c<min)
            min=c;
        System.out.println("最小的数是"+min);
        System.out.println("2221311027");
        System.out.println("杨彤");
    }

}
