package Backtracking;

import recursion.toremoveduplicate;

/**
 * arrass
 */
public class arrass {

    public static void backtrac(int arr[],int i, int val){
        /// base case 
        if (i == arr.length) {
            /// function print 
            torint(arr);
            return ;
            
        }

        /// recursion
        arr[i]=val;
        backtrac(arr, i+1, val+1);  //// call again & 2
        arr[i] = arr[i]-2;   /// backtraking 

    }
    public static void torint(int arr[]){
        for(int i =0; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[6];
        backtrac(arr, 0, 1);
        torint(arr);
        
    }
}