package MathsForDsa;

public class Findunique {
    public static void main(String[] args) {
        int [] arr = {2,3,2,3,4};
        System.out.println(isUnique(arr));
    }
    static int isUnique(int [] arr){
        int unique = 0;
       for (int n: arr) unique ^= n;


      return unique;
    }

}
