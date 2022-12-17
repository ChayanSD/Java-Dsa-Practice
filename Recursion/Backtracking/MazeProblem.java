//Count how manay path for go to the end.

package Recursion.Backtracking;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(countPath(3,3));
    }
    static int countPath(int r,int c){
        if(r==1 || c==1){
            return 1;
            //base condition;
        }
        int left = countPath(r-1,c); //whatever ans get form left.
        int right =countPath(r,c-1);//whatever ans get form right.

        return left + right;
        //Add all the ans .
    }

}
