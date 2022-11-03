package Recursion;

public class FunctionPrintNum {
    public static void main(String[] args) {
        //write a function that takes in a number and print it
        //print first 5 number = 1 2 3 4 5
num(1);
    }
    static void num(int n){
        System.out.println(n);
        num1(2);
    }
    static void num1(int n){
        System.out.println(n);
        num2(3);
    }
    static void num2(int n){
        System.out.println(n);
        num3(4);
    }
    static void num3(int n){
        System.out.println(n);
        num4(5);
    }
    static void num4(int n){
        System.out.println(n);

    }
}
