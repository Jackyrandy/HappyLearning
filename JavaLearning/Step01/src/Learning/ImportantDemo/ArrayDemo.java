package Learning.ImportantDemo;
import java.util.Arrays;
public class ArrayDemo {

    public static void main(String[] args) {
        System.out.println("数组的创建");
        //1.声明数组
        // 声明数组只是告诉编译器有一个数组变量，并没有创建数组对象。声明数组的格式如下：
        // dataType[] arrayName;其中，dataType是数组元素的类型，arrayName是数组的名称。例如：
        // int[] myArray;
        //double[] doubleArray;（*注意：当你声明数组但没有创建它时，数组的引用会被存放在栈内存中，
        // 但是数组本身并没有被创建，也没有分配内存空间，因此数组元素并不会被存放在栈内存中或堆内存中。
        // 只有在通过 new 关键字创建数组并分配内存空间后，数组元素才会被存放在堆内存中）
        // 2.创建数组
        //在声明数组后，需要使用new运算符创建数组对象。创建数组对象的格式如下：
        // arrayName = new dataType[arraySize];
        // 其中，arraySize表示数组的长度，dataType表示数组元素的类型。例如
        // myArray = new int[5];
        //doubleArray = new double[10];
        //也可以在声明数组时同时创建数组对象，格式如下：dataType[] arrayName = new dataType[arraySize];
        //例如：int[] myArray = new int[5];或 double[] doubleArray = new double[10];
        //3.初始化数组
        //可以在创建数组时为数组元素赋初值。有以下几种初始化数组的方式：
        //*静态初始化：在创建数组对象时同时为数组元素赋值。格式如下：dataType[] arrayName = {value1, value2, value3, ...};
        //例如：int[] myArray = {1, 2, 3, 4, 5};double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        //*动态初始化：在创建数组对象时只指定数组长度，不为数组元素赋初值，可以在后面的程序中为数组元素赋值。格式如下：
        //dataType[] arrayName = new dataType[arraySize];例如：
        //int[] myArray = new int[5];double[] doubleArray = new double[10];
        //
        // 需要注意的是，在动态初始化时，数组元素会自动被初始化为默认值，如整型数组元素默认为0，浮点型数组元素默认为0.0，
        // 布尔型数组元素默认为false，对象数组元素默认为null
        System.out.println("---------------------------------------------------");
        System.out.println("内存");
        //在Java中，数组是一个引用类型，它在内存中存储的是一段连续的内存空间
        // 数组的每个元素都在这段内存空间中占用一个位置。
        //在Java中，数组的内存分配是在运行时进行的，即在程序运行时动态地分配内存。
        // 我们创建一个数组时，Java虚拟机（JVM）会在堆内存中为数组对象分配一块连续的内存空间，并返回这块内存空间的首地址。
        // 这个首地址就是数组的引用，我们可以通过它来访问数组中的元素。
        //当我们声明一个数组时，需要指定数组的类型和长度。例如，int[] a = new int[10]; 这条语句就声明了一个长度为10的整型数组a。
        // 在内存中，JVM会为数组a分配10个连续的int类型的内存空间，这些空间的首地址会被保存在a这个引用变量中。
        //需要注意的是，数组是一种对象，它存储在堆内存中。而基本数据类型（如int、float等）则存储在栈内存中。
        // 因此，当我们传递一个数组作为方法参数时，实际上传递的是数组的引用，而不是数组的副本。这意味着，如果我们修改了数组中的元素，
        // 这些修改将会影响到原始数组，因为它们都指向同一块内存空间
        System.out.println("数组复制");
        //关于数组复制
        // {
        //一般来说，如果是在同一数组内进行复制，使用循环遍历的方法比较方便，如果是将一个数组复制到另一个数组中，
        // 则可以使用System.arraycopy()方法或Arrays.copyOf()方法。如果要将一个数组按照一定的规则复制多份，
        // 则可以使用Arrays.copyOfRange()方法。需要根据具体情况选择最合适的复制方法
        //}
        System.out.println("数组复制举例--1");
        //1.System.arraycopy()
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);//例1.1
                int[] arr11 = {1, 2, 3, 4, 5};//例1.2
                int[] arr22 = new int[3];
                // 将 arr11 中的 3 个元素从索引 1 开始复制到 arr22 中
                System.arraycopy(arr11, 1, arr22, 0, 3);

