package ArraysAndArraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
//        int [][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for(int row=0;row <arr.length;row++){
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] +" ");
//            }
//            System.out.println();
////this was happens when you know the array elements;

        //     }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int row = 0; row < arr.length; row++) {
            //for each collum in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
                //here just we are taking input;
            }
        }
//for output do the same thing;
//        for (int row = 0; row < arr.length; row++) {
//            //for each collum in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]);
//
//            }
//            System.out.println();
//        }
        //another way to print
//        for (int row = 0;row <arr.length;row ++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //another awesome way to print using inhence for loop
        for(int[] num : arr){
            System.out.println(Arrays.toString(num));

        }
    }
}
