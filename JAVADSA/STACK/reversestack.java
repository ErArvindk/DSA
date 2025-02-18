package STACK;
/**
 * reversestack
 */
import java.util.Stack;
public class reversestack {

      public static void pushbuttom(Stack<Integer> sd ,int n){
            if (sd.isEmpty()) {
                  sd.push(n); 
                  return ;                 
            }
           
            int top =sd.pop();
            pushbuttom(sd,n);
            sd.push(top);
      }

      public static void reverse(Stack <Integer> sd ){
            // base case
            if (!sd.isEmpty()) {
                 return;
                  
            }
            int top =sd.pop();
            reverse(sd);
            pushbuttom(sd, top);
     
} 

public static void toprint(Stack <Integer> sd){
      while (!sd.isEmpty()) {
            System.out.print(sd.pop()+" ");
            
      }
      System.out.println();
}
      public static void main(String[] args) {
            Stack <Integer> sd = new Stack<>();
            sd.push(1);
            sd.push(2);
            sd.push(3);
            reverse(sd);
            toprint(sd);

      }
}