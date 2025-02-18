package array.questions;
/*
 * time compleity =o(n)
 * space complexity =O(1) // constant 
 */

import array.aaray;

public class revelrsar {

    public static void printss(int array[]){
        for (int j=0; j<array.length; j++){
                    System.out.print(array[j] +" ");
                }
                System.out.println();
            }


    public static void reverse(int array[]){

        for(int i=0; i<array.length/2; i++){

           //  swaping

            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1]=temp;
  
        }
    }
    public static void main(String[] args) {
        int array[] ={1,2,3,4,5,6,7,8};
        reverse(array);
        printss(array);


    //     for(int i=0; i<array.length/2; i++){
    //         /* reverse array condition allow to swapping 

    //         */
    //         int temp =array[i];
    //         array[i]=array[array.length-i-1];  // swaping me space complexity constant rahta hai 
    //         array[array.length-i-1]=temp;

    //     }
    //     System.out.print("print after Swapping this array = ");
    //     for (int j=0; j<array.length; j++){
    //         System.out.print(array[j] +" ");
    //     }
    //     System.out.println();
    // }
    
}
}
