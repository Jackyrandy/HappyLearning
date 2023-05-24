package HomeWork.Week;
import java.util.*;
public class Week_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("input the num:");
        int n=sc.nextInt();
        CircleArea[] cl=new CircleArea[n];double max=0.0;
        for (int i = 0; i < n; i++) {
            cl[i]=new CircleArea((int)(Math.random()*10));
        }
        max=CircleArea.getMax(cl);
        System.out.println("max="+max);*///第七章-3  P25 练习题
        /* Student s1=new Student();
        Student s2=new Student("ss");
        Student s3=new Student("zhangsan",15);*///第7章-4 P23
        /*Students s=new Students("李夏",25,86.5);
        s.setGrade(99);
        System.out.println("成绩是："+s.getGrade());*///第六章P55  实验6.3
        StaMem s1=new StaMem();
        StaMem s2=new StaMem();
        StaMem.b=10;
        s1.b=20;
        s2.b=30;
        System.out.println("StaMem.b="+StaMem.b);
        System.out.println("s1.b="+s1.b);
        System.out.println("    s2.b="+s2.b);//第六章P58  实验6.5
        System.out.println("2221311024  高晖宇");
    }
}
class StaMem{
    int a;
    static int b;
    public static void meth1() {
        StaMem st=new StaMem();
        st.a=100;
        b=100;
    }
    public void meth02(){
        a=80;b=80;
    }
    public static void meth03(){
        meth1(); StaMem sm=new StaMem();
        sm.meth02();
    }
}
class Students{
private String name;private int age;private double grade;
public Students(String newName,int newAge,double newGrade){
        this(newAge,newGrade);
        name=newName;
        System.out.println("构造方法public Students(String newName,int newAge,double newGrade被调用");
        }
public Students(int newAge,double newGrade){
        this(newGrade);
        age=newAge;
        System.out.println("构造方法Students(int newAge,double newGrade)被调用");
        }
public Students(double newGrade){
    this();
    System.out.println("构造方法public Students(double newGrade被调用");
    }
public Students(){System.out.println("构造方法 Students()被调用");}
void setGrade(double newGrade){
    double grade=0;
    grade=newGrade;
    }
double getGrade(){return grade;}
}
class Student {
    String name;int age;
    Student() {
        System.out.println("Student()构造方法已被调用");
    }
    Student(String newName,int newAge){
        this.name=newName;this.age=newAge;
        System.out.println(" Student(String newName,int newAge)构造方法已被调用");
    }
    Student(String newName){
        this.name=newName;
        System.out.println(" Student(String newName)构造方法已被调用");
    }
}
class CircleArea{
    private int radius;
    private final double pi=3.14;
    CircleArea(int radius){this.radius=radius;}
    CircleArea(){
        System.out.println("no radius has been entered yet");
    }
    double getArea(){return this.radius*radius*pi;}
    public static double getMax(CircleArea[] cl){
        double max=0;
        for (int i = 0; i < cl.length; i++) {
            System.out.println("area is "+cl[i].getArea());
            if(max<cl[i].getArea()) max=cl[i].getArea();
        }return max;
    }
}