package ArraysAndArraylist;

import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int [] arr = {2,3,4,6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int []  num){

        num[0]=9;
    }
}
