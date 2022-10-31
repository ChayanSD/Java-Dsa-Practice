package Binary_Ssarch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[sc.nextInt()];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();

        }
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(arr[i]);
//        }

        int target=sc.nextInt();
        int ans= binarySearch(arr,target);
        System.out.println(ans);

    }
    //let's create a function ;
    //return the index
    //if element not found then return -1;
    static int binarySearch(int [] arr,int target){
      int start = 0;
      int end= arr.length -1;
        while(start <=end){
            //find the middle index;
          //  int mid= start +(end-start)/2;
            int mid= (start/2) +(end/2); //Thanks sir
            if(target <arr[mid]){
                end= mid-1;
            } else if (target > arr[mid]) {
                start= mid + 1;

            }else {
                return mid;
            }
        }
        return -1;
    }

}
