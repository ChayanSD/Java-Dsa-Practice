package MathsForDsa;

public class PrimeOrnot {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                count++;
                break;
            }

        }
        if(count==0){
            System.out.println("The Number is prime");
        }else {
            System.out.println("The number is not prime");

        }
    }
}
