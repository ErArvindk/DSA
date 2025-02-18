package practics;

import java.util.ArrayList;
import java.util.Scanner;

public class statckspractics {
    static class stacks{
        static ArrayList <Integer> list =new ArrayList<>();
        
        public static boolean empty( ){
            return list.size()==0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        /// pop 
        public static int pop(int data){
            int top =list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        /// prints statcks 
        public static void prints(int data){
            System.out.println(list);
        }

    }
    public static void main(String[] args) {
        stacks st =new stacks();
        Scanner sc =new Scanner(System.in);
        int n=5;
        for(int i=0; i<n; i++){
            int data=sc.nextInt();
            st.push(data);
        }
        st.prints(n);
        st.pop(n);
        st.prints(n);
        
    }
    
}
