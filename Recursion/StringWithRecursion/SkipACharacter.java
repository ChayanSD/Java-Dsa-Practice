package Recursion.StringQuestion;

public class SkipACharacter {
    public static void main(String[] args) {
       // skip("","baccad");
        System.out.println(skip2("baccad"));
    }
    static void skip(String p,String up){
        //base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));
        }
    }
    static String skip2(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip2(str.substring(1));
        }
        else {
            return ch + skip2(str.substring(1));
        }
    }
}
