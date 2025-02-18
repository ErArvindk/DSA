package Linklist;

import array.palindromarra;
import string.solutionsstrin;

public class removefirstandlast {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int  size;


        /// to aadd the data of head 

        public void addhead(int data){
            Node nd =new Node(data);
            size++;

            if (head==null) {

                head=tail=nd;
                return;
                
            }
            nd.next=head;
            head=nd;

        }

        //// to print of linkedlist 

        public void printt(int data){
            Node temp=head;
            while (temp !=null) {
                System.out.print(temp.data +" ");
                temp=temp.next;
                
            }
        }

        /// To remove the data in linklist 

        public  int removelist(int data){
            if (size==0) {
                System.out.println("List is empty ");
                return Integer.MIN_VALUE;
                
            }else if (size == 1) {
               int  value =head.data;
                head =tail =null; 
                size=0;
                return value;
                
            }
            int value =head.data;
            head =head.next;
            size--;
            return value;
        }


        /// to remove last in linklist 
        public int removelast(int data){
             // best case ;
            if (size==0) {
                System.out.println("enpty linklist ");
                return Integer.MIN_VALUE;   
                 
            }
            else if (size == 1) {
                int val =head.data;
                head =tail =null;
                return val;  
            }
            /// removed last 
            Node prev = head;
            for(int i=0; i<size-2; i++){
                prev =prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size --;
            return val;
            
        }
    
    public static void main(String[] args) {
        removefirstandlast rm =new removefirstandlast();
        rm.addhead(12);
        rm.addhead(13);
        rm.addhead(14);
        rm.addhead(122);
        rm.addhead(124);
        rm.addhead(220);
        rm.addhead(240);
        System.out.print("TO print your linklist element = ");
        rm.printt(size);

        System.out.println("\nSize of  linklist of = "+size);
        rm.removelist(5);
        System.out.print("TO print your linklist element = ");
        rm.printt(size);
        System.out.println("\nSize of  linklist of = "+size);
        rm.removelast(size);
        System.out.print("TO print your linklist element = ");
        rm.printt(size);
        System.out.println("\nSize of  linklist of = "+size);
        

    }
}
