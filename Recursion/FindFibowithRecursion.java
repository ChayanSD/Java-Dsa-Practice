package Recursion;

public class FindFibowithRecursion {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }
    static int fibo(int n){
        //make the base condition
        if(n<2){
            return n;
        }

        //this the recurrence relation of fibonacci number
        return fibo(n-1)+fibo(n-2);
    }
}
