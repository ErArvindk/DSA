package Linklist;

public class zigzaglinkedlist {

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //// to print 
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

    /// to add linkedlist in data 
    public void addfirst(int data){
        Node nd = new Node(data);
        if (head==null) {
            head=nd;
            return;
            
        }
        nd.next=head;
        head =nd;
    }

    public static Node head;
    // public  void zigzag(){
    //     // step 1.   midfind
    //     Node slow=head;
    //     Node fast=head;
    //     while (head !=null && head.next !=null) {
    //         slow =slow.next;
    //         fast =fast.next.next;
            
    //     }
    //     Node mid =slow;

    //     /// step 2nd.   to reerse

    //     Node curr=mid.next;
    //     mid.next =null;
    //     Node prev =null;
    //     Node next;
    //     while (curr !=null) {
    //         next =curr.next;
    //         curr.next =prev;
    //         prev =curr;
    //         curr =next;
    //     }

    //     Node left =head;
    //     Node right =prev;
    //     Node  nnnL ;
    //     Node  nextR;

    //     ///  step 3.. alt merge - zig-zag merge
    //     while (left !=null && right != null) {
    //         next =left.next;
    //         left.next =right;
    //         nextR =right.next;
    //         right.next= nnnL;
            
    //     }
    //     left =nnnL;
    //     right =nextR;


    // }
    public void zigzags() {
        if (head == null || head.next == null) {
            return; // List is empty or has only one node
        }
    
        // Step 1: Find the middle of the list
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node mid = slow;
    
        // Step 2: Reverse the second half of the list
        Node curr = mid.next;
        mid.next = null; // End the first half of the list
        Node prev = null;
        Node next;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node left = head;
        Node right = prev;
    
        // Step 3: Alternate merge - zigzag merge
        while (left != null && right != null) {
            Node nextL = left.next;
            Node nextR = right.next;
    
            left.next = right;
            right.next = nextL;
    
            left = nextL;
            right = nextR;
        }
        
        // Handle the case if there are remaining nodes in the first half
        if (left != null) {
            left.next = null;
        }
        
        // Handle the case if there are remaining nodes in the second half
        if (right != null) {
            right.next = null;
        }
    }
    
    public static void main(String[] args) {
        zigzaglinkedlist zg =new zigzaglinkedlist();
        zg.addfirst(1);
        zg.addfirst(2);
        zg.addfirst(3);
        zg.addfirst(4);
        zg.addfirst(5);
        zg.addfirst(6);
        zg.toprint(0);
        zg.zigzags();
        zg.toprint(0);
    }
    
}
