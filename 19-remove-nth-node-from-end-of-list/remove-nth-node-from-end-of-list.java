class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Calculate the size of the linked list
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Calculate the position of the node to remove (1-based index)
        int pos = size - n;

        // If the node to remove is the head
        if (pos == 0) {
            return head.next;
        }

        // Traverse to the node just before the one to remove
        ListNode curr = head;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }

        // Remove the nth node from the end
        if (curr.next != null) {
            curr.next = curr.next.next;
        }

        return head;
    }
}
