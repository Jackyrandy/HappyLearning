package HomeWork.Week;

public class TestDemo {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("this cannot be");
        System.out.println("capacity is "+str.capacity());
        str.append(" Ture this is a not a book");
        System.out.println("str is "+str);
        System.out.println("capacity is "+str.capacity());
        System.out.println("length is "+str.length());
        System.out.println(str);
    }
}
