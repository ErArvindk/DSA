package leetcode;

import java.util.Stack;

public class nextgreaterelementstack {

      public int[] nextGreaterElements(int[] nums) {
            Stack <Integer> s =new Stack<>();

            int nextgreter[] =new int[nums.length];

            for(int i=nums.length-1; i>=0; i--){

                  // Steps 1. while 
                  while (!s.isEmpty() && nums[s.peek()] <= nums[i]) {
                        s.pop();
                        
                  }

                  // steps- 2,
                  if (s.isEmpty()) {
                        nextgreter[i] =-1;
                  }
                  else{
                        nextgreter [i] =nums[s.peek()];
                  }
                  s.push(i);
            }
            return nextgreter ;

            /// to print 
             
      }

      public static void main(String[] args) {
            int nums [] = {1,2,1};
            nextgreaterelementstack nd =new nextgreaterelementstack();
            nd.nextGreaterElements(nums);


            for(int i=0; i<nums.length; i++){
                  System.out.print(nums[i]+" ");
            }
      }
}

