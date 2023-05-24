import java.util.*;
public class TestTemperature {
    public static void main(String[] args) {
        int[] arr= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        System.out.println(" arr "+Arrays.toString(arr));
        arr=new int[6];
        System.out.println(" arr "+Arrays.toString(arr));
        arr[5]=99;
        System.out.println(" arr "+Arrays.toString(arr));
    }
}
