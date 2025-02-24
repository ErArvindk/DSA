package Linklist;

public class doublylinkedlist {
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data =data;
            this.prev=null;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node nw =new Node(data);
        size++;
        if(head == null) {
            head =tail =nw;
            return;   
        }
        nw.next = head;
        head.prev = nw;
        head = nw;
    }
    public void toprint(){
        Node temp =head;
        System.out.print("Null <----> ");
        while (temp != null) {
            System.out.print(temp.data + " <----> ");
            temp =temp.next;
        }
        System.out.print("Null\n");

    }
    /// reverse a ddl;
    public void reerses(){
        Node curr=head;
        Node prev =null;
        Node next;
        while (curr !=null) {
            next =curr.next;
            curr.next =prev;
            curr.prev =next;
            prev =curr;
            curr=prev;
        }
        head =prev;
    }

    public static void main(String[] args) {
        doublylinkedlist dw =new doublylinkedlist();
        dw.addfirst(6);
        dw.addfirst(5);
        dw.addfirst(4);
        dw.addfirst(3);
        dw.addfirst(2);
        dw.addfirst(1);
        dw.toprint();
        System.out.println("size of linked list =  "+size);
        dw.reerses();
        dw.toprint();
    }
    
}
