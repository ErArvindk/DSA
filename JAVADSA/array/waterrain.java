package array;

/**
 * waterrain
 */
public class waterrain {

    public static void rainfall(int arr[]){

        int n=arr.length;

        // left array

        int leftmax [] =new int[n];

        leftmax[0]=arr[0];

        for(int i=1; i<=n-1; i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }


         // right array
        int rightmax [] = new int[n];

        rightmax [n-1] = arr[n-1];
        for(int i=n-2; i<=0; i--){
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }

        /// to left right and original array compare ;

        int trapping [] =new int[n];

        for(int i=0; i<n; i++){
            int waterfall =Math.max(leftmax[i], rightmax[i]);
            trapping[i] +=waterfall-arr[i];
        }

        // 
        for(int i=0; i<trapping.length; i++){
            System.out.print(trapping[i]+" , ");
        }
        



    }
   
    
    public static void main(String[] args) {
        int arr[] ={3,1,2,4,0,1,3,2};
        rainfall(arr);
        
    }
}
