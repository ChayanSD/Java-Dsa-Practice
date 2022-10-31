package Function;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
     //   System.out.println(greet());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(  greet(name));
    }
    static String greet(String name){
        String person = "hello" +" " + name;
        return person;
    }
}
