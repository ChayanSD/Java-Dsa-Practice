package Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(30303,0));
    }
    //Special example to return same value to function call;
    static int count(int n,int c){
        return helper(n, c);
    }

      static int helper(int n, int c) {
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
