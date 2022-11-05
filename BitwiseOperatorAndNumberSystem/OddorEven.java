package BitwiseOperatorAndNumberSystem;
//You have a number n;check it that the is even or odd
public class OddorEven {
    public static void main(String[] args) {
        int n = 33;
        if((n&1)==1){
            System.out.println("The number : "+ n+" "+"is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }
}
