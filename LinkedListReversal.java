/**
 * Linked List Reversal - Common Interview Problem
 * 
 * Problem: Reverse a singly linked list
 * Example: 1->2->3->4->5 becomes 5->4->3->2->1
 * 
 * Approach: Iterative with three pointers
 * 1. Keep track of previous, current, and next nodes
 * 2. Reverse links one by one
 * 3. Move pointers forward
 * 
 * Time Complexity: O(n) where n is number of nodes
 * Space Complexity: O(1) - in-place reversal
 * 
 * Alternative Approaches:
 * 1. Recursive solution - O(n) time, O(n) space due to call stack
 * 2. Stack-based solution - O(n) time, O(n) space
 * 
 * Interview Tips:
 * - Discuss handling edge cases (empty list, single node)
 * - Mention maintaining head/tail references
 * - Consider doubly linked list variation
 */
public class LinkedListReversal {
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        
        return prev;
    }
    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.println("Original linked list:");
        printList(head);
        
        head = reverseList(head);
        
        System.out.println("Reversed linked list:");
        printList(head);
    }
}
