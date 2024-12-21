package Array;

public class createarray {
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
     // public static void main(String[] args) {
    //     int Array[]={2,45,67,98};
    //     for (int i = 0; i < Array.length; i++) {
    //         System.out.print(Array[i]+" ");
    //     }
    // }
    public static void main(String[] args) {
        int array [] ={1,23,4,5};
        System.out.println(array); // to simple print any garbaj allocations in array 

        // single print
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        /// by loops
        int i=0;
        while (i<array.length) 
        {
            System.out.println(array[i]);
            i++;
            
        }

    }
}

   