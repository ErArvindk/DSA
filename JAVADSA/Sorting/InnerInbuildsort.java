package Sorting;

/**
 * InnerInbuildsort
 */
import java.util.Arrays;
import java.util.Collections;

import string.solutionsstrin;
public class InnerInbuildsort{



    public static void printss(Integer arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {8,2,4,5,6,7};
        Arrays.sort(arr);
        printss(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        printss(arr);
    }
    
}