                System.out.println("arr1: " + Arrays.toString(arr11));
                System.out.println("arr2: " + Arrays.toString(arr22));
        //上述代码中，我们将 arr1 中的 3 个元素从索引 1 开始复制到 arr2 中。因为 arr2 的长度为 3，所以只能复制 3 个元素。
        // 复制后，arr2 的元素变为 [2, 3, 4]。注意，arr1 的元素并没有被修改。
        //------------------------------------------
        //这里使用System.arraycopy()方法将arr1数组复制到arr2数组中。System.arraycopy() 是 Java 中一种高效的数组复制方法，
        // 它可以将一个数组中的一部分元素复制到另一个数组中，也可以在同一个数组中完成元素位置的移动
        //该方法的语法如下：System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)参数说明：
        //src：源数组
        //srcPos：源数组要复制的起始位置
        //dest：目标数组
        //destPos：目标数组放置的起始位置
        //length：复制的长度
        System.out.println("--------------------------------------------------------------------");
        System.out.println("数组复制举例--2");
        //Arrays.copyOf()
        //Arrays.copyOf() 是 Java 中用于复制数组的一个方法。它可以根据指定的长度创建一个新的数组，并将原始数组的内容复制到新数组中。
        //Arrays.copyOf() 方法有两个参数：原始数组和新数组的长度。如果原始数组的长度小于新数组的长度，那么新数组的未复制部分将被填充默认值
        // （例如 0 或者 null）。如果原始数组的长度大于或等于新数组的长度，那么只会复制原始数组的前部分内容。
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = Arrays.copyOf(arr, 7);
        System.out.println(Arrays.toString(newArr)); // [1, 2, 3, 4, 5, 0, 0]
        String[] strArr = {"Hello", "World"};
        String[] newStrArr = Arrays.copyOf(strArr, 3);
        System.out.println(Arrays.toString(newStrArr)); // [Hello, World, null]
        //在上述示例中，Arrays.copyOf(arr, 7) 创建了一个长度为 7 的新数组 newArr，并将 arr 中的元素复制到 newArr 中。
        // 由于原始数组的长度小于新数组的长度，所以 newArr 的最后两个元素被填充为默认值 0。
        //
        //同样的，在第二个示例中，Arrays.copyOf(strArr, 3) 创建了一个长度为 3 的新数组 newStrArr，
        // 并将 strArr 中的元素复制到 newStrArr 中。由于原始数组的长度小于新数组的长度，所以 newStrArr 的最后一个元素被填充为默认值 null。
        System.out.println("--------------------------------------------------------------------");
        System.out.println("数组复制举例--3");
        //for循环遍历复制
        //使用for循环遍历并复制数组是一种常见的方法，它需要手动创建一个新的数组，然后使用for循环将原始数组中的每个元素复制到新数组中
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        originalArray[1]=99;
        System.out.println(originalArray[1]);
        System.out.println(copiedArray[1]);
        //上面的代码中，我们首先创建了一个原始数组 originalArray，然后使用 new 关键字手动创建了一个新的数组 copiedArray，
        // 长度与原始数组相同。接下来使用 for 循环遍历原始数组，并将每个元素复制到新数组中。
        //##需要注意的是，使用for循环复制数组时，如果原始数组中的元素类型是引用类型，那么只会复制引用，而不会复制对象本身。
        // 这意味着，如果我们修改了原始数组中的某个引用指向的对象，那么新数组中对应的引用也会指向这个修改后的对象。如果需要复制对象本身，
        // 可以使用深拷贝或者序列化的方式进行复制。
        System.out.println("--------------------------------------------------------------------");
        System.out.println("数组复制举例--4");
        //clone()方法
        //这是一种浅复制方法，它创建一个新数组，但是新数组和原数组共享相同的元素对象。以下是一个使用 clone() 方法复制数组的例子
        int[] arr111 = {1, 2, 3, 4, 5};
        int[] arr2222 = arr1.clone(); // 使用 clone() 方法复制数组
    // 修改 arr111 的第一个元素为 0
        arr1[0] = 0;
    // 输出 arr111 和 arr222 的元素
        System.out.println("arr1: " + Arrays.toString(arr1)); // [0, 2, 3, 4, 5]
        System.out.println("arr2: " + Arrays.toString(arr2)); // [1, 2, 3, 4, 5]
    //在这个例子中，我们使用 clone() 方法复制了 arr1 数组并将其赋值给 arr2。由于 arr2 和 arr1 共享相同的元素对象，
    // 因此修改 arr1 的第一个元素并不会影响 arr2 数组。Arrays.toString(arr)是Java中Arrays工具类提供的一个静态方法,
        // 用于将一个数组转换为字符串表示形式，以便于打印或者其他使用场景。
        //该方法的参数是一个数组，返回值是一个字符串。调用该方法时，会将数组中的元素按顺序拼接成一个字符串，并用方括号括起来，
        // 每个元素之间用逗号隔开。例如，对于一个int类型的数组int[] arr = {1, 2, 3, 4, 5};，调用Arrays.toString(arr)的结果是[1, 2, 3, 4, 5]。
        //Arrays.toString(arr)方法可以用于调试或输出数组的内容。它可以避免手动遍历数组并逐个打印元素的麻烦，也可以保证输出格式的规范性和一致性。
        // 同时，该方法还支持多维数组的输出，可以将一个多维数组转换为嵌套的方括号表示形式。
        //需要注意的是，该方法并不适用于所有类型的数组，因为某些类型的数组可能需要使用特定的格式来输出元素。例如，对于char类型的数组，
        // 应该使用String.valueOf(arr)方法来将数组转换为字符串，以保证字符元素按照字符串的形式输出。
    }


}





