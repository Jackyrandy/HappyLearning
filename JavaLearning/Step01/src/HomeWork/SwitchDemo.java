package HomeWork;
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        int n=-1;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        switch(n){
            case 1:
                System.out.println("spring");
                break;
            case 2:
                System.out.println("summer");
                break;
            case 3:
                System.out.println("auturn");
                break;
            case 4:
                System.out.println("winter");
                break;
            default:
                System.out.println("error");
                System.exit(0);
        }
        System.out.println("2221311024");
        System.out.println("高晖宇");
    }
}
