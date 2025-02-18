package practics;

public class mergesortss {

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[],int start,int end){

        /// best case

        if(start>=end){
            return;
        }

        // work 

        int mid =(start+end)/2;

        mergesort(arr, start,mid);
        mergesort(arr, mid+1, end);
        tomerge(arr,start,end,mid);


    }

    public static void tomerge(int arr[],int start ,int end ,int mid){

        int temp [] = new int[end - start+1];

        // iterator create 

        int i = start;
        int j = mid +1;
        int k = 0;


        // // loops 
        while (i<=mid && j<=end) {

            if (arr[i]<= arr[j]) {
                temp [k] =arr[i];
                i++ ;
                
            }else{
                temp[k] = arr[j];
                j++ ;
            }
            k++;
            
        }

        // left part 
        while (i<=mid) {
            temp[k++] =arr[i++];
            
        }
        while (j<=end) {
            temp[k++] =arr[j++];
            
        }


        //// to copy the array 

        for(k=0, i=start; k<temp.length; k++  , i++){

            arr[i] = temp[k];

        }
    }

    public static void main(String[] args) {
        int arr[] ={2,4,6,8,3,5,7};

        System.out.print("Print  unsorted   ARRAY = ");
        print(arr);

        mergesort(arr, 0,arr.length-1);

        System.out.print("Print  unsorted   ARRAY = ");
        print(arr);
    }
    
}
