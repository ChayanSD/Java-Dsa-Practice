package Function;

public class PassinExample {
    public static void main(String[] args) {
//String name = "chayan";
//       pssing(name);
        int a = 10;
        int b = 20;
        pssing(a,b);
        System.out.println(a +" " +b);
    }
    static void pssing(int a , int b){
      //  System.out.println(nam);
        int temp = a;
        a = b;
        b= temp;

    }
}
