package MathsForDsa;

public class OddEven {
    public static void main(String[] args) {
        int n = 0;
//        if(((n&1)==1))
//            System.out.println("odd");
//        else System.out.println("even");
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n ){

        return (n&1)==1;
        //using bitwise operator
    }
}
