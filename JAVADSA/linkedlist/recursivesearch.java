package Linklist;

public class recursivesearch {

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
        public static int  size;


        /// to aadd the data of head 

        public void addhead(int data){
            Node nd =new Node(data);
            size++;

            if (head==null) {

                head=tail=nd;
                return;
                
            }
            nd.next=head;
            head=nd;

        }

        //// to print of linkedlist 

        public void printt(int data){
            Node temp=head;
            while (temp !=null) {
                System.out.print(temp.data +" ");
                temp=temp.next;
                
            }
        }

        //////   
        public int helper(Node head ,int key){
            if (head == null) {
                return -1;
                
            }
            if (head.data == key ) {
                return 0;
                
            }
            int idx=helper(head.next, key);
            if (idx == -1) {
                return -1;
                
            }
            return idx+1;
        }
  /// to recursive in linklist 
        public int recursivess(int key){
            return helper(head,key);
        }

       public static void main(String[] args) {
        recursivesearch rc =new recursivesearch();
        rc.addhead(122 );
        rc.addhead(124 );
        rc.addhead(126);
        rc.addhead(128);
        rc.addhead(132);
        rc.addhead(134);
        rc.addhead(136);
        System.out.println(rc.recursivess(134));
        System.out.println(rc.recursivess(144));
       }
}
