package practics;
// to push the element in the button

import java.util.Scanner;
import java.util.Stack;

public class statckreverse {

      public static void pushbuttom(Stack <Integer> st ,int passbuttom){
            // base case 
            if (st.isEmpty()) {
                  st.push(passbuttom);
                  return ;
            }
            int top =st.pop();
            pushbuttom(st, passbuttom);
            st.push(top);

      }
      public static void main(String[] args) {
            Stack <Integer> st  =new Stack<>();
           Scanner sc =new Scanner(System.in);
           System.out.print("Enter your statck size = ");
           int input=sc.nextInt();
           for(int i=0; i<input; i++){
            int data =sc.nextInt();
            st.push(data);
           }
           System.out.print("Enter the button push the element  = ");
           int passbuttom =sc.nextInt();
           pushbuttom(st, passbuttom);
           System.out.println(st);

      }
      
}
