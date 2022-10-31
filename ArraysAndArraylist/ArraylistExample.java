package ArraysAndArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> hello = new ArrayList<>(9);
//        hello.add(45);
//       // System.out.println(hello);
//        hello.add(455);
//        hello.add(5454);
//        System.out.println(hello);
//        hello.set(0,33);
//        System.out.println(hello);
        for (int i = 0; i < 5; i++) {
            hello.add(sc.nextInt());

        }
       // System.out.print(hello);
        //Another way to show output
        for (int i = 0; i < 5; i++) {
            System.out.println(hello.get(i));

        }
    }
}
