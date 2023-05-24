package Learning;
import java.util.Scanner;
public class GCD2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input the first num:");
        int num1= sc.nextInt();
        System.out.println("input the second num:");
        int num2=sc.nextInt();
        int gcd=1;
        for(int k=1;k<=((num1>num2)?num1:num2)/2;k++){
            if(num1%k==0&&num2%k==0)
                gcd=k;
        }
        System.out.println("The GCD is :"+gcd);
        System.out.println("2221311027");
        System.out.println("杨彤");

    }
}
