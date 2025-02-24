package Linklist;

public class cycledetection {
    static class Node{
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

    // public void addfirst(int data){
    //     Node nd = new Node(data);
    //     size++;

    //     if (head==null) {
    //         head =tail =nd;
    //         return;
            
    //     }
    //     nd.next=head;
    //     head=nd;
    // }

    // public void toprint(int data){
    //     Node nds =new Node(data);
    //     Node temp =head;
    //     int i=0;
    //     while ( temp !=null) {
           
    //             System.out.println("Your element are search = "+temp.data);  
            
           
    //        temp= temp.next;
    //        i++;
    //     }        
    //     }

        public static boolean cycledetect(){
            Node slow =head;
            Node fast =head;
            while (head !=null && head.next !=null) {
                slow=slow.next;
                fast=fast.next.next;
                if (slow ==fast) {
                    System.out.println("Cycledetect");
                    return true;
                    
                }
                
            }
            return false;   //// CYCLE DOES NOT EXIST
        }
    public static void main(String[] args) {
        cycledetection cs =new cycledetection();
        head = new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next =head;
    }
    
}
