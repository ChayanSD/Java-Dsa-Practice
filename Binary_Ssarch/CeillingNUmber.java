public class CeillingNUmber {
    public static void main(String[] args) {
int arr[]={2,5,9,10,12};
int target = 13;
        System.out.println(ceilling(arr,target));
    }
    //return the index of smallest number that is greater then of equal to the target.
    static int ceilling(int arr[],int target){
 //But what if the target is greater than the greatest number in the array.
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end =arr.length -1;
        while (start <= end){
            int mid= start+(end - start)/2; //Thanks sir
            if(target <arr[mid]){
                end= mid-1;
            } else if (target > arr[mid]) {
                start= mid + 1;

            }else {
                return mid;
            }
        }
        return start;
        }
    }
