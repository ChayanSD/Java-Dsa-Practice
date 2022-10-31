package ArraysAndArraylist;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int arr[]= {2,3,45,67,534};
       // swap(arr,1,3);
        int index1=1;
        int index2=3;
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;


        System.out.println(Arrays.toString(arr));
    }
//    static void swap(int[] arr,int index1,int index2){
//        int temp = arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]= temp;
//
//    }
}
