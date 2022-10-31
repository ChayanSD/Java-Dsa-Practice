package ArraysAndArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerrankArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());

            }

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());

            }

        }
    }
}
