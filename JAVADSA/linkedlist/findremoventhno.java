package Linklist;

public class findremoventhno {
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

    public void headss(int data){
        Node nd =new Node(data);
        size++;

        if (head==null) {
            head =tail=nd;
            return ;
            
        }

        nd.next=head;
        head =nd;
    
    
}
public void printls(int data){
    Node ns =head;
    int i=0;
    while (ns !=null) {
        System.out.print(ns.data+" ");
        ns=ns.next;
        i++;
    }
    System.out.println();
}

// public void toreverse(int data){
//     Node prev=null;
//     Node curr=head;
//     Node next;
//     while (curr != null) {
//       next=curr.next;
//       curr.next=prev;
//       prev =curr;
//       curr =next;  
//     }
//     head =prev;
// }



public void removenthelement(int n){
    /// to calculate the size;
    int size =0;
    Node temp =head;
    while (temp !=null) {
        temp =temp.next;
        size++; 
    }
    System.out.println(size);
    // tohead == size;
    if (n==size) {
        head =head.next;
        return; 
    }
    /// size -n +1;
    int i=1;
    int tofind=size-n-1;
    Node prev =head;
    while (i <= tofind) {
        prev =prev.next;
        i++;
        
    }

    prev.next = prev.next.next;
    return;

}

public static void main(String[] args) {
    findremoventhno fd =new findremoventhno();
    fd.headss(12);
    fd.headss(14);
    fd.headss(16);
    fd.headss(122);
    fd.headss(124);
    fd.headss(126);
    fd.printls(size);
    // System.out.println(size);
    // fd.toreverse(size);
    // fd.printls(size);
    int n=5;    // to last se delete in indext numbers 
    fd.removenthelement(n);
    fd.printls(size);

    
}
}
