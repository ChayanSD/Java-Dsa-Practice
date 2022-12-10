package Recursion;
//Find if array sorted or not.
public class IfArraySortedOrNOt {
    public static void main(String[] args) {
        int arr []={1,2,3,4,8,6};
        System.out.println(sorted(arr,0));

    }
    static boolean sorted(int arr[],int index){
        // Base condition
        if(index == arr.length -1){
            return true;
        }
        return arr[index] <arr[index+1] && sorted(arr,index+1);
    }
}
