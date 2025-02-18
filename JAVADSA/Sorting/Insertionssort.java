package Sorting;

/**
 * Insertionssort
 */
public class Insertionssort {

    public static void insert(int arr[]){

        // do insertions sort

        for(int i=1; i<arr.length-1; i++){
            int curr =arr[i];
            int prev =i-1;
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev+1] =curr;
                prev--; 
            }
            // than current 
            arr[prev] =arr[curr];
        }
    }
    public static void toprint(int arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

    }


    public static void main(String[] args) {
        int arr[] ={4,2,6,3,8,1,9};
        insert(arr);
        toprint(arr);
    }

    
    
}
