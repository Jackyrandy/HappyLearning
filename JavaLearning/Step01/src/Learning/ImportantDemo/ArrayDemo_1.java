package Learning.ImportantDemo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemo_1 {
    public static void main(String[] args) {
        binarySearch();//题三二分查找法p14
        selectionSort();//题三选择排序法p23
        insertSort();//题三插入排序法p27
        bubbleSort();//题三冒泡排序法
        arrayOut();//第四章P36  实验4.1
        inputArrays();//第四章P37 实验4.2
        System.out.println("2221311024");
        System.out.println("高晖宇");
    }

    public static void inputArrays() {
        int i;
        int[]arr=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter six integers from the keyboard, separated by spaces ");
        for ( i = 0; i < arr.length; i++)
            arr[i]=sc.nextInt();
        int min=arr[0],max=arr[0];
        for (i = 0; i < arr.length; i++) {
            max=arr[i]>max?arr[i]:max;
            min=arr[i]<min?arr[i]:min;
        }
        System.out.println("the min number is "+min+" the max number is "+max);
    }
    public static void arrayOut() {
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        int[] b = new int[a.length];
        for (int i = a.length-1; i >= 0; i--) {
            b[i] = a[a.length-1 - i];
        }
        System.out.println("arrays "+Arrays.toString(a));
        System.out.println("arrays " + Arrays.toString(b));
    }
    public static void bubbleSort() {
        int arr[]={2,9,5,4,8,1,6};//unsorted arrays
        System.out.println("unsort arrays:"+Arrays.toString(arr));
        boolean changed=true;
        do{
            changed=false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    changed = true;
                    System.out.println("now arrays:"+Arrays.toString(arr));
                }
            }
        }while(changed);
        System.out.println("sorted arrays:"+Arrays.toString(arr));
    }
    public static void insertSort() {
        int list[]={2,9,5,4,8,1,6};
        System.out.println("before sort,the list: "+Arrays.toString(list));
        for (int i = 0; i <list.length ; i++) {
            int currentElement=list[i];
            int j=0;
            for(j=i-1;j>=0&&list[j]>currentElement;j--){
                list[j+1]=list[j];
            }
            list[j+1]=currentElement;
            System.out.println("list: "+Arrays.toString(list));
        }
        System.out.println("after sort list: "+Arrays.toString(list));
    }
    public static void selectionSort() {
        int[] arr = new int[10];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(20) + 5;
        }
        System.out.println("source arr " + Arrays.toString(arr));//create and show the arrays
        for (int i = 0; i < arr.length; i++) {
            int currentMin = arr[i], currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin > arr[j]) {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {//如果不进行判断，每次内层循环都会执行一次交换操作，导致不必要的性能浪费。
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
        System.out.println("after selection,arr=" + Arrays.toString(arr));
    }
    public static void binarySearch(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to use the binary search method of arrays");
        int[] arr={1,5,8,9,16,17,19,24,26,35,65,78,99};//create an arrays
        System.out.println("arr "+Arrays.toString(arr));
        System.out.println("there is an arrays,you can input a number and i will find its index:");
        int input= sc.nextInt();
        int low=0,high= arr.length-1,index=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==input){
                index=mid+1;
                System.out.println("the index of "+input+" is "+index);
                break;
            }
            else if(arr[mid]>input)
                high=mid-1;
            else
                low=mid+1;
        }
        if(low>high)
            System.out.println("404 not found");
    }
}
