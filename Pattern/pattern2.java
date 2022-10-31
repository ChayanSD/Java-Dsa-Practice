//* * * *
//* * * *
//* * * *
//* * * *

package Pattern;

public class pattern2 {
    public static void main(String[] args) {
        pattern2(4);
    }
    static void pattern2(int n ){
        for (int row = 1; row <=n ; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

}
