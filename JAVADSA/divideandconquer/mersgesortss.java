package divideandconquer;

/**
 * mersgesortss
 */
public class mersgesortss {

    public static void prints(int arr []){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[] ,int start ,int end){


        // base case 
        if (start>=end) {
            return ;
            
        }

        // work 
        int mid =(start+end)/2;
        mergesort(arr, start, mid); // left sides
        mergesort(arr, mid+1, end); // right sides
        mergepart(arr, start,mid, end);

    }
  
    public static void mergepart(int arr[],int start ,int mid ,int end){
        int temp [] = new int[end -start+1];

        /// create a iterators 
        int i=start;

        int j=mid+1;
        int k=0;

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



 
        /// left part

        while (i<= mid) {
            temp[k++] = arr[i++];

            
        }

        ///  right part 
        
        while (j <=end) {
            temp[k++]=arr[j++];
            
        }

         // to the copy of another array
         
         for(k=0, i=start; k<temp.length; k++,i++){
            arr[i] =temp[k];
         }


    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        System.out.print("Print the unsorted array  = ");
        prints(arr);
        mergesort(arr, 0, arr.length-1);
        System.out.print("Print the sorted array  = ");
        prints(arr);
    }
    
}
