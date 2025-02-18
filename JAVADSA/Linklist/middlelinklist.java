package Linklist;

public class middlelinklist {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

        /// to create a head
        
        public static Node head;

        /// to create a tail

        public static Node tail;

        // to create a size of 
        public static int sizeof;

        public void addhead(int data){
            Node newnd =new Node(data);
            sizeof++;

            if (head ==null) {
                head =tail=newnd;
                return;
                
            }
            newnd.next=head;
            head=newnd;
        }

        public void tomid(){
            Node slow =head;
            Node fast =head;
            while (head !=null && head.next!=null) {
                slow =head.next;
                fast=head.next.next;
            }
        }

           /// to print linklist 
    public void toprint(int data){
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.data+" , ");
            temp = temp.next;
            
        }

    }


        public static void main(String[] args) {
            middlelinklist md =new middlelinklist();

            md.addhead(12);
            md.addhead(14);
            md.addhead(15);
            md.addhead(17);
            md.toprint(sizeof);

            System.out.println("\nsize of linkedlist = "+sizeof);
            
            // Node st =head;
            // System.out.println(st.data);
           

        }
        
    
}
