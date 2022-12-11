package Sets;

import java.util.ArrayList;

public class SubsequenceAsciiValue {
    public static void main(String[] args) {
        subseqAscii("","abc");
    }
    static void subseqAscii(String p , String up){
        //base condition
        if(up.isEmpty()){
            System.out.println(p);
            return; //no need to do anything.
        }
        char ch =up.charAt(0);

        subseqAscii(p+ch,up.substring(1));//this call will add .
        subseqAscii(p,up.substring(1));//this call will ignore.
        subseqAscii(p + (ch+0),up.substring(1));
    }
}
