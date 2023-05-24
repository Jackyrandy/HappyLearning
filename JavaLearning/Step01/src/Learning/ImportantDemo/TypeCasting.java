package Learning.ImportantDemo;

public class TypeCasting {
    public static void main(String[] args) {
       int a=10;
       long b=20l;
       float c =30F;
       String s="50";
       a=Integer.parseInt(s);//将字符串变量 s 转换成整型，并将其赋值给变量 a。
        // 这里使用了 Integer.parseInt()
        // 方法，它将一个字符串解析成一个整型数值。执行完这行代码后，a 的值将变为 50
       b=Long.parseLong(s);//可以使用Java中的Long.parseLong(String s)方法将字符串转化为长整型。
        //这个方法会解析一个表示长整数的字符串，并返回一个对应的long类型值。
        // 在 Java 中，很多类型都提供了相应的 parse 方法，用于将字符串转换为对应的类型，
        // 例如 Integer.parseInt()、Double.parseDouble()、Boolean.parseBoolean()
        // 等等。这些方法都是用来解析字符串，将其转换为对应的数据类型。
        // 例如，以下代码将字符串"12345"转换成长整型
        //String str = "12345";
        //long num = Long.parseLong(str);
        //需要注意的是，如果输入的字符串不能正确转换成长整型，会抛出NumberFormatException异常。
        // 因此在实际使用时，应该使用try-catch语句来捕获可能的异常
        //String str = "abc";
        //try {
        //    long num = Long.parseLong(str);
        //} catch (NumberFormatException e) {
        //    System.out.println("输入的字符串无法转换为长整型！");
        //}
        c=Float.parseFloat(s);
        System.out.println("a="+a+"b="+b+"c="+c);
        int MyInt=1234;
        String MyString=Integer.toString(MyInt);
        //可以使用Java中的Integer.toString(int i)方法将int类型转换为字符串类型。
        //
        //这个方法接收一个int类型的参数，返回对应的字符串类型值。例如，以下代码将整数123转换成字符串类型
        //int num = 123;
        //String str = Integer.toString(num);
        //另外，也可以使用字符串拼接的方式将整数转换成字符串。例如：
        //int num = 123;
        //String str = "" + num;
        //在这种情况下，Java会自动将整数转换成字符串，然后将其与空字符串拼接起来。
        // 需要注意的是，这种方法可能会比较低效，因为Java会创建一个新的字符串对象来存储结果
        System.out.println("MyString="+MyString);
        System.out.println("2221311024 高晖宇");
    }
}

