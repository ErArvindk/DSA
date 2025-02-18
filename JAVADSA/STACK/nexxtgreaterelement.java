package STACK;

import java.util.Stack;

public class nexxtgreaterelement {
      public static void main(String[] args) {
            int arr[]={6,8,0,1,3};
            Stack <Integer> s =new Stack<>();

            int nextgreter[] =new int[arr.length];

            for(int i=arr.length-1; i>=0; i--){

                  // Steps 1. while 
                  while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                        s.pop();
                        
                  }

                  // steps- 2,
                  if (s.isEmpty()) {
                        nextgreter[i] =-1;
                  }
                  else{
                        nextgreter [i] =arr[s.peek()];
                  }
                  s.push(i);
            }


            /// to print 
            for(int i=0; i<nextgreter.length; i++){
                  System.out.print(nextgreter[i]+" ");
            }

            /// next greter Right;   already
            // next greater Left ;   loop start i =0;
            // next smaller Right;   conditions reverse (arr[s.peek()] <= arr[i]))
            // next smaller Left; (loop start i=o; and condiontion arr[s.peek()] <= arr[i]))



          
      }
      
}
