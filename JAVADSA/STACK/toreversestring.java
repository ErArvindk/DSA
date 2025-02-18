package STACK;

import java.util.Stack;

public class toreversestring { 
      public static String reversestring(String str){
            Stack <Character> s =new Stack<>();
            int idx =0;
            while (idx <str.length()) {
                  s.push(str.charAt(idx));
                  idx++;
                  
            }
            StringBuffer result = new StringBuffer();
            while (!s.empty()) {
                  char curr =s.pop();
                  result.append(curr);
                  
            }
            return result.toString();

      }
      public static void main(String[] args) {
            String str = "hello";
             String resultsf = reversestring(str);
             System.out.println(resultsf);  

      }
      
}
