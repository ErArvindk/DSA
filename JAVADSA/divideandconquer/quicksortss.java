package divideandconquer;

/**
 * quicksortss
 */
public class quicksortss {


    //// to print functions 

    public static void printt(int arr[]){

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    /// recursions call in qick sort 

    public static void quicksort(int arr[] ,int start ,int end ){

        //best case;
        if (start >= end) {
            return;
            
        }
         /// to work 
        int ptr=partitions(arr,start,end);
        quicksort(arr, start,ptr-1);
        quicksort(arr, ptr+1,end);
    }
         /// to partitions swap part in the array
    public static int partitions(int arr[], int start ,int end){
        int pivot =arr[end];
        int i=start-1; /// to make the space in the array 

        for(int j=start; j<end; j++){
            if (arr[j]<=pivot) {
                i++;


                // swap
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
            }
        }
        i++;

        int temp =pivot;
        arr[end]=arr[i]; // pivot =arr[i]
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr []={23,4,56,7,6,3,2};
        quicksort(arr, 0,arr.length-1);
        printt(arr);
    }
}
