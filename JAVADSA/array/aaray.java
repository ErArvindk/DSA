package array;

  /// it is a  traditional approach, then to stire any value we need to create any variables

    /// similarly to store 1000 values we need to create 1000 variables 

     /*
     * what is array 
     * 
     * it refer to indext collection of fixed number of homogeneous data element 
     * it is single variable holding multiple values which imprives readability of the program.
     * 
     * Ex. 
     * int array[]={1,2,4,5,6,43,5};
     * 
     * 
     * array declaration---
     * 1.   1-dimensional array 
     * 2.   2-dimensional array
     * 3.   jugged array 
     */
    

public class aaray {
    public static void main(String[] args) {
        int array [] ={1,23,4,5};
        int arr[] =new int[6];
        System.out.println(array); // to simple print any garbaj allocations in array 

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        int i=0;
        while (i<array.length) 
        {
            System.out.println(array[i]);
            i++;
            
        }

    }

  
    
}
