package MathsForDsa;

public class PrimeNumber1TillN {
    public static void main(String[] args) {
         int n=20;
//        System.out.println( isPrime(n));
        for (int i = 1; i <=n ; i++) {
            System.out.println(i +" "+isPrime(i));
        }


    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;  //Starts from 2
        while (c <= Math.sqrt(n)){
            if(n%c==0) {
                return false;
            }
            c++;

        }
       return true;
    }
}
