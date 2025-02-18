package recursion;

/**
 * Innercheakifsort
 */

public class cheakifsort {

    public static boolean isshorted(int arr[], int i){
        if (i == arr.length-1) {
            return true;
            
        }

        if (arr[i] > arr[i+1]) {
            return false;
            
        }
        return isshorted(arr, i+1);
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,5};
        System.out.println(isshorted(arr, 0));
     
    }
    
}
