package Linklist;

// import arraylist.basicofarraylist;

/**
 * Basiclinklist
 */
public class Basiclinklist {

    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    /* 

    all the work are create to methods 

    add();
    remove();
    print();
    search();
    */
    // public void addfirst(int data){

    //     Node.head =new Node(5);
    // }


  /// add first in linklist 
    public void headfirst(int data){
        Node nd =new Node(data);

        if (head ==null) {
            head =tail =nd;
            return;
            
        }
    nd.next=head; //link
    head =nd;

    }

    /// add last in linklist 

    public void tailadd(int data){
        Node nd =new Node(data);
        if (head==null) {
            head =tail= nd;
            return;
            
        }
        tail.next=nd;  // link
        tail =nd;

    }


    //// to add any index in value 
    public void toindexadd(int idx ,int data){
        Node nd =new Node(data);
        Node temp =head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
            
        }
        nd.next=temp.next;
        temp.next=nd;
    }

    /// mid find
    public void tomidfind(int data){
        Node slow =head;
        Node fast =head;
        while (head !=null && head.next !=null) {
            slow =head.next;
            fast=head.next.next;
            
        }
        System.out.println(slow);
    }

    /// to print linklist 
    public void toprint(int data){
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.data+" ---> ");
            temp = temp.next;
            
        }
        System.out.print("Null\n");

    }


    public static void main(String[] args) {
        Basiclinklist aa = new Basiclinklist();
        aa.headfirst(2);
        aa.headfirst(1);
        aa.tailadd(3);
        aa.tailadd(4);
        // aa.toprint(0);
        // aa.toindexadd(2, 250);
        // aa.toprint(0);
        aa.tomidfind(0);
        


        ///// to print single node 
    //    Node temp =head;
    //    System.out.println(temp.data);
     
    }

    
}