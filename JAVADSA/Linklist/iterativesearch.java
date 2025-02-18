package Linklist;


/*
 *  Q.  iterative search in linklist element return 1 / not element found -1;
 */

import java.util.Scanner;
public class iterativesearch {

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
    public static int size;

    public void addfirst(int data){
        Node nd = new Node(data);
        size++;

        if (head==null) {
            head =tail =nd;
            return;
            
        }
        nd.next=head;
        head=nd;
    }

    public void toprint(int data){
        Node nds =new Node(data);
        Node temp =head;
        int i=0;
        while ( temp !=null) {
           
                System.out.println("Your element are search = "+temp.data);  
            
           
           temp= temp.next;
           i++;
        }
        
            
        }


        public int iteraSearch(int key){
            Node temp = head;
            int i=0;
            while (temp != null) {
                if (temp.data==key) {
                    return i;
                    
                }
                temp = temp.next;
                i++;
                
            }
            return -1;
        }
    

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        iterativesearch rp =new iterativesearch();
        System.out.print("Enter your serch element = ");
         int test =sc.nextInt();
        rp.addfirst(12);
        rp.addfirst(120);
        rp.addfirst(124);
        rp.addfirst(126);
        rp.addfirst(128);
        rp.toprint(test);
         System.out.println(rp.iteraSearch(test));
    
        
    }
    
}
