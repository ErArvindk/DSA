package Linklist;

public class removecyclelist {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;

      public void printss(){
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            
        }
        System.out.print("Null");
      }
     
      public static boolean removecyc(){
       Node slow =head;
       Node fast =head;
       boolean cycle =false;
       while (fast !=null && fast.next != null) {
        slow = slow.next;
        fast =fast.next.next;
        if (slow == fast) {
            cycle =true;
            break;      
        }
        if (cycle == false) {
            return cycle ;
            
        }
        slow =head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
            
        }
        prev.next = null;
       }
       return cycle;

      }

    public static void main(String[] args) {
        head =new Node(1);
        head.next =new Node(2);
        Node temp =new Node(3);
        head.next.next =temp;
        head.next.next.next =new Node(4);
        head.next.next.next.next =temp;
        System.out.println(removecyc());

        
    }
    
}
