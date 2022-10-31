package ArraysAndArraylist;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
//        arr[0]=6;
//        arr[1]=5;
//        arr[2]=54;
//        arr[3]=554;
//        arr[4]=54533;
//        System.out.println(arr[2]);
//This way is very time cons..
        //internally its look like {6,5,....}
        //print array using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));

    }
}
