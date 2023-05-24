package HomeWork;

import java.util.Scanner;

    public class SumOfDigits {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // 获取用户输入的三位整数
            System.out.print("请输入一个三位整数：");
            int number = input.nextInt();

            // 计算各位数字之和
            int sum = 0;
            int digit;
            while (number > 0) {
                digit = number % 10;
                sum += digit;
                number /= 10;
            }
            // 输出结果
            System.out.println("各位数之和为：" + sum);
        }
    }


