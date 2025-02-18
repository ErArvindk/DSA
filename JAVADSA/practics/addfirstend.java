package practics;

import java.util.*;

public class addfirstend {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;

        public void addf(int data){
            Node nd = new Node(data);
            if (head == null) {
                head =new Node(data);
                return;
            }
            nd.next=head;
            head=nd;
        }
        public void addend(int data){
            Node newb = new Node(data);
           Node temp = head;
           while (temp.next != null) {
             temp = temp.next;
           }
           temp.next = newb;
            
        }
        public void prints(){
            Node temp =head;
            while (temp !=null) {
                System.out.print(temp.data +" -> ");
                temp = temp.next;               
            }
            System.out.print("null\n ");
        }

        public static void main(String[] args) {
            addfirstend ad =new addfirstend();
           Scanner sc =new Scanner(System.in);
           System.out.print("Enter the size of list = ");
           int n=sc.nextInt();
           for(int i=0; i<n; i++){
            System.out.print("Enter your data = ");
            int data=sc.nextInt();
            ad.addf(data);
           }
           ad.prints();
            
        }
    
}
