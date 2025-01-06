/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);

        while(head!=null)
        {
            ListNode next=head.next;
            pq.add(head);

            head.next=null;
            head=next;
        }

        ListNode dummy=new ListNode(0);
        ListNode output=dummy;

        while(!pq.isEmpty())
        {
            dummy.next=pq.poll();
            dummy=dummy.next;
        }

        return output.next;



    
        
    }
}