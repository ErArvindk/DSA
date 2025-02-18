package STACK;

import java.util.ArrayList;

public class basicstack {
    static class stack{
       static ArrayList  <Integer> list =new ArrayList<>();

       /// to create 4 methods 


       /// if list is empty 
       public static boolean isEmpty(){
        return list.size() == 0;
       }

       ///push
       public static void push(int data){
        list.add(data);

       }

       ///pop
       public static int pop(){
        int top = list.get(list.size()-1);   /// last value ko access

        list.remove(list.size()-1);    /// to remove last element 
        return top;
       }

       //// peek 

       public static int peek (){
           return list.get(list.size()-1); // to top return 
       }
 
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
      }
    
}
