package practics;

public class removeanylist {
    class ListNode {
        int val;
        ListNode next;
       public ListNode(int val){

        this.val =val;
        this.next=null;
       }
    }
    public static ListNode head;

    public void toadd(int val){
        ListNode nd =new ListNode(val);
        if (head == null) {
            head =nd =null;
          return;
            
        }
        nd.next=head;
        head=nd;
    }

        public ListNode removeElements(ListNode head, int val) {
            while (head != null && head.val ==val) {
                head =head.next; 
            }
            ListNode current =head;
            while ( current != null && current.next != null) {
                if (current.next.val == val) {
                   
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            
            return head;
        }

        public void toprint(){
            ListNode temp =head;
            while (temp !=null) {
                System.out.print(temp.val + " ---> ");
                
            }
            System.out.print("NUll");
        }
        public static void main(String[] args) {
            removeanylist em =new removeanylist();
            em.toadd(12);
            em.toadd(122);
            em.toadd(123);
            em.toadd(121);
            em.toadd(10);
            em.toadd(9);
            em.toprint();
            em.removeElements(head, 3);
        }
           
    }
