package Recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int [] arr ={8,7,6,5,4,3};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr , int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[r]){
                //swap
                int temp = arr[c];
                arr[c]= arr[c+1];
                arr[c+1]= temp;
            }
            bubble(arr,r,c+1);
        }
        bubble(arr,r-1,0);
    }
}
