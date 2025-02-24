package Linklist;

public class torevesionslist {

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


      /// to add first
      public void toaddfirst(int data){
            Node nd =new Node(data);
            if (head==null) {
                  head=tail=nd;
                  return;
                  
            }
            nd.next=head;
            head=nd;
      }
      public void toaddlast(int data){
            Node nd =new Node(data);
            if (head==null) {
                  head=tail=nd;
                  return;
                  
            }
            tail.next=nd;
            tail=nd;

      }

      
}
