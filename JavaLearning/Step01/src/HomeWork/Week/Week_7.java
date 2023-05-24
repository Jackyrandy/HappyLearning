package HomeWork.Week;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Week_7 {
    public static void main(String[] args) {
        //referenceDemo();//胶片第5章-3 P29
        //PassDe();//胶片第5章-3 P32
        /*try {
            inputIO();
        } catch (IOException e) {
            e.printStackTrace();
        }*///胶片第5章-3 P49
        randomCharacter();//p41 4.6
        System.out.println("2221311024 高晖宇");
    }

    public static void randomCharacter(){
        char sChar=' ',eCher=' ',ch=' ';
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the num of char:");
        int n=sc.nextInt();
        System.out.println("input first char");
        String s1=sc.next();
        sChar=s1.charAt(0);
        System.out.println("input second  char");
        String s2=sc.next();
        eCher=s2.charAt(0);
        if(sChar>eCher){
            char temp=sChar;sChar=eCher;eCher=temp;
        }
        for (int i = 0; i <n; i++) {
            ch=(char)(sChar+Math.random()*(eCher-sChar+1));
            System.out.println(ch+"  ");
        }
    }
    public static void inputIO()throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("input the first integer");
        String str=br.readLine();
        int a =Integer.parseInt(str);
        System.out.println("input second integer");
        str=br.readLine();
        int b=Integer.parseInt(str);
        int c=a+b;
        System.out.println(a+"+"+b+"="+c);
    }
    public static void referenceDemo(){
        StringBuffer str1 =new StringBuffer("Hello!");
        StringBuffer str2 =str1;
        String str3 = new String(str1);
        String str4=str3;
        str1.append("i can change!");
        System.out.println("str1--"+str1+"\n"+"str2--"+str2);
        str2.append("i can change too");
        System.out.println("str1---"+str1+"\n"+"str2---"+str2);
        str3=str3.concat("i can change!");
        System.out.println("str3--"+str3+"\n"+"str4--"+str4);
        //首先，创建了一个StringBuffer对象str1，并将其赋值给str2。然后，通过new String()构造函数创建了一个新的String对象str3，该对象的
        // 值与str1相同，最后将str3的值赋给str4。此时，str1、str2、str3和str4指向不同的对象，但str1和str2指向同一个对象，str3和str4也
        // 指向同一个对象。
        //然后，使用str1和str2的append()方法在原对象上修改了字符串的值，两个引用都指向了修改后的对象，所以它们输出的结果相同。
        //接着，使用str3的concat()方法返回一个新的String对象，并将其赋值给str3，此时str3指向了一个新的对象，
        // 而str4仍然指向原来的对象。
        //因此，输出结果为：
        //str1--Hello!i can change!
        //str2--Hello!i can change!
        //str1---Hello!i can change too
        //str2---Hello!i can change too
        //str3--Hello!i can change!
        //str4--Hello!
        //需要注意的是，这里使用了String对象的构造函数和concat()方法，这意味着每次调用都会创建一个新的对象，因此会增加内存开销。
        // 而StringBuffer对象则可以在原对象上进行修改，避免了不必要的内存分配
    }
    public static void PassDe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the password");
        String pass = sc.next();
        boolean result = validPass(pass);
                if(result==true) System.out.println("Valid Password");
                else System.out.println("Invalid Password");
    }
    public static boolean validPass(String pass) {
        if (pass.length() <= 8) return false;
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isDigit(pass.charAt(i)) && !Character.isLetter(pass.charAt(i))) {
                return false;
            }
            if (Character.isDigit(pass.charAt(i))) count++;
        }
        if (count < 2) return false;
    return true;
    }
}

