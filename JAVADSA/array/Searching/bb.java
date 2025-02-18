package array.Searching;

import java.security.Key;

public class bb {

        public static int calls(int array[] ,int key){
            int start =0 , end =array.length-1;
            while (start<=end) {
                int mid = start+(end-start)/2;
                if (array[mid]==key) {
                    return mid;
                    
                }
                if (array[mid] < key) {
                    start = mid+1;
                    
                }
                else{
                    end=mid-1;
                }
    
                
            }
            return  -1;
    
        }
    
        public static void main(String[] args) {
            int array[] = {8,1,4,3,2,6,7};
            int key=7;
    
            int number =calls(array, key);
    
            /*
             * if else condition used 
             */
            if(number ==-1) {
                System.out.println( "Key  not found ");
            }else{
                System.out.println("print the index number  = " +number+ " and key is =  " + key);

            }
    
        }
    
        
    }
