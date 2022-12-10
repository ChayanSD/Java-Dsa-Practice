package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
int [] arr = {1,2,4,5,6};
int target = 4;
        System.out.println(search(arr,target,0));
    }
    static int search(int arr [],int target,int index){
        //base condition
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else {
            return search(arr,target,index+1);
        }
    }
}
