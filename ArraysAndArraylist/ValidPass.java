package ArraysAndArraylist;

import java.util.Scanner;

public class ValidPass {
    public static void main(String[] args) {
        //defining some constant variable
        final int uppercase =2;
        final int lowercase =2;
        final int disit =1;
                int uppercount = 0;
                int lowercount= 0;
                int digitcount =0;
                int lettercount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String input = sc.nextLine();
        //for getting input length
        int inlength = input.length();
        for (int i = 0; i < inlength; i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch))
                uppercount++;
            else if (Character.isLowerCase(ch))
                lowercount++;
            else if (Character.isDigit(ch))
                digitcount++;
        }
            if(uppercount >=uppercase && lowercount >=lowercase && digitcount >=disit){
                System.out.println("The password is valid.");
            }
            else {
                System.out.println("THe password did not have enough of the following: ");
                if(uppercount <uppercase)
                    System.out.println("Uppercase letter");
                if(lowercount <lowercase)
                    System.out.println("Lowercase letter");
                if(digitcount <disit)
                    System.out.println("Digits");
            }
        }
    }

