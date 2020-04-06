public class DeleteAtHead{
    /**
     * Given a singly-linked list, write a method to delete the first node of the list and return the new head.
     * Example:
        LinkedList: 1->2->3 , Head = 1
        deleteAtHead(Head) ==> 2->3
     */
    public ListNode deleteAtHead(ListNode head) {
        return (head != null) ? head.next : null;
    }
}