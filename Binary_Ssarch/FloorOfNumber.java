public class FloorOfNumber {
    public static void main(String[] args) {
int arr[]={2,5,9,10,12};
int target = 4;
        System.out.println(floor(arr,target));
    }
    //return the index of greatest number that is smallest or equal to the target.
    static int floor(int arr[], int target){
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
        return end;
        }
    }
