package Learning.ImportantDemo;
import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        RandomDemo1();//方法1：java.util.Random类方法，在实际应用中更为常用
        RandomDemo2();//方法2：Math.random()方法，可以生成0到1之间的一个随机数
    }

    public static void RandomDemo1() {//java.util.Random类方法
        Random random=new Random(); //创造Random对象
        //int number = random.nextInt(n); // 生成0到n-1之间的随机整数
        int number1 = random.nextInt(10); // 生成0到9之间的随机整数
        int number2 = random.nextInt(9)+1; // 生成1到9之间的随机整数
        System.out.println(number1);
        System.out.println(number2);
    }

    public static void RandomDemo2() {
        double random = Math.random(); // 生成0到1之间的随机数
        //int number = (int) (random * n); // 生成0到n-1之间的随机整数
        int number = (int) (Math.random() * 10); // 生成0到9之间的随机整数
        System.out.println(number);
    }
}
/*在Java中生成随机数，使用 java.util.Random 类是更常用的方法，原因如下：

Math.random() 方法只能生成大于等于0小于1的随机数，无法直接生成指定范围内的随机数，需要进行额外的计算，
而 Random 类的 nextInt() 方法可以直接生成指定范围内的随机整数。

Random 类可以设置随机数种子，保证生成的随机数序列可重复，这对于调试和测试非常有用。

Random 类提供了更多的方法用于生成不同类型的随机数，如生成随机布尔值、随机浮点数等，功能更加强大。*/