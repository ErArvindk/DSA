package practics;

/**
 * midpointlink
 */
public class midpointlink {
      static class Node{
            int data;
            Node next;
            public Node(int data){
                  this.data=data;
                  this.next=null;
            }

      }
      public static Node head;
      public static int size;

      public static void topush(int data){
            Node nd =new Node(data);
            size++;
            if (head ==null) {
                  head=nd;
                  return;
                  
            }
            nd.next=head;
            head=nd;

      }

    
      // public static Node  tomidfind(int data){
      //       Node slow =head;
      //       Node fast =head;
      //       while (head !=null && head.next !=null) {
      //           slow =head.next;
      //           fast=head.next.next;
                
      //       }
      //      return slow;
      //   }



      public void toindexadd(int size,int data){
           Node nd =new Node(data);
           int idx =size/2;
            Node temp =head;
            int i=0;
            while (i<idx-1) {
                temp=temp.next;
                i++;
                
            }
            nd.next=temp.next;
            temp.next=nd;
        }

        public static void toprint(){
            Node temp =head;
            while (temp != null) {
                  System.out.print(temp.data+" ");
                  temp=temp.next;
                  
            }
            System.out.print("Null \n");
        }
      public static void main(String[] args) {
            midpointlink md =new midpointlink();
            md.topush(2);
            md.topush(20);
            md.topush(29);
            md.topush(22);
            md.topush(23);
            md.topush(24);
            md.toprint();
            md.toindexadd(size ,34);
            md.toprint();
           
      }
}
