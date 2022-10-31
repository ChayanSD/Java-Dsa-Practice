package SortinginJava;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the maximum item in this remaining array and swap it correct index;
            int last = arr.length - i - 1;
        int maxIndex = getMax(arr,0,last);
      swap(arr,maxIndex,last);
        }
    }
    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int arr[] , int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
