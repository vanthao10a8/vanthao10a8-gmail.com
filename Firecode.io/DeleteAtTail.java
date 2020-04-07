public class DeleteAtTail{
    /**
     * Given a singly-linked list, write a method to delete its last node and return the head.
        Example:
            1->2->3->4 ==> 1->2->3
     */

    public ListNode deleteAtTail(ListNode head) {
        if(head == null || head.next == null) return null;
        // Find the second last node 
        ListNode second_last = head; 
        while (second_last.next.next != null) 
            second_last = second_last.next; 
        // Change next of second last 
        second_last.next = null; 
        return head;
}
}