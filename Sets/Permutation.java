package Sets;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//permu("","abc");
    ArrayList<String> ans = permutations("","abc");
        System.out.println(ans);

    }
    static void permu(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
    String first = p.substring(0,i);
    String second = p.substring(i,p.length());
    permu(first+ch+second,up.substring(1));
        }
    }
    static ArrayList<String> permutations(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
            //when up is empty add on the list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <=p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
           ans.addAll(permutations(first+ch+second,up.substring(1)));
        }
        return ans;
    }

}
