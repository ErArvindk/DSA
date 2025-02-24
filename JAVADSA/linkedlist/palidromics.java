package Linklist;
/*
 * it is used to slow fast technics in cheak pelindromic linklist ;
 */

import java.util.Scanner;

public class palidromics {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public static Node head;

    public void headss(int data){
        Node nd =new Node(data);

        if (head==null) {
            head=nd;
            return ;
        }
        nd.next=head;
        head =nd;

        } 


    /// to linklist cheak palindromic 
    /*
     * three steps cheak palindromic linklist
     * 
     * 1. tofind midnode
     * 2.2nd half reverse 
     * 3. cheak if 1st half == 2nd half (left to right cheak )
     */

     //// steps first 
     public Node tofindMid(Node head){
        Node slow =head;
        Node fast =head;

        while (slow !=null && fast.next !=null) {
            slow =slow.next;
            fast =fast.next.next;
            
        }
        return slow;
     }

     /// step 2;
     public boolean cheakpalindromic(){
        // base case 
        if (head == null || head.next ==null) {
            return true;
            
        }

        //// flow 3 steps 

        // 1st steps to cheak mid Node
        Node midnode = tofindMid(head);

        /// 2nd steps to the reverse half linklist 

        Node prev=null;
        Node curr =midnode;
        while (curr !=null) {
          Node  next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        // 3rd steps to cheak half right and left list 
        Node right =prev;
        Node left =head;

        /// cheak if equal 

        while (right !=null) {
            if (left.data != right.data) {
                return false; 
            }
            left =left.next;
            right =right.next;
            
            
        }
        // finaly return 
        return true;
        
     }

     //// extra code to calculate the size
     
    public int calculate(){
        Node temp =head;
        int size =0;
        while (temp != null) {
            size ++;
            temp =temp.next;
        }
        return size;
    }


        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            palidromics p1 =new palidromics();
            // p1.headss(1);
            // p1.headss(2);
            // p1.headss(3);
            // p1.headss(2);

            // //to user input 
            int s =sc.nextInt();
            for(int i=0; i<s; i++){
                int n=sc.nextInt();
                p1.headss(n);
            }

            System.out.println(p1.cheakpalindromic());
            
        }
    
}
