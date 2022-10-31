package Recursion;

import java.util.Scanner;

public class Recursion01 {
    public static void main(String[] args) {
        //what is recursion?
        //recursion is basically a function that calls itself.
        //q1. print 5 num :1 2 3 4 5 using recursion
//        Scanner sc = new Scanner(System.in);
//       int n=sc.nextInt();
        print(1);
    }
    //let's create a function
    static void print(int n ){
        if(n == 5){
            System.out.println(5);
            return;
        }

        System.out.println(n);
        //recursive call
        print(n + 1);
    }


}
