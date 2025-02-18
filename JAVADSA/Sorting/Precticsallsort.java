package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Precticsallsort {


    public static void bublesort(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]) {

                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                    
                }
            }
        }
    }


    //// to print selections sorts 
    public static void Selectins(Integer arr[]){

        for(int i=0; i<arr.length-1; i++){
            int sec=i;
            for(int j=i+1; j<arr.length-1; j++){
                if (sec >arr[j]) {
                    sec = j;
                    
                }

            }
            // swap 
            int temp =arr[sec];
            arr[sec] =arr[i];
            arr[i]=temp;
            }
    }

    // to print insertion sort 

    public static void insrtion(Integer arr[]){

        for(int i=1; i<=arr.length; i++){
            int current =arr[i];
            int prev =i-1;
            while ( prev >=0 && arr[prev] > current) {

                arr[prev+1] = arr[prev];
                prev --;
                
            }
            arr[prev] =arr[current];
        }
    }

   
       /// to print parts 

       public static void printsort(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    /// to reverse element 
    public static void reversesort(Integer arr[]){
        for(int i=0; i<arr.length/2; i++){
            int temp =arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
    }
    public static void main(String[] args) {
        Integer arr[] ={8,1,6,3,0,4,2,5};
        //insrtion(arr);
        // System.out.print("print sorted parts = ");
        // insrtion(arr);
        //  printsort(arr);
        System.out.print("print sorted parts using bubble  = ");
        bublesort(arr);
        printsort(arr);
        reversesort(arr);
        System.out.print("print sorted parts using selections  = ");
        Selectins(arr);
        printsort(arr);
        reversesort(arr);
        System.out.print("print sorted parts inbuid in java  = ");
        Arrays.sort(arr);
        printsort(arr);

        //// java inbuild methods 
       System.out.print("reverse elemtnt in java = ");
       Arrays.sort(arr,Collections.reverseOrder());
       printsort(arr);
    //    Arrays.sort(arr,0,5,Collections.reverseOrder());
    //    printsort(arr);


        

        
    }
}
