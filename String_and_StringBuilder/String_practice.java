package String_and_StringBuilder;

import java.util.Scanner;

public class String_practice {
    public static void main(String[] args) {
//        String name = "Chayan sd";
//        System.out.println(name);
//        String a = "chayan";
//        System.out.println(a);
//        a= "sd";
//        System.out.println(a);
//
//        String a = "helo";
//        String b ="chayan";
//        if(a.length() == b.length()) System.out.println("Yes");
//        else System.out.println("No");
//
//        System.out.println(a.length() + b.length());
//        System.out.println(a.charAt(0) +" " +b.toUpperCase(0));
        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        System.out.println(A.length()+B.length());
//        System.out.println(A.compareTo(B)>0?"Yes":"No");
//        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(S.substring(start,end));
    }
}
