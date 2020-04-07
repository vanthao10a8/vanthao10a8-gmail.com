
public class FindMiddleNode {
    /**
     * Given a Singly-Linked List, 
     * write a method - findMiddleNode that finds and returns the middle node of the list in a single pass.
     */
    public ListNode findMiddleNode(ListNode head) {
        //Solution 1:
            // if(head == null)
            //     return null;
            // int count = 0, i = 0;
            // ListNode temp = head;
            // while(temp.next != null){
            //     count++;
            //     temp = temp.next;
            // }
            // while(i != count / 2){
            //     i++;
            //     head = head.next;
            // }
            // return head;
        //Solution 2:
        if(head == null)
            return null;
        ListNode slowNode = head;
        ListNode fastNode = head;
        while(fastNode.next != null && fastNode.next.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }
}