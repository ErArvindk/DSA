package Linklist.collectindlist;

import string.solutionsstrin;

/**
 * mergesortlinkedlist
 */
public class mergesortlinkedlist {
 //// to create linkedlist class
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;

    public void addfirst(int data){
        Node nd = new Node(data);
        if (head==null) {
            head=nd;
            return;
            
        }
        nd.next=head;
        head =nd;
    }
   /// to find mid value 
    private Node getMid(Node head){
        Node slow =head;
        Node fast =head.next;
        while (fast !=null && fast.next !=null) {
            slow =slow.next;
            fast =fast.next.next; 
        }
        return slow;  // mid node
     }
     private Node merge(Node head1 , Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
         /// loops h1 & h2 data compare ;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next =head1;
                head1 =head1.next;
                temp = temp.next;    
            }
            else{
                temp.next = head2;
                head2 =head2.next;
                temp =temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp =temp.next;    
        }
        while (head2 != null) {
            temp.next =head2;
            head2 =head2.next;
            temp =temp.next;   
        }
        return mergedll.next;
     }
     /// to use merge sort 
     public Node mergesorts(Node head){
        if (head ==null || head.next == null) {
            return head;
            
        }
        // find mid
        Node mid =getMid(head);
        // left & right ms
        Node righthead = mid.next;
        mid.next = null;
        Node newleft =mergesorts(head);
        Node newright =mergesorts(righthead);
        return merge(newleft,newright);

     }
      public void toprint(int data){
        Node nds =new Node(data);
        Node temp =head;
        int i=0;
        while ( temp !=null) {
           
                System.out.print(temp.data+" ---> ");  
           temp= temp.next;
           i++;
        }    
        System.out.print("Null\n");    
    }

    public static void main(String[] args) {
        mergesortlinkedlist mg =new mergesortlinkedlist();
        mg.addfirst(12);
        mg.addfirst(2);
        mg.addfirst(24);
        mg.addfirst(22);
        mg.addfirst(124);
        mg.toprint(0);
        
        mg.head = mg.mergesorts(mg.head);
        mg.toprint(0);
    }
}