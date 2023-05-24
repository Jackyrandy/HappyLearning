package Learning.ImportantDemo;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 使用 next() 方法读取单词
        System.out.print("请输入一个单词：");
        String word = scanner.next();
        System.out.println("您输入的单词是：" + word);

        // 使用 nextLine() 方法读取整行
        System.out.print("请输入一行文本：");
        String line = scanner.nextLine();
        System.out.println("您输入的文本是：" + line);
    }
}/*在使用Scanner对象获取用户输入时，next()和nextLine()方法都可以用来读取用户输入的字符串，但是它们之间有一些差异。

    next()方法会读取输入中的一个单词（以空格为分隔符），
        并返回该单词，忽略输入中的空格。
        如果在读取到单词前遇到了空格或其他空白字符，则这些字符都会被忽略掉。
        例如，如果输入是 "Hello World"，则next()方法会返回 "Hello"。
        如果输入是 " Hello World "，则next()方法也会返回 "Hello"，而两端的空格则被忽略掉了。
        nextLine()方法会读取一行完整的输入，并返回该行字符串，
        包括换行符在内。如果输入中有多行，那么nextLine()会一直读取，直到读取到换行符为止。
        例如，如果输入是 "Hello\nWorld\n"，则nextLine()方法会返回 "Hello"，并且会将换行符也包含在内*/
