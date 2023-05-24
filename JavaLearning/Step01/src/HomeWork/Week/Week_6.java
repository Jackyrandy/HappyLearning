package HomeWork.Week;
import java.util.*;
public class Week_6 {
            public static void main(String[] args) {
                //yanghuiTriangle();//ppt4.4 p51
                //checkPalindrome();//ppt5.2 p29
                //twoDimArrays();//第四章P38  实验4.3
                //strComp();
                System.out.println("2221311024 高晖宇");
            }
            public static void strComp(){
                String str1="Java";
                String str2="Java";
                String str3=new String("Java");
                String str4=new String("Java");
                System.out.println("用运算符==的比较结果如下");
                System.out.println("str1=str2 :"+(str1==str2));
                System.out.println("str3=str4 :"+(str3==str4));
                System.out.println("str2=str3 :"+(str2==str3));
                System.out.println("调用.equals()方法进行比较的结果如下：");
                System.out.println("str1=str2 :"+str1.equals(str2));
                System.out.println("str3=str4 :"+str3.equals(str4));
                System.out.println("str2=str3 :"+str2.equals(str3));

            }
            public static void twoDimArrays(){
                int[][]arr=new int[2][3];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j]=(int)(Math.random()*100);
                        System.out.println("arr["+i+"]"+"["+j+"]="+arr[i][j]+" ");
                    }
                    System.out.println();
                }
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(Arrays.toString(arr[i]));
                }
            }
            public static void checkPalindrome(){
                Scanner sc=new Scanner(System.in);
                System.out.println("input a string:");
                String str=sc.next();
                int count=0;
                for (int i = 0; i <str.length()/2 ; i++) {
            if(str.substring(i,i+1).equals(str.substring(str.length()-1-i,str.length()-i)))
                count++;
                }
                if(count==str.length()/2)
                    System.out.println(str+" is palindrome string");
                else
                    System.out.println(str+" is not palindrome string");
            }
            public static void yanghuiTriangle(){
                int line=0;//Create and initialise variable line
                Scanner sc=new Scanner(System.in);
                System.out.println("this is a program to print Yang Hui's triangle.enter the number of lines you want to print");
                line=sc.nextInt();
                int[][] arr=new int [line][];//create an arr which have "line" row
                for (int i = 0; i < arr.length; i++)
                    arr[i] = new int[i + 1];//创建杨辉三角的数组结构
                arr[0][0]=1;
                for (int i = 0; i <arr.length ; i++) {
                    arr[i][0]=1;arr[i][i]=1;
                    for (int j = 1; j <arr[i].length-1; j++) {
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    }
                }
                for(int []row:arr){
                    for(int col:row)
                        System.out.printf(col+" ");
                    System.out.println("");
                }
        /*for (int i = 0; i <arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
