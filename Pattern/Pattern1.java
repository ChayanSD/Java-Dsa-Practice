package Pattern;

//*
//* *
//* * *
//* * * *



import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        pattern1(H);
    }
    static void pattern1(int n ){
        for (int row = 1; row <=n ; row++) {
            //for every row,run the column
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            //when row is printed , we need to add a new line;
            System.out.println();

        }


    }
}
