package STACK;

/**
 * Innerpushatbuttoms
 */

import java.util.*;
public class pushatbuttoms {

    /// Q.  to push the element in buttom;

    public static void pushbotttom(Stack <Integer> st ,int n){
        if (st.isEmpty()) {
            st.push(n);
            return;
            
        }

        int top =st.pop();
        pushbotttom(st, n);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        pushbotttom(st, 4);
        // while (!st.isEmpty()) {
        //     System.out.println(st.pop());
            
        // }
        System.out.println(st);

    }
}