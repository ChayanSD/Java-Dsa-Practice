package Number_Convert;

import java.util.Scanner;

public class D2b {
    public static void main(String[] args) {
        int num = 5;
        int arr[]= new int [100];
        int ans=binary(arr,0,num,0);
        System.out.println(ans);

    }

    static int binary(int arr[], int rem, int num,int i) {
        while (num != 0) {
            rem=num%2;
            num=num/2;
            arr[i]=rem;

        }
        for (int j = i-1; j >=0 ; j--) {
            System.out.println(arr[j]);

        }
        return 0;
    }

}














