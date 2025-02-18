package STACK;

import java.util.Stack;

public class Histogramproblem {

      //// histogram problem to solve o(n) time complexity 


      public static void tofindmaxvalue(int arr []){
            int max =0;
            int newl []=new int[arr.length];
            int newr []=new int[arr.length];


            Stack<Integer> s =new Stack<>();

            //// right smaller number 
            for(int i=arr.length-1; i>=0; i--){

                  // Steps 1. while 
                  while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                        s.pop();
                        
                  }
                  // steps- 2,
                  if (s.isEmpty()) {
                        newr[i] =arr.length;
                  }
                  else{
                        newr [i] =s.peek();
                        /// top
                  }
                  s.push(i);
            }

            /// left smaller number 

            s =new Stack<>();    /// to  create stack is empty;
            for(int  i=0; i<=arr.length-1; i++){

                  // Steps 1. while 
                  while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                        s.pop();
                        
                  }

                  // steps- 2,
                  if (s.isEmpty()) {
                        newl[i] =-1;
                  }
                  else{
                        newl [i] =s.peek();
                  }
                  s.push(i);
            }

            //// current area : width =j-i-1 =nsr [i]-nsr[i]-nsl[i]-1;

            for(int i=0; i<arr.length; i++){
            int heght=arr[i];
            int weigth = newr[i]-newl[i]-1;
            int currarea =heght*weigth;
            max=Math.max(currarea, max);
            }
            System.out.println(max);
      }
      public static void main(String[] args) {
            int arr []={2,1,5,6,2,3};
            tofindmaxvalue(arr);
      }
      
}
