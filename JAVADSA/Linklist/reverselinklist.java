package Linklist;

public class reverselinklist {

    class Node{
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

//// to add head in linklist ;
    public void Toadd(int data){
        Node nd =new Node(data);

        if (head==null) {
            head=tail=nd;
            return;
            
        }

        nd.next =head;
        head =nd;
    }

    public void Toprint(){
        Node temp=head;
        int i=0;
        while (temp !=null) {
            System.out.print(temp.data +" -> ");
            temp=temp.next;
            i++;
            
        }
        System.out.print("Null");
    }

    //// To reverse 
    public void Toreverse(){
       Node prev =null;
       Node curr =tail =head;
       Node next;
       while (curr !=null) {
        next =curr.next;
        curr.next =prev;
        prev =curr;
        curr =next;
        
       }
       head =prev;


    }

    //// Main Methods 
    public static void main(String[] args) {
        reverselinklist rc =new reverselinklist();
        rc.Toadd(12);
        rc.Toadd(14);
        rc.Toadd(16);
        rc.Toadd(18);
        rc.Toadd(20);
        rc.Toadd(22);
        rc.Toadd(24);
        System.out.print("list print ......... = ");
        rc.Toprint();
        System.out.print("\nreverse list print ..... = ");
        rc.Toreverse();
        rc.Toprint();
    }
    
}
