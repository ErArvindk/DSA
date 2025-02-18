import java.util.LinkedList;

public class implimentlist {

      static class Node{
            int data;
            Node  next;
            Node(int data){
                  this.data=data;
                  this.next=null;
            }
      }
        static class Queue{
            static Node head=null;
            static Node tail=null;
          
            public static boolean isempty(){
                  return head==null & tail == null;
            }
      
            /// to add 
            public static void toadd(int data){
                  Node newnode =new Node(data);
      
                  if (head==null) {
                        head=tail=newnode;
                        return;
                        
                  }
                  tail.next = newnode ;
                  tail=newnode;
            }
      
            public static int toremove(){
      
                  if (isempty()) {
                        System.out.println("queue is empty ");
                        return -1;   
                  }
                  int front =head.data;
                  if (tail==head) {
                        tail =head=null;
                  }else{
                        head= head.next;
                  }
                  return front;
      
            }
      
            public static int peek(){
                  if (isempty()) {
                        System.out.println("queue is empty ");
                        return -1;
                        
                  }
                  return head.data;
            }
        }
        public static void main(String[] args) {
            Queue q =new Queue();
            q.toadd(1);
            q.toadd(2);
            q.toadd(3);
            
      
            //// to work circular queue 
      
            // System.out.println(q.toremove());
            // q.toadd(4);
            // System.out.println(q.toremove());
            // q.toadd(5);
            // q.toadd(6);
      
            /// to print 
            while (!q.isempty()) {
                  System.out.println(q.peek());
                  q.toremove();     
            }   
        }
      }

      //   public static void main(String[] args) {
      //       Queue <Integer> qs =new LinkedList<>();
      //   }
      
      // }
