package StackAndQueuse;

import java.util.Scanner;
import java.util.Stack;

//(a+b)+((c+d))-->true; useless duplicates brackets used.
//((a+b)+(c+d))-->false; cause (a+b) and (c+d) gives different result that contain ().
public class DuplicateBracket {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isDuplicate(str));
    }
    static boolean isDuplicate(String str){

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch==')'){
       if(st.peek()=='('){
         return true;
           }
        while (st.peek() !='('){
       st.pop();
                     }
       st.pop();//also remove the first bracket.
            }
            else{
                st.push(ch);
            }
        }
        return false;
    }
}
