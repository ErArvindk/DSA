package Linklist;

  class ListNode {
            int val;
            ListNode next;
            ListNode(int val) { this.val = val; }
        }
public class mergetwolist{
        
        public class MergeLinkedLists {
            public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
                ListNode dummy = new ListNode(-1);
                ListNode current = dummy;
        
                while (l1 != null && l2 != null) {
                    if (l1.val <= l2.val) {
                        current.next = l1;
                        l1 = l1.next;
                    } else {
                        current.next = l2;
                        l2 = l2.next;
                    }
                    current = current.next;
                }
        
                if (l1 != null) {
                    current.next = l1;
                } else {
                    current.next = l2;
                }
        
                return dummy.next;
            }
        
            public static void printList(ListNode node) {
                while (node != null) {
                    System.out.print(node.val + " ");
                    node = node.next;
                }
            }
        
            public static void main(String[] args) {
                ListNode l1 = new ListNode(1);
                l1.next = new ListNode(3);
                l1.next.next = new ListNode(5);
        
                ListNode l2 = new ListNode(2);
                l2.next = new ListNode(4);
                l2.next.next = new ListNode(6);
        
                ListNode mergedList = mergeTwoLists(l1, l2);
                printList(mergedList);
            }
        }
            public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
                ListNode dummy = new ListNode(-1);
                ListNode current = dummy;
        
                while (l1 != null && l2 != null) {
                    if (l1.val <= l2.val) {
                        current.next = l1;
                        l1 = l1.next;
                    } else {
                        current.next = l2;
                        l2 = l2.next;
                    }
                    current = current.next;
                }
        
                if (l1 != null) {
                    current.next = l1;
                } else {
                    current.next = l2;
                }
        
                return dummy.next;
            }
        
            public static void printList(ListNode node) {
                while (node != null) {
                    System.out.print(node.val + " ");
                    node = node.next;
                }
            }
        
            public static void main(String[] args) {
                ListNode l1 = new ListNode(1);
                l1.next = new ListNode(3);
                l1.next.next = new ListNode(5);
        
                ListNode l2 = new ListNode(2);
                l2.next = new ListNode(4);
                l2.next.next = new ListNode(6);
        
                ListNode mergedList = mergeTwoLists(l1, l2);
                printList(mergedList);
            }
        }