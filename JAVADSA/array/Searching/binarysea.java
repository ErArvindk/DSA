package array.Searching;

public class binarysea {

    public static int returnss(int arr[] , int target){

        int low=0 ,  high=arr.length-1;

        while (low <= high) {

            int mid=low +(high - low)/2;
            if (arr[mid]==target) {
                return mid;
                
            }
            if (arr[mid] < target) {
                low =mid+1;
                
            }
            else{
                high=mid-1;
            }
            
        }
      return -1;
    }
    public static void main(String[] args) {
        int arr[] = {8,1,4,3,2,6,7};
        int target =2;
        int retul =returnss(arr, target);

        if (retul == -1) {
            System.out.println("Not foutd ");
            
        }else{
            System.out.println(retul);
        }

    }
    
}
