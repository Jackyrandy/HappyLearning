package HomeWork.Week;
import java.util.*;
public class Week_9 {
    public static void main(String[] args) {
        //recursionTest();//第六章-3  P2
        /*TestClass t1=new TestClass();//第7章-1 P20
        TestClass t2=new TestClass(8,9.0);//第7章-1 P20
        System.out.println("first result:"+t1.a+" "+t1.b);
        System.out.println("second result:"+t2.a+" "+t2.b);*/
        /*Rectang01 n=new Rectang01();//第7章-2 P10
        System.out.println(n.getArea()+"   "+n.getPerimeter());*/
        //Fibonacci();
        // 学习辅导（实验），P33  实验3.9
        IsGrade g=new IsGrade();
        Scanner r=new Scanner(System.in);
        System.out.println("enter the name and grade");
        g.name=r.next();
        int gra=r.nextInt();
        if(g.setGrade(gra))
            System.out.println("I'm"+g.name+"grade:"+g.getGrade());
        else System.out.println("go out");//第六章P53  实验6.1
        System.out.println("2221311024 高晖宇");
    }
    public static class IsGrade{
        String name;private int grade;
        public boolean setGrade(int grade){
            if(grade>=60&&grade<=100) {
                this.grade = grade;
                return true;
            }else return false;
        }
        public int getGrade(){
            return grade;
        }
    }

    static void Fibonacci(){
        Scanner inp=new Scanner(System.in);
        System.out.println("please enter an integer greater than or equal to 1");
        int n=inp.nextInt();
        System.out.println("NO."+n+" Fibonacci number is :"+fibonacci(n));
    }
    public static long fibonacci(int n){
        if(n==1) return 0;
        else if(n==2) return 1;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
    static class Rectang01{
        private double height=1,width=1;
        void setMem(double height,double width){
            if(height>0&&width>0){this.height=height;this.width=width;}
            else System.out.println("input errors");
        }
        public double getArea(){return height*width;}
        public double getPerimeter(){return 2*(height+width);}
    }
   static class TestClass{
        int a;double b;
        TestClass(){
            a=5;
        }
        TestClass(int a,double b1){
            this.a=a;
            b=b1;
        }
   }
    public static void recursionTest(){
        int n=10;
        System.out.println(n+"!="+fac(n));
    }
    public static int fac(int n){
        if(n==1) return 1;
        else{
            return n*fac(n-1);
        }
    }
}
