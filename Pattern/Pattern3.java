package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern3(int n) {
        for (int row = 0; row <n ; row++) {
            for (int col = 0; col <n-row; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

}
