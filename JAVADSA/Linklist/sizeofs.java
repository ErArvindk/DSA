package Linklist;

public class sizeofs {

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

    public void addhead(int data){
        Node newnd =new Node(data);
        size++;

        if (head ==null) {
            head =tail=newnd;
            return;
            
        }
        newnd.next=head;
        head=newnd;
    }



    public void toprint(int data){
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.data+" , ");
            temp = temp.next;
            
        }

    }
    public static void main(String[] args) {
        sizeofs sg =new sizeofs();
        sg.addhead(12);
        sg.addhead(14);
        sg.addhead(16);
        sg.addhead(38);
        sg.toprint(size);

        System.out.println("\nyour linklist size of = "+size);
        
    }
    
}
