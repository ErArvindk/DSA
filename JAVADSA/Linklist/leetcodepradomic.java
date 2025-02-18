package Linklist;

import java.util.List;

public class leetcodepradomic {
    class  ListNode{
        int val;
        ListNode next; 
        public ListNode(int val){
            this.val=val;
            this.next=null;
        }

    }
    public static ListNode head;

    public void toadd( int val){
        ListNode nd =new ListNode(0);
        if (head == null) {
            head =nd =null;
            return ;
            
        }
        nd.next =head;
        head=nd;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow.next); // reverse second list
        slow.next = null;
        while(rev != null) {
            if(head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
    public static void main(String[] args) {
        leetcodepradomic ld =new leetcodepradomic();
        ld.toadd(1);
        ld.toadd(2);
        ld.toadd(2);
        ld.toadd(1);
        ld.isPalindrome(head);
        
    }
}