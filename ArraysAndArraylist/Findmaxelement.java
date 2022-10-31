package ArraysAndArraylist;

import java.util.Arrays;

public class Findmaxelement {
    public static void main(String[] args) {
        int[] arr = {2, 45, 66, 654};
        System.out.println(max(arr));


    }

    static int max(int arr[]) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;

    }
}