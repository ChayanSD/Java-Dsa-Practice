package Sets;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
  subseq("","abc");
        System.out.println(subseqRet("","abc"));
    }
    static void subseq(String p , String up){
        //base condition
        if(up.isEmpty()){
            System.out.println(p);
            return; //no need to do anything.
        }
        //take the first character and make 2 recursion call.
        char ch =up.charAt(0);

        subseq(p+ch,up.substring(1));//this call will add .
        subseq(p,up.substring(1));//this call will ignore.

    }
    //return by arraylist
    static ArrayList<String> subseqRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left= subseqRet(p + ch ,up.substring(1));
       ArrayList<String> right =subseqRet(p,up.substring(1));
       //add two result that you get from left and right.
        left.addAll(right);
        return left;
    }
}
