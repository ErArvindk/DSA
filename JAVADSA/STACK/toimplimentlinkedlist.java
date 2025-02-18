package STACK;

import java.util.Stack;

public class toimplimentlinkedlist {
     static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static Node head=null;

  /// empty cheak 
        public static boolean empty(){
            return head==null;
        }

        // push 
        public static void push(int data){
            Node nd =new Node(data);
            if (empty()) {
                head=nd;
                return;
            }
            nd.next=head;
            head =nd;
        }


        // pp 
        public static int pop (int data){
            if (empty()) {
                return -1;  
            }
            int top =head.data;
            head =head.next;
            return top;
        }

        public static int peek(int data){
            if (empty()) {
                return -1;
                
            }
            return head.data;
        }
        //// not working 
    //    public static void toprint(Node head){
    //     while (!empty()) {
    //         System.out.println(head.data);
    //    }

    // }
}
    public static void main(String[] args) {
        Stack  st =new Stack();
        st.push(12);
        st.push(14);
        st.push(16);
        st.push(18);
        st.push(20);
        while (!st.empty()) {
            System.out.print(st.peek()+" -- ");
            st.pop();
            
        }
      st.pop();
    
    }
    
    }

