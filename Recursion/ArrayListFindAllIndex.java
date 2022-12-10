package Recursion;

import java.util.ArrayList;

public class ArrayListFindAllIndex {
    public static void main(String[] args) {
        int [] arr = {1,3,4,4,5};
        int target = 4;
      ArrayList<Integer> ans = findAllIndex(arr,target,0,new ArrayList<>());
        System.out.println(ans);
        //System.out.println(findAllIndex(arr,target,0,new ArrayList<>()));
    }
    static ArrayList<Integer>findAllIndex(int [] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}
