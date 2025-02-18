package STACK;

import java.util.Stack;

public class stockspanproblem {

      public static void stockspanp(int Stock[],int span[]){
            Stack <Integer> sd =new Stack<>();
            span[0]=1;
            for(int i=0; i<Stock.length; i++){
                  int currprice =Stock[i];
                  while (!sd.isEmpty() && currprice > Stock[sd.peek()]) {
                        sd.pop();
                        
                  }
                  if (sd.isEmpty()) {
                        span[i]=i+1;
                  }
                  else{
                        int prevhigh =sd.peek();
                        span[i]=i-prevhigh;
                  }
                  sd.push(i);
            }
      }
      public static void main(String[] args) {
            int Stock[]={100,80,60,70,60,85,100};
            int span[]=new int[Stock.length];
            stockspanp(Stock, span);
            for(int i=0; i<span.length; i++){
                  System.out.print(span[i]+" ");
            }

      }
      
}
