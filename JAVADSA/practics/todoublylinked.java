package practics;

//// to the precticss of linkedlist code practics in head add and tail add 
public class todoublylinked {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }

    public static Node head;
    public static Node tail;

    public void toaddhead(int data){
        Node nds =new Node(data);
        if (head == null) {
            head =nds =null;
            return ;
            
        }
        nds.next =head;
        head =nds;
    }

    public void toaddtail(int data){
        Node ts =new Node(data);
        if (head == null) {
            head = tail =ts =null;
            return ;
            
        }

        tail.next =ts;
        ts=tail;
    }

    // public Void doublelist(int data){
    //     Node nd =new Node(data);

    // }

    public void toprintss(int data){
        Node temp =head;
        int i=0;
        while (temp != null) {
            System.out.print(temp.data +" ---> ");
              temp = temp.next;
              i++;
        }
        System.out.print(" Null ");
    }

    public static void main(String[] args) {
        todoublylinked td =new todoublylinked();
        td.toaddhead(12);
        td.toaddhead(123);
        td.toaddhead(124);
        td.toaddhead(36);
        td.toprintss(0);
        td.toaddtail(134);
        td.toprintss(0);
    }
    
}
